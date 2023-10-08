package com.lineal;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @description: 单例模式-CAS自旋(线程安全)
 * @author: lineal
 * @date: 2023/10/8
 * @version: 1.0
 **/
public class Singleton_06 {
    private static final AtomicReference<Singleton_06> INSTANCE = new AtomicReference<>();

    private Singleton_06(){

    }

    public static Singleton_06 getInstance(){
        for (;;){
            Singleton_06 singleton = INSTANCE.get();
            if (Objects.nonNull(singleton)) return singleton;
            INSTANCE.compareAndSet(null, new Singleton_06());
            return INSTANCE.get();
        }
    }
}
