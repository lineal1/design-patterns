package com.lineal.proxy.two.adapter.impl;

import com.lineal.proxy.one.target.TargetService1;
import com.lineal.proxy.one.target.impl.TargetService1Impl;
import com.lineal.proxy.two.adapter.ITargetServiceAdapter;
import com.lineal.proxy.two.target.TargetService2;
import com.lineal.proxy.two.target.impl.TargetService2Impl;

/**
 * @description: 适配器2
 * @author: lineal
 * @date: 2023/7/21
 * @version: 1.0
 **/
public class TargetServiceAdapter2 implements ITargetServiceAdapter {
    TargetService2 service2 = new TargetService2Impl();

    @Override
    public void update() {
        System.out.println("调用适配器2");
        service2.update2();
    }

    @Override
    public void add() {
        System.out.println("调用适配器2");
        service2.add2();
    }
}
