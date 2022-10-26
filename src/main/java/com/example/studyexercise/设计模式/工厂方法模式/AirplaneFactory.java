// ======================================
// Project Name:studyExercise
// Package Name:com.example.studyexercise.designModel.factory
// File Name:AirplaneFactory.java
// Create Date:2022年09月21日  16:26
// ======================================
package com.example.studyexercise.设计模式.工厂方法模式;

import java.util.Random;

/**
 * @author chenyanqiao
 * @version 2022年09月21日  16:26
 */
public class AirplaneFactory implements Factory{
    @Override
    public Enemy create(int width) {
        Random  random = new Random();
        return new Airplane(random.nextInt(width),0 );
    }
}