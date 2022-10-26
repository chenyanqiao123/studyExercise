// ======================================
// Project Name:studyExercise
// Package Name:com.example.studyexercise.设计模式.代理模式
// File Name:Proxy.java
// Create Date:2022年10月26日  15:49
// ======================================
package com.example.studyexercise.设计模式.代理模式;

import java.util.Arrays;
import java.util.List;

/**
 * @author chenyanqiao
 * @version 2022年10月26日  15:49
 */
public class Proxy implements HttpApi{
    private HttpApi httpApil;
    private List<String> strings = Arrays.asList("电影","游戏","小说","音乐");
    public Proxy() throws Exception {
        this.httpApil = new MaoUtil("123456");
    }
    @Override
    public void httpAccess(String url) {
        for (String s : strings) {
            if (url.contains(s)) {
                System.out.println("禁止访问"+url);
                return;
            }
        }
        httpApil.httpAccess(url);
    }
}