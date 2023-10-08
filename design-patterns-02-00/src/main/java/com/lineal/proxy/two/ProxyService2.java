package com.lineal.proxy.two;

import com.lineal.proxy.two.adapter.ITargetServiceAdapter;

import java.lang.reflect.Proxy;

/**
 * @description: 动态代理生成代理类
 * @author: lineal
 * @date: 2023/7/21
 * @version: 1.0
 **/
public class ProxyService2 {
    public static <T> T getProxy(Class<T> tClass, ITargetServiceAdapter adapter){
        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler(adapter);
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        return (T) Proxy.newProxyInstance(contextClassLoader, new Class[]{tClass}, proxyInvocationHandler);
    }
}
