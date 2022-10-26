// ======================================
// Project Name:studyExercise
// Package Name:com.example.studyexercise.designModel.composite
// File Name:CompositeMode.java
// Create Date:2022年09月28日  17:05
// ======================================
package com.example.studyexercise.设计模式.组合模式;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合模式
 * @author chenyanqiao
 * @version 2022年09月28日  17:05
 */
public class CompositeMode {
    public static void main(String[] args) {
        Node driveD = new Folder("D盘");
        Node doc = new Folder("文档");
        doc.add(new File("简历.doc"));
        doc.add(new File("项目介绍.pptx"));
        Node doc2 = new Folder("视频");
        doc2.add(new File("视频1"));
        doc2.add(new File("shipin2"));
        driveD.add(doc);
        driveD.add(doc2);
//        System.out.println(driveD.toString());
        driveD.tree(0);
    }
}
abstract class Node{
    protected String name;//节点命名
    public Node(String name) {
        this.name = name;
    }
    //添加下级子节点
    protected abstract void add(Node child);
    //展示树形结构方法
    protected void tree(int space){
        for(int i = 0; i < space; i++){
            System.out.print(" ");
        }
        System.out.println(name);
    }
    @Override
    public String toString() {
        return "Node{" +
                "name='" + name + '\'' +
                '}';
    }
}
//文件夹类 父节点类
class Folder extends Node{
    private List<Node> childrenNodes = new ArrayList<>();
    public Folder(String name) {
        super(name);
    }

    @Override
    protected void add(Node child) {
        childrenNodes.add(child);
    }

    public List<Node> getChildrenNodes() {
        return childrenNodes;
    }

    public void setChildrenNodes(List<Node> childrenNodes) {
        this.childrenNodes = childrenNodes;
    }

    @Override
    public String toString() {
        return "Folder{" +
                "childrenNodes=" + childrenNodes +
                '}';
    }

    @Override
    protected void tree(int space) {
        super.tree(space);
        space++;
        for (Node node:childrenNodes) {
            node.tree(space);
        }
    }
}
//文件夹 叶子结点
class File extends Node{

    public File(String name) {
        super(name);
    }

    @Override
    protected void add(Node child) {
        System.out.println("无法添加子节点");
    }

    @Override
    protected void tree(int space) {
        super.tree(space);
    }
}