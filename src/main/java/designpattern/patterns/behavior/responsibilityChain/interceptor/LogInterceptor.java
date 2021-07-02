package designpattern.patterns.behavior.responsibilityChain.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 定义的拦截器会被加入到HandlerExecutionChain中执行
 *
 * @author fengsy
 * @date 7/2/21
 * @Description
 */

public class LogInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("拦截客户端发送来的请求.");
        return true; // 继续后续的处理
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("拦截发送给客户端的响应.");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("这里总是被执行.");
    }
}

////在Spring MVC配置文件中配置interceptors
//<mvc:interceptors>
//<mvc:interceptor>
//<mvc:mapping path="/*"/>
//<bean class="com.xzg.cd.LogInterceptor" />
//</mvc:interceptor>
//</mvc:interceptors>