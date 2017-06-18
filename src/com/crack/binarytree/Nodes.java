package com.crack.binarytree;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;
import java.util.Objects;

/**
 * Created by wipro on 12/5/16.
 */
public class Nodes implements Comparable{

    private Integer data;
    private Nodes left;
    private Nodes right;
    private Integer height;

    Nodes() { }
    Nodes(Integer data){
        this.data=data;
        this.height=0;
    }

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
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

    @Override
    public int compareTo(@NotNull Object o) {
        return this.getData()-((Nodes)o).getData();
    }
}
