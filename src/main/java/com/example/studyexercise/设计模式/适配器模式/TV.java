// ======================================
// Project Name:studyExercise
// Package Name:com.example.studyexercise.设计模式.适配器模式
// File Name:TV.java
// Create Date:2022年10月26日  14:46
// ======================================
package com.example.studyexercise.设计模式.适配器模式;

/**
 * @author chenyanqiao
 * @version 2022年10月26日  14:46
 */
public class TV implements DoubleApi{

    @Override
    public void run(int x, int y) {
        System.out.println("火线接通" +x);
        System.out.println("电源线接通" +y);
        System.out.println("电视开机成功");
    }
}