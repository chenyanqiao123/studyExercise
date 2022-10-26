// ======================================
// Project Name:studyExercise
// Package Name:com.example.studyexercise.designModel.Adapter
// File Name:AdapterModel.java
// Create Date:2022年09月28日  18:31
// ======================================
package com.example.studyexercise.设计模式.适配器模式;

/**
 * @author chenyanqiao
 * @version 2022年09月28日  18:31
 */
public class AdapterModel implements TrbleApi{
    private DoubleApi doubleApi;

    public AdapterModel(DoubleApi doubleApi) {
        this.doubleApi = doubleApi;
    }

    @Override
    public void runTrbleApi(int x, int y, int z) {
        doubleApi.run(x,y);
    }
}