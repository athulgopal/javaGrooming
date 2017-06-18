package com.crack.graph;

/**
 * Created by wipro on 12/7/16.
 */
public class Graph {
    public void BFS(Nodes node){

        if(node.getLeft()!=null)
            BFS(node.getLeft());
        if(node.getRight()!=null)
            BFS(node.getRight());
        System.out.print(" "+node.getData());
        return;
    }
}
