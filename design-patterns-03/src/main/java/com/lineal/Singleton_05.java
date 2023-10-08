package com.lineal;

import java.util.Objects;

/**
 * @description: 单例模式-双重锁校验(线程安全)
 * @author: lineal
 * @date: 2023/10/8
 * @version: 1.0
 **/
public class Singleton_05 {
    private static Singleton_05 instance;

    private Singleton_05(){

    }

    public static Singleton_05 getInstance() {
        if (Objects.nonNull(instance)) return instance;
        synchronized (Singleton_05.class){
            if (Objects.isNull(instance)){
                instance = new Singleton_05();
            }
        }
        return instance;
    }
}
