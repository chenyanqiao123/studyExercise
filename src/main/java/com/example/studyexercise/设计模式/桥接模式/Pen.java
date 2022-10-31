// ======================================
// Project Name:studyExercise
// Package Name:com.example.studyexercise.设计模式.桥接模式
// File Name:Pen.java
// Create Date:2022年10月31日  11:20
// ======================================
package com.example.studyexercise.设计模式.桥接模式;

/**
 * @author chenyanqiao
 * @version 2022年10月31日  11:20
 */
public abstract class Pen {
    protected Ruler ruler;

    public Pen(Ruler ruler) {
        this.ruler = ruler;
    }
    public abstract void getDrow();
}