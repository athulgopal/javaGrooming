package com.crack.graph;

/**
 * Created by wipro on 12/7/16.
 */
public class GraphMain {
    public static void main(String args[]){
        Nodes node40=new Nodes(40);
        Nodes node30=new Nodes(30);
        Nodes node20=new Nodes(20);
        Nodes node10=new Nodes(10);
        Nodes node50=new Nodes(50);
        Nodes node60=new Nodes(60);
        Nodes node70=new Nodes(70);

        node40.setLeft(node20);
        node40.setRight(node60);
        node20.setLeft(node10);
        node20.setRight(node30);
        node60.setLeft(node50);
        node60.setRight(node70);

        Graph graph=new Graph();
        graph.BFS(node40);

    }
}
