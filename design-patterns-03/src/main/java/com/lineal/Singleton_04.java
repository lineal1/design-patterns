package com.lineal;

/**
 * @description: 单例模式-类的静态内部类(线程安全)
 * @author: lineal
 * @date: 2023/10/8
 * @version: 1.0
 **/
public class Singleton_04 {

    private static class Singleton_04_Helper{
        private static final Singleton_04 instance = new Singleton_04();
    }

    private Singleton_04(){

    }

    public static Singleton_04 getInstance(){
        return Singleton_04_Helper.instance;
    }
}
