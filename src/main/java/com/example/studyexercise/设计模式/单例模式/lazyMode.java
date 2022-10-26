// ======================================
// Project Name:studyExercise
// Package Name:com.example.studyexercise.designModel
// File Name:lazyMode.java
// Create Date:2022年09月21日  14:21
// ======================================
package com.example.studyexercise.设计模式.单例模式;

import sun.security.provider.Sun;

/**
 * 懒汉模式（多线程问题）
 * @author chenyanqiao
 * @version 2022年09月21日  14:21
 */
public class lazyMode {
    private String name;
//    private static lazyMode sun;
    private volatile static lazyMode sun;
    private lazyMode(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "lazyMode{" +
                "name='" + name + '\'' +
                '}';
    }
//    public static synchronized lazyMode getInstance() {
    public static lazyMode getInstance() {
        //在多线程模式下,并发请求的话
        //判空逻辑就会同时成立，这样就会多次实例化太阳，
        // 并且对sun进行多次赋值（覆盖）操作，这违背了单例的理念
        //所以加  synchronized 同步锁
        if(sun==null) {
            synchronized(Sun.class){
                sun = new lazyMode("月亮");
            }

        }
        return sun;
    }
    public static void main(String[] args) {
//        System.out.println(lazyMode.getInstance());
    hungryManMode hun = hungryManMode.getInstance();
        System.out.println(hun);
    }
}