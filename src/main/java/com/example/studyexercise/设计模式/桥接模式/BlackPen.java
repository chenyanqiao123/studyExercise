// ======================================
// Project Name:studyExercise
// Package Name:com.example.studyexercise.设计模式.桥接模式
// File Name:BlackPen.java
// Create Date:2022年10月31日  11:24
// ======================================
package com.example.studyexercise.设计模式.桥接模式;

/**
 * @author chenyanqiao
 * @version 2022年10月31日  11:24
 */
public class BlackPen extends Pen{

    public BlackPen(Ruler ruler) {
        super(ruler);
    }

    @Override
    public void getDrow() {
        System.out.print("黑");
        ruler.regularize();
    }
}