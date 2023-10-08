package com.lineal;

/**
 * @description: 单例模式-饿汉模式(线程安全)
 * @author: lineal
 * @date: 2023/10/8
 * @version: 1.0
 **/
public class Singleton_03 {
    private static final Singleton_03 instance = new Singleton_03();
    private Singleton_03() {
    }
    public static Singleton_03 getInstance() {
        return instance;
    }
}
