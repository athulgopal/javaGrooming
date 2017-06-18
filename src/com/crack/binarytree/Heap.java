package com.crack.binarytree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by wipro on 12/15/16.
 */
public class Heap {
    Nodes root;

    ArrayList<Integer> nodeList=new ArrayList<Integer>();
    ArrayList<Nodes> list=new ArrayList<>();
    public void insert(int[] data){
        for(int i:data) nodeList.add(i);
        Collections.sort(nodeList);
        root=getNode(0,nodeList.size()-1);
    }//

    Nodes getNode(int st, int nd){
        Nodes current =new Nodes();
        int mid =(st+nd)/2;
        current.setData(nodeList.get(mid));
       // System.out.println(mid+" "+nodeList.get(mid));
        if(mid > st) current.setLeft(getNode(st,mid-1));
        if(mid < nd) current.setRight(getNode(mid+1,nd));

        return current;
    }//

    public void showAllPath(){

        if(root == null) return;
        list.add(root);
        getChild(root);
    }//

    private void getChild(Nodes nod){

        boolean hasChild=false;
        if(nod.getLeft() !=null){
            hasChild=true;
            list.add(nod.getLeft());
            getChild(nod.getLeft());

        }
        if(nod.getRight()!=null){
            hasChild=true;
            list.add(nod.getRight());
            getChild(nod.getRight());
        }
        if(!hasChild){

            for(Nodes node:list){
                System.out.print(" "+node.getData());
            }
            System.out.println(" ");
        }
        list.remove(list.size()-1);
    }//getChild
}//
