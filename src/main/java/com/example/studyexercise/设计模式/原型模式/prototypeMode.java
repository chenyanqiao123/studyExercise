// ======================================
// Project Name:studyExercise
// Package Name:com.example.studyexercise.designModel
// File Name:prototypeMode.java
// Create Date:2022年09月21日  14:49
// ======================================
package com.example.studyexercise.设计模式.原型模式;

/**
 * （原型模式）
 * 克隆工厂
 * @author chenyanqiao
 * @version 2022年09月21日  14:49
 */
public class prototypeMode {
    private static EnemyPlane enemyPlane = new EnemyPlane(200);
    public static EnemyPlane getInstance(int x) throws CloneNotSupportedException {
        EnemyPlane clone = enemyPlane.clone();
        clone.setX(x);
        return clone;
    }
    public static void main(String[] args) throws CloneNotSupportedException {
        EnemyPlane enemyPlane1 = prototypeMode.getInstance(101);
        System.out.println(enemyPlane1);
    }
}
/**
 * 敌机类
 * 深拷贝与浅拷贝
 * 当原型类里面有因为类（敌机发射子弹）
 */
class EnemyPlane implements Cloneable{
    //涉及到 深拷贝 （该类为敌机所带的子弹）
    //此时如果进行克隆操作，我们是否能将子弹对象一同成功克隆呢？
    // 答案是否定的
    //只会拷贝该对象的引用地址
    private Bullte bullte = new Bullte();
    private int x;//敌机横坐标
    private int y;//敌机纵坐标

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Bullte getBullte() {
        return bullte;
    }

    public void setBullte(Bullte bullte) {
        this.bullte = bullte;
    }

    public EnemyPlane(int x){
        this.x = x;
    }
    public void fly(){
        y++;
    }

    @Override
    public String toString() {
        return "EnemyPlane{" +
                "bullte=" + bullte +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    protected EnemyPlane clone() throws CloneNotSupportedException {
        EnemyPlane enemyPlane =  (EnemyPlane)super.clone();
        enemyPlane.setBullte(this.bullte.clone());
        return enemyPlane;
    }
}
class Bullte implements Cloneable{
    private String name;
    private int x;
    private int y;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    protected Bullte clone() throws CloneNotSupportedException {
        return (Bullte)super.clone();
    }
}