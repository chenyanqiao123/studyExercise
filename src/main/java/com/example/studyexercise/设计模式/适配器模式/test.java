// ======================================
// Project Name:studyExercise
// Package Name:com.example.studyexercise.设计模式.适配器模式
// File Name:test.java
// Create Date:2022年10月26日  15:12
// ======================================
package com.example.studyexercise.设计模式.适配器模式;

/**
 * @author chenyanqiao
 * @version 2022年10月26日  15:12
 */
public class test {
    public static void main(String[] args) {
        DoubleApi doubleApi = new TV();
        AdapterModel adapterModel = new AdapterModel(doubleApi);
        adapterModel.runTrbleApi(8,9,10);
    }
}