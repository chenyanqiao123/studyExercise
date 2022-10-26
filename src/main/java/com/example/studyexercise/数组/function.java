// ======================================
// Project Name:studyExercise
// Package Name:com.example.studyexercise.数组
// File Name:function.java
// Create Date:2022年10月26日  16:49
// ======================================
package com.example.studyexercise.数组;

import java.time.LocalDateTime;

/**
 * @author chenyanqiao
 * @version 2022年10月26日  16:49
 */
public class function {
    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}
        };
        System.out.println("方法一开始时间：============="+LocalDateTime.now().toString());
        System.out.println(find(60,arr));
//        System.out.println(Find(20,arr));
        System.out.println("方法一结束时间：============="+LocalDateTime.now());
        System.out.println("方法二开始时间：============="+LocalDateTime.now());
//        System.out.println(find(20,arr));
        System.out.println(Find(60,arr));
        System.out.println("方法二结束时间：============="+LocalDateTime.now());
//        System.out.println(Find(14,arr));
    }

    /**
     *查找一个数组中是否包含某个数
     */
    public static boolean find(int target, int [][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j< array[i].length; j++) {
                if (array[i][j] == target) {
                    return true;
                }
            }
        }
        return  false;
    }
    public static boolean Find(int target, int[][] array) {
        int len1 = array.length; // 行数
        int len2=array[0].length;  //列数
        int posx=len1-1;
                int posy=0; // 定义两个指针，分别表示x和y的指针
        while(posx>=0&&posy<len2){
            // 当前的数字比目标数字大，x指针往上移动
            if(array[posx][posy]>target){
                posx--;
                // 当前的数字比目标数字小，y指针往右方向移动
            }else if(array[posx][posy]<target){
                posy++;
            }else{
                return true;
            }
        }
        return false;
    }
}