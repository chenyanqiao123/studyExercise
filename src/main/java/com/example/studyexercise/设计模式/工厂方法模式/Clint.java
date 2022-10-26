// ======================================
// Project Name:studyExercise
// Package Name:com.example.studyexercise.designModel.factory
// File Name:Clint.java
// Create Date:2022年09月21日  16:31
// ======================================
package com.example.studyexercise.设计模式.工厂方法模式;

/**
 * 工厂方法模式 实现
 * @author chenyanqiao
 * @version 2022年09月21日  16:31
 */
public class Clint {
    public static void main(String[] args) {
        int width = 160;
        Factory air = new AirplaneFactory();
        for (int i = 0; i <6;i++) {
            air.create(width).show();
        }
        Factory tank = new TankFactory();
        for (int i = 0; i <6;i++) {
            tank.create(width).show();
        }
    }
}