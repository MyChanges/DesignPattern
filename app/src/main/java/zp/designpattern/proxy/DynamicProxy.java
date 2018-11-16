package zp.designpattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by change on 2018/11/15.
 * 动态代理
 */
public class DynamicProxy implements InvocationHandler {
    private Object object;

    public  DynamicProxy(Object o) {
        this.object = o;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(object, args);
        return result;
    }
}
