// ======================================
// Project Name:studyExercise
// Package Name:com.example.studyexercise.设计模式.桥接模式
// File Name:test.java
// Create Date:2022年10月31日  11:26
// ======================================
package com.example.studyexercise.设计模式.桥接模式;

/**
 * @author chenyanqiao
 * @version 2022年10月31日  11:26
 */
public class test {
    public static void main(String[] args) {
        new WhitePen(new CircleRuler()).getDrow();
        new WhitePen(new SquareRuler()).getDrow();
        new WhitePen(new TriangleRuler()).getDrow();
    }
}