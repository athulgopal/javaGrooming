package com.crack.binarytree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by wipro on 12/14/16.
 */
public class BalanceTree {

    ArrayList<Nodes> odList=new ArrayList<Nodes>();
    Nodes root=null;
    void insert(int data){

        Nodes current= getPosition(root,data);
        if(root == null) root=current;

        balance();
    }

    Nodes getPosition (Nodes nod,int data){

        if(nod ==null){ nod=new Nodes(data); odList.add(nod);}
        else if(nod.getData()>data){
            nod.setLeft(getPosition(nod.getLeft(),data));
        }else if(nod.getData()<data){
            nod.setRight(getPosition(nod.getRight(),data));
        }else {}
        return nod;
    }

    public void printPath(){
        ArrayList<Nodes> nodeList=new ArrayList<Nodes>();
        if(root == null)
            return;

        nodeList.add(root);
        getChild(root,nodeList);


    }//printPath

    private void getChild(Nodes node,ArrayList<Nodes> nodeList){
        boolean hasChild=false;
        if(node.getLeft()!=null) {
            hasChild=true;
            nodeList.add(node.getLeft());
            getChild(node.getLeft(), nodeList);
        }
        if(node.getRight()!=null){
            hasChild=true;
            nodeList.add(node.getRight());
            getChild(node.getRight(),nodeList);
        }

        if(!hasChild) {
            for (Nodes nod : nodeList) {
                System.out.print(" " + nod.getData());
            }
            System.out.println(" ");
        }
        nodeList.remove(nodeList.size()-1);
        return;
    }//getChild

    public void balance(){

        Collections.sort(odList);
        root=null;
        root=insertB(0,odList.size()-1);
    }

    Nodes insertB(int st,int nd){
        int mid=(st+nd)/2;
        Nodes cureent=new Nodes(odList.get(mid).getData());

        if(mid > st ) cureent.setLeft(insertB(st,mid-1));
        if (mid < nd)cureent.setRight(insertB(mid+1,nd));
        return cureent;
    }

}//