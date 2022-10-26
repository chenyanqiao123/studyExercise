// ======================================
// Project Name:studyExercise
// Package Name:com.example.studyexercise.designModel.Decorator
// File Name:DecoratorModel.java
// Create Date:2022年09月28日  18:06
// ======================================
package com.example.studyexercise.设计模式.装饰器模式;

/**
 * 装饰器模式
 * 能够在运行时动态地为原始对象增加一些额外的功能，
 * 使其变得更加强大。从某种程度上讲，
 * 装饰器非常类似于“继承”
 * 区别在于：继承是在编译的时候实现对类的扩展
 *          装饰器是在运行时实现的
 * @author chenyanqiao
 * @version 2022年09月28日  18:06
 */
public class DecoratorModel {
    public static void main(String[] args) {
        Showable girl= new Lipstick(new FoundationMakeup(new Girl()));
        girl.show();
    }
}
interface Showable{
    public void show();//展示行为
}
class Girl implements Showable {

    @Override
    public void show() {
        System.out.print("女生的素颜");
    }
}
class Decorator implements Showable{
    Showable showable;

    public Decorator(Showable showable) {
        this.showable = showable;
    }

    @Override
    public void show() {
        System.out.print("粉饰【");
        showable.show();
        System.out.print("】");
    }
}
abstract class Decorator2 implements Showable{
    Showable showable;

    public Decorator2(Showable showable) {
        this.showable = showable;
    }

    @Override
    public void show() {
        showable.show();
    }
}
class FoundationMakeup extends Decorator2{

    public FoundationMakeup(Showable showable) {
        super(showable);
    }

    @Override
    public void show() {
        System.out.print("打粉底【");
        showable.show();
        System.out.print("】");
    }
}
class Lipstick extends Decorator2{

    public Lipstick(Showable showable) {
        super(showable);
    }

    @Override
    public void show() {
        System.out.print("涂口红【");
        showable.show();
        System.out.print("】");
    }
}