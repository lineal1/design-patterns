package com.lineal.proxy.two;

import com.lineal.proxy.two.adapter.ITargetServiceAdapter;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @description: 代理方法处理类
 * @author: lineal
 * @date: 2023/7/21
 * @version: 1.0
 **/
public class ProxyInvocationHandler implements InvocationHandler {
    ITargetServiceAdapter iTargetServiceAdapter;


    public ProxyInvocationHandler(ITargetServiceAdapter iTargetServiceAdapter){
        this.iTargetServiceAdapter = iTargetServiceAdapter;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("进入到方法处理器中");
        return iTargetServiceAdapter.getClass().getMethod(method.getName(), getClasses(args)).invoke(iTargetServiceAdapter, args);
    }

    private Class<?>[] getClasses(Object[] args) {
        if (Objects.isNull(args)){
            return null;
        }
        return Arrays.stream(args).map(Object::getClass).toArray(Class[]::new);
    }


}
