package com.crack.binarytree;

/**
 * Created by wipro on 12/5/16.
 */
public class TreeMain {
    public static void main(String args[]){
        int[] list={10,20,30,40,50,60,70,80,90,100,110,120,130,140,150,160};
        Tree tree=new Tree();
        for(Integer i:list){
            tree.insert(i);
        }

        Nodes node40=new Nodes(40);
        Nodes node30=new Nodes(30);
        Nodes node20=new Nodes(20);
        Nodes node10=new Nodes(10);
        Nodes node50=new Nodes(50);
        Nodes node60=new Nodes(60);
        Nodes node70=new Nodes(70);

        node40.setLeft(node20);
        node20.setLeft(node10);
        node20.setRight(node30);

        node40.setRight(node60);
        node60.setLeft(node50);
        node60.setRight(node70);
        tree.root=node40;

       /* System.out.println(" ------------  PreOrder  ");
        tree.showData(1);
        System.out.println(" ------------  PostOrder ");
        tree.showData(2);
        System.out.println(" ------------  InOrder   ");
        tree.showData(3);
        System.out.println(" ------------  printPath ");
        tree.printPath(1);*/

        System.out.println(" ------------B  printPath");
        tree.insert(list);
        tree.printPath(2);
        /*System.out.println(" ------------   BSF      ");
        tree.BFS();
        System.out.println(" ");
        System.out.println(" ------------   DSF      ");
        tree.callDFS();*/
    }//main
}