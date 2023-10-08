package com.lineal;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @description: 单例模式第一种，静态类的使用
 * @author: lineal
 * @date: 2023/10/8
 * @version: 1.0
 **/
public class Singleton_00 {
    public static Map<String,String> cache = new ConcurrentHashMap<String, String>();
}
