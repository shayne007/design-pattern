package designpattern.projectsInAction.idempotence.usage.server;

import designpattern.projectsInAction.idempotence.v2.Idempotence;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @author fengsy
 * @date 7/7/21
 * @Description
 */

// 在AOP切面中处理幂等
@Aspect
public class IdempotenceSupportAdvice {
    @Autowired
    private Idempotence idempotence;

    @Pointcut("@annotation(designpattern.projectsInAction.idempotence.usage.server.IdempotenceRequired)")
    public void controllerPointcut() {
    }

    @Around(value = "controllerPointcut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        // 从HTTP header中获取幂等号idempotenceId
        String idempotenceId = (String) getRequest().getAttribute("idempotenceId");
        // 前置操作
        boolean savedSucess = idempotence.saveIfAbsent(idempotenceId);
        if (!savedSucess) {
            // 两种处理方式：
            // 1. 查询order，并且返回；
            // 2. 返回duplication operation Exception
            throw new Exception("duplication operation Exception");
        }

        Object result = joinPoint.proceed();
        return result;
    }

    private HttpServletRequest getRequest() {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        return request;
    }
}