package com.crack.graph;

/**
 * Created by wipro on 12/5/16.
 */
public class Nodes {
    private Integer data;
    private Nodes left;
    private Nodes right;
    Nodes() {}
    Nodes(Integer data){
        this.data=data;
    }
    public Integer getData() {
        return data;
    }
    public void setData(Integer data) {
        this.data = data;
    }
    public Nodes getLeft() {
        return left;
    }
    public void setLeft(Nodes left) {
        this.left = left;
    }
    public Nodes getRight() {
        return right;
    }
    public void setRight(Nodes right) {
        this.right = right;
    }
}