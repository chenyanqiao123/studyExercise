// ======================================
// Project Name:studyExercise
// Package Name:com.example.studyexercise.designModel
// File Name:饿汉模式.java
// Create Date:2022年09月21日  14:05
// ======================================
package com.example.studyexercise.设计模式.单例模式;

/**
 * 饿汉模式
 * @author chenyanqiao
 * @version 2022年09月21日  14:05
 */
public class hungryManMode {
    private static final hungryManMode sun = new hungryManMode("太阳");
    private String name;
    public void sun(){
        System.out.println(this.name + "为所有生物提供日光");
    }
    private hungryManMode(String name){
        this.name = name;
    }
    public static  hungryManMode getInstance(){
        return sun;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public static void main(String[] args) {
        //一次生成，只有一个对象地址（单例），不会再产生其他地址，
        // 即使对属性做了修改，只更改属性
//       hungryManMode sun =  new hungryManMode("sun");
//        System.out.println(sun);
//        hungryManMode sun2 =  hungryManMode.getInstance();
//        System.out.println(sun2);
//       sun.setName("yueliang");
//        sun.sun();
//        sun.setName("taiyang");
//        sun.sun();
    }
}