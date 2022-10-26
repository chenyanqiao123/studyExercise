// ======================================
// Project Name:springboot-learning-example
// Package Name:demo.springboot.exam
// File Name:StreamExercise.java
// Create Date:2022年09月17日  10:00
// ======================================
package com.example.studyexercise.流的使用;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author chenyanqiao
 * @version 2022年09月17日  10:00
 */
public class StreamExercise {
    /**
     * 以迭代的方式获取长度大于4的单词数量
     */
    public static void getNum() {
        Long start = System.currentTimeMillis();
        String contents = null;
        try {
            //以字符串接收读取的文件
            contents = new String(Files.readAllBytes(
                    Paths.get("test.txt")), StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //遇到非字母符号截断 空格、括号、双引号等等（将所有单词存储为list）
        List<String> words = Arrays.asList(contents.split("\\PL+"));
        int count = 0;
        for (String word : words) {
            //筛选出单词长度 大于 4 的数量
            if (word.length() >4) {
                count ++;
            }
        }
        System.out.println(count);
        System.out.println("迭代消耗时间：======"+(System.currentTimeMillis()-start));
    }

    /**
     * 获取文件绝对路径
     */
    public static void getRout() {
        Path pathToFile = Paths.get("test.txt");
        System.out.println(pathToFile.toAbsolutePath());}

    /**
     * 以流的方式获取长度大于4的单词数量
     */
    public static void stranmNum(){
        Set<Integer> set = new HashSet<Integer>();
        long start = System.currentTimeMillis();
        String contents = null;
        try {
            contents = new String(Files.readAllBytes(
                    Paths.get("test.txt")), StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        List<String> words = Arrays.asList(contents.split("\\PL+"));
        long count = words.stream().filter(w -> w.length() >4)
                .peek(e-> System.out.println(e))
                .count();
        System.out.println(count);
        System.out.println("stream 消耗时间：======"+(System.currentTimeMillis()-start));
    }
    public static void streams(){
        Stream<String> echos = Stream.generate(()->"Echo");
        List<Object> list= echos.collect(Collectors.toList());
        System.out.println("echo"+list.get(0));
    }
    /**
     * 生成一个容量为100的随机数的流
     */
    public static void streams2(){
        Stream<Double> random = Stream.generate(Math::random)
                 .peek(e-> System.out.println(e))
                .                limit(100);
        System.out.println("echo"+random.collect(Collectors.toList()));
    }
    /**
     * 迭代生成 每个数是前一个数的二倍，并且获取当前生成数值，最大容量10个
     */
    public static void streams3(){
        Object[] power = Stream.iterate(1.0 ,p->p*2)
                        .peek(e-> System.out.println(e))
                                .limit(10).toArray();
        System.out.println("echo=========="+power);
    }
    /**
     * 将所有的单词转换小写
     */
    public static void streams4(){
        List<String> lines = new ArrayList<>();
        lines.add("CHEN");
        lines.add("yang");
        lines.add("qiao");
        List<String> str = lines.stream().map(String::toLowerCase).collect(Collectors.toList());
        List<String> str2 = lines.stream().map(e->e.substring(0,1)).collect(Collectors.toList());
        System.out.println(str.get(0));
    }
    public static void main(String[] args) {
//        StreamExercise.getNum();
//        StreamExercise.streams2();
//        StreamExercise.stranmNum();
//        StreamExercise.streams3();
        StreamExercise.streams4();
    }
}