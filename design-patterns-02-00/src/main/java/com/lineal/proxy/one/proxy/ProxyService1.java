package com.lineal.proxy.one.proxy;

import com.lineal.proxy.one.target.TargetService1;

/**
 * @description: 代理类的实现
 * @author: lineal
 * @date: 2023/7/21
 * @version: 1.0
 **/
public class ProxyService1 implements TargetService1 {

    TargetService1 targetService1;

    public ProxyService1(TargetService1 targetService1){
        this.targetService1 = targetService1;
    }

    @Override
    public void update1() {
        System.out.println("方法执行前代理类执行其余操作");
        targetService1.update1();
        System.out.println("方法执行后代理类执行其余操作");
    }

    @Override
    public void add1() {
        System.out.println("方法执行前代理类执行其余操作");
        targetService1.add1();
        System.out.println("方法执行后代理类执行其余操作");
    }
}
