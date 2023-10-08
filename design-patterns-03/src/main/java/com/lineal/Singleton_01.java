package com.lineal;

import java.util.Objects;

/**
 * @description: 单例模式-懒汉模式(线程不安全)
 * @author: lineal
 * @date: 2023/10/8
 * @version: 1.0
 **/
public class Singleton_01 {
    private static Singleton_01 instance;

    private Singleton_01(){

    }

    public static Singleton_01 getInstance() {
        if (Objects.nonNull(instance)) return instance;
        instance = new Singleton_01();
        return instance;
    }
}
