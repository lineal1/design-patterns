package com.lineal.proxy.two.target.impl;

import com.lineal.proxy.two.target.TargetService2;

/**
 * @description: 目标类的实现
 * @author: lineal
 * @date: 2023/7/21
 * @version: 1.0
 **/
public class TargetService2Impl implements TargetService2 {
    @Override
    public void update2() {
        System.out.println("TargetService2更新服务调用成功");
    }

    @Override
    public void add2() {
        System.out.println("TargetService2增加服务调用成功");
    }
}
