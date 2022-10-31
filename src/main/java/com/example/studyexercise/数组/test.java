// ======================================
// Project Name:myBlog
// Package Name:com.qiao.myblog
// File Name:test.java
// Create Date:2022年10月27日  17:27
// ======================================
package com.example.studyexercise.数组;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author chenyanqiao
 * @version 2022年10月27日  17:27
 */
public class test {
    public static void main(String[] args) {
        Guest guest1 = new Guest("小明",false);
        Guest guest2 = new Guest("小军",false);
        Guest vipGuest = new Guest("小红",true);
        Deque<Guest> deque = new ArrayDeque<>();
        deque.add(guest1);
        deque.add(guest2);
        deque.addFirst(vipGuest);
        System.out.println(deque);
    }
}
class Guest{
    String name;
    Boolean vip;

    @Override
    public String toString() {
        return name;
    }

    public Guest(String name, Boolean vip) {
        this.name = name;
        this.vip = vip;

    }
}