// ======================================
// Project Name:studyExercise
// Package Name:com.example.studyexercise.designModel.factory
// File Name:Airplane.java
// Create Date:2022年09月21日  16:20
// ======================================
package com.example.studyexercise.设计模式.工厂方法模式;

/**
 * @author chenyanqiao
 * @version 2022年09月21日  16:20
 */
public class Airplane extends Enemy {
    public Airplane(int x, int y) {
        super(x,y);
    }
    @Override
    public void show() {
        System.out.println("绘制飞机于上层图层，坐标为（"+x+","+y+"）" );
        System.out.println("飞机向玩家发起攻击");
    }
}