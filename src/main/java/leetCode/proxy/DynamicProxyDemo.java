package leetCode.proxy;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Description:
 * @Author: LiuZW
 * @CreateDate: 2024/10/16 23:22
 * @Version: 1.0
 */


// 接口
interface Subject {
    void request();
}

// 目标类
class RealSubject implements Subject {
    public void request() {
        System.out.println("Executing request in RealSubject.");
    }
}

// 动态代理处理器
class DynamicProxyHandler implements InvocationHandler {
    private Object target;

    public DynamicProxyHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Before method execution");
        Object result = method.invoke(target, args);
        System.out.println("After method execution");
        return result;
    }
}

public class DynamicProxyDemo {
    public static void main(String[] args) {
        // 创建目标对象
        RealSubject realSubject = new RealSubject();

        // 创建动态代理
        Subject proxyInstance = (Subject) Proxy.newProxyInstance(
                realSubject.getClass().getClassLoader(),
                realSubject.getClass().getInterfaces(),
                new DynamicProxyHandler(realSubject));


        // 调用代理对象的方法
        proxyInstance.request();
    }
}

