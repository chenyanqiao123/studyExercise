// ======================================
// Project Name:studyExercise
// Package Name:com.example.studyexercise.designModel.factory
// File Name:Tank.java
// Create Date:2022年09月21日  16:22
// ======================================
package com.example.studyexercise.设计模式.工厂方法模式;

/**
 * @author chenyanqiao
 * @version 2022年09月21日  16:22
 */
public class Tank extends Enemy{
    public Tank(int x, int y) {
        super(x, y);
    }
    @Override
    public void show() {
        System.out.println("绘制坦克于上层图层，坐标为（"+x+","+y+"）" );
        System.out.println("坦克向玩家发起攻击");
    }
}