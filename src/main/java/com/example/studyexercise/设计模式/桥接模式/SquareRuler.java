// ======================================
// Project Name:studyExercise
// Package Name:com.example.studyexercise.设计模式.桥接模式
// File Name:SquareRuler.java
// Create Date:2022年10月31日  11:19
// ======================================
package com.example.studyexercise.设计模式.桥接模式;

/**
 * @author chenyanqiao
 * @version 2022年10月31日  11:19
 */
public class SquareRuler implements Ruler{
    @Override
    public void regularize() {
        System.out.println("□");
    }
}