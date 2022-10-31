// ======================================
// Project Name:studyExercise
// Package Name:com.example.studyexercise.设计模式.桥接模式
// File Name:TriangleRuler.java
// Create Date:2022年10月31日  11:20
// ======================================
package com.example.studyexercise.设计模式.桥接模式;

/**
 * @author chenyanqiao
 * @version 2022年10月31日  11:20
 */
public class TriangleRuler implements Ruler{
    @Override
    public void regularize() {
        System.out.println("△");
    }
}