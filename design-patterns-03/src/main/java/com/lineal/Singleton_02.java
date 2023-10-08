package com.lineal;

import java.util.Objects;

/**
 * @description: 单例模式-懒汉模式(线程安全)
 * @author: lineal
 * @date: 2023/10/8
 * @version: 1.0
 **/
public class Singleton_02 {
    private static Singleton_02 instance;

    private Singleton_02(){

    }

    public static synchronized Singleton_02 getInstance(){
        if (Objects.nonNull(instance)) return instance;
        instance = new Singleton_02();
        return instance;
    }
}
