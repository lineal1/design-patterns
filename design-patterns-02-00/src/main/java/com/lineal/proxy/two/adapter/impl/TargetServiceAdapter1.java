package com.lineal.proxy.two.adapter.impl;

import com.lineal.proxy.one.target.TargetService1;
import com.lineal.proxy.one.target.impl.TargetService1Impl;
import com.lineal.proxy.two.adapter.ITargetServiceAdapter;

/**
 * @description: 适配器1
 * @author: lineal
 * @date: 2023/7/21
 * @version: 1.0
 **/
public class TargetServiceAdapter1 implements ITargetServiceAdapter {
    TargetService1 service1 = new TargetService1Impl();

    @Override
    public void update() {
        System.out.println("调用适配器1");
        service1.update1();
    }

    @Override
    public void add() {
        System.out.println("调用适配器1");
        service1.add1();
    }
}
