package patterns.structure.proxy.dynamicProxy.cglib;

import org.springframework.cglib.proxy.Enhancer;

/**
 * @author fengsy
 * @date 1/20/21
 * @Description
 */
public class CglibProxyFactory {
    public static Object getProxy(Class<?> clazz) {
        // 创建动态代理增强类
        Enhancer enhancer = new Enhancer();
        // 设置类加载器
        enhancer.setClassLoader(clazz.getClassLoader());
        // 设置被代理类
        enhancer.setSuperclass(clazz);
        // 设置方法拦截器
        enhancer.setCallback(new DebugMethodInterceptor());
        // 创建代理类
        return enhancer.create();
    }

    public static void main(String[] args) {
        AliSmsService service = (AliSmsService)CglibProxyFactory.getProxy(AliSmsService.class);
        service.send("msg sending");
    }
}
