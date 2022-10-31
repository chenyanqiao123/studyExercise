// ======================================
// Project Name:studyExercise
// Package Name:com.example.studyexercise.设计模式.模板方法
// File Name:HRProject.java
// Create Date:2022年10月31日  14:03
// ======================================
package com.example.studyexercise.设计模式.模板方法;

/**
 * @author chenyanqiao
 * @version 2022年10月31日  14:03
 */
public class HRProject extends PM{
    @Override
    public String analyze() {
        System.out.println("需求师：需求分析阶段");
        return "人力资源管理系统";
    }

    @Override
    public String design(String project) {
        System.out.println("架构师：设计程序");
        return "设计："+project;
    }

    @Override
    public String develop(String project) {
        return null;
    }

    @Override
    public boolean test(String project) {
        return false;
    }

    @Override
    public void release(String project) {

    }
}