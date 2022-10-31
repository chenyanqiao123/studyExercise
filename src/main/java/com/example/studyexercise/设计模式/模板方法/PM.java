// ======================================
// Project Name:studyExercise
// Package Name:com.example.studyexercise.设计模式.模板方法
// File Name:PM.java
// Create Date:2022年10月31日  13:56
// ======================================
package com.example.studyexercise.设计模式.模板方法;

/**
 * @author chenyanqiao
 * @version 2022年10月31日  13:56
 */
public abstract class PM {
    public abstract String analyze();//需求分析

    public abstract String design(String project);//软件设计

    public abstract String develop(String project);//代码开发

    public abstract boolean test(String project);//代码测试

    public abstract void release(String project);//上线发布

    protected final void kickoff(){
        String requirements = analyze();
        String design = design(requirements);
        do{
            design = develop(design);
        }while (!test(design));
        release(design);
    }
}