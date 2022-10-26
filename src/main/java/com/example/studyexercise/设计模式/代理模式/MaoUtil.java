// ======================================
// Project Name:studyExercise
// Package Name:com.example.studyexercise.设计模式.代理模式
// File Name:MaoUtil.java
// Create Date:2022年10月26日  15:44
// ======================================
package com.example.studyexercise.设计模式.代理模式;

/**
 * @author chenyanqiao
 * @version 2022年10月26日  15:44
 */
public class MaoUtil implements HttpApi{

    public MaoUtil(String passWord) throws Exception {
        if(!("123456").equals(passWord)){
            throw new Exception("拨号失败请重试！！！");
        }else {
            System.out.println("拨号成功。。。。。。");
        }
    }

    @Override
    public void httpAccess(String url) {
        System.out.println("正在访问" + url);
    }
}