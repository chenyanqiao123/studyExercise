// ======================================
// Project Name:studyExercise
// Package Name:com.example.studyexercise.designModel.factory
// File Name:Enemy.java
// Create Date:2022年09月21日  16:19
// ======================================
package com.example.studyexercise.设计模式.工厂方法模式;

/**
 * 产品（什么产品，产品归类，例如:鞋子；汽车，笔）
 * @author chenyanqiao
 * @version 2022年09月21日  16:19
 */
public abstract class Enemy {
    protected int x;
    protected int y;
    public Enemy(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public abstract void show();
}