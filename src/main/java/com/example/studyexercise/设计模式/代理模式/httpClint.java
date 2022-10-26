// ======================================
// Project Name:studyExercise
// Package Name:com.example.studyexercise.设计模式.代理模式
// File Name:httpClint.java
// Create Date:2022年10月26日  15:55
// ======================================
package com.example.studyexercise.设计模式.代理模式;

/**
 * @author chenyanqiao
 * @version 2022年10月26日  15:55
 */
public class httpClint {
    public static void main(String[] args) throws Exception {
        HttpApi proxy = new Proxy();
        proxy.httpAccess("http://www.电影.com");
        proxy.httpAccess("http://www.电视.com");
        proxy.httpAccess("http://www.学习.com");
        proxy.httpAccess("http://www.游戏.com");
    }
}