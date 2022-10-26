// ======================================
// Project Name:studyExercise
// Package Name:com.example.studyexercise.designModel.factory
// File Name:TankFactory.java
// Create Date:2022年09月21日  16:27
// ======================================
package com.example.studyexercise.设计模式.工厂方法模式;

import java.util.Random;

/**
 * @author chenyanqiao
 * @version 2022年09月21日  16:27
 */
public class TankFactory implements Factory{
    @Override
    public Enemy create(int width) {
        Random random = new Random();
        return new Tank(random.nextInt(width),0 );
    }
}