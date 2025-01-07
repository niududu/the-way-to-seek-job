package leetCode.proxy;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import java.lang.reflect.Method;

/**
 * @Description:
 * @Author: LiuZW
 * @CreateDate: 2024/10/16 23:27
 * @Version: 1.0
 */


// 目标类
class RealSubject1 {
    public void request() {
        System.out.println("Executing request in RealSubject.");
    }
}

// CGLIB 代理拦截器
class CglibProxyHandler implements MethodInterceptor {
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("Before method execution");
        Object result = proxy.invokeSuper(obj, args);
        System.out.println("After method execution");
        return result;
    }
}

public class CglibProxyDemo {
    public static void main(String[] args) {
        // 使用 CGLIB 动态创建代理对象
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(RealSubject1.class);
        enhancer.setCallback(new CglibProxyHandler());

        // 创建代理对象
        RealSubject1 proxy = (RealSubject1) enhancer.create();
        proxy.request();
    }
}

