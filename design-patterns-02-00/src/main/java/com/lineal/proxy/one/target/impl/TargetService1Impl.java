package com.lineal.proxy.one.target.impl;

import com.lineal.proxy.one.target.TargetService1;

/**
 * @description: 目标类的实现
 * @author: lineal
 * @date: 2023/7/21
 * @version: 1.0
 **/
public class TargetService1Impl implements TargetService1 {
    @Override
    public void update1() {
        System.out.println("TargetService1更新服务调用成功");
    }

    @Override
    public void add1() {
        System.out.println("TargetService1增加服务调用成功");
    }
}
