package com.lineal.proxy;

import com.lineal.proxy.one.proxy.ProxyService1;
import com.lineal.proxy.one.target.TargetService1;
import com.lineal.proxy.one.target.impl.TargetService1Impl;
import com.lineal.proxy.two.ProxyService2;
import com.lineal.proxy.two.adapter.impl.TargetServiceAdapter1;
import com.lineal.proxy.two.adapter.impl.TargetServiceAdapter2;
import org.junit.Test;

/**
 * @description: 测试类
 * @author: lineal
 * @date: 2023/7/21
 * @version: 1.0
 **/
public class ApiTest {

    @Test
    public void proxyTest1(){
        TargetService1 targetService1 = new TargetService1Impl();
        TargetService1 proxyService = new ProxyService1(targetService1);
        proxyService.update1();
    }


    @Test
    public void proxyTest2(){
        final TargetService proxy1 = ProxyService2.getProxy(TargetService.class, new TargetServiceAdapter1());
        proxy1.add();
        final TargetService proxy2 = ProxyService2.getProxy(TargetService.class, new TargetServiceAdapter2());
        proxy2.add();
    }
}
