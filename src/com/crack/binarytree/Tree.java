package com.crack.binarytree;

import java.util.ArrayList;

/**
 * Created by wipro on 12/5/16.
 */
public class Tree {

    Nodes root;
    Nodes bRoot;
    ArrayList<Nodes> nodeList=new ArrayList<>();

    public void insert(Integer data){
       getInsertNode(data,root);
    }
    private Nodes getInsertNode(Integer data, Nodes node){
        Nodes current =new Nodes();
        try{
            if(node == null){
                current=new Nodes();
                current.setData(data);
            }else{
                current=node;
                if(node.getData()<data){
                    node.setRight(getInsertNode(data,node.getRight()));
                }else{
                    node.setLeft(getInsertNode(data,node.getLeft()));
                }
            }
            if(root == null ) root=current;
        }catch (Exception e){
            e.printStackTrace();
        }
        return  current;
    }
    public void insert(int[] list){
        bRoot= getNode(0,list.length-1,list);
    }
    private Nodes getNode(int st,int nd,int[] list){
        Nodes current= new Nodes();
        int mid=(st+nd)/2;
        current.setData(list[mid]);
        System.out.println("  "+list[mid]);
        System.out.println(" --- ");
        if(mid > st){
            System.out.println(list[mid]+" to LEFT --  "+list[st]+"  "+list[(mid-1)]);
            current.setLeft(getNode(st,mid-1,list));}
        if(mid  < nd){
            System.out.println(list[mid]+" to right--  "+list[(mid+1)]+" "+list[nd]);
            current.setRight(getNode(mid+1,nd,list));}
        return current;
    }

    public void showData(int type){
        switch (type){
            case 1: preOrder(root); break;
            case 2: postOrder(root); break;
            case 3: inOrder(root); break;
        }
    }
    private void preOrder(Nodes node){
        if(node!=null){
            System.out.println(node.getData());
            preOrder(node.getLeft());
            preOrder(node.getRight());
        }
    }//
    private void inOrder(Nodes node){
        if(node!=null){
            inOrder(node.getLeft());
            System.out.println(node.getData());
            inOrder(node.getRight());
        }
    }
    private void postOrder(Nodes node){
        if(node!=null){
            postOrder(node.getLeft());
            postOrder(node.getRight());
            System.out.println(node.getData());
        }
    }//

    public void printPath(int st){
        ArrayList<Nodes> nodeList=new ArrayList<Nodes>();
        if(root == null)
            return;
        if (st==1){
            nodeList.add(root);
            getChild(root,nodeList);
        }
        else if(st==2){
            nodeList.add(bRoot);
            getChild(bRoot,nodeList);
        }


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
        nodeList.remove(nodeList.get(nodeList.size()-1));
        return;
    }//getChild

    public void BFS(){
        nodeList.add(bRoot);
        for(int i=0;i<nodeList.size();i++){
            System.out.print(" "+nodeList.get(i).getData());
            if(nodeList.get(i).getLeft()!=null){
                nodeList.add(nodeList.get(i).getLeft());
            }
            if(nodeList.get(i).getRight()!=null){
                nodeList.add(nodeList.get(i).getRight());
            }
        }
    }//BFS

    public void callDFS(){
        DFS(bRoot);
    }

    private void DFS(Nodes nod){
        System.out.print(" "+nod.getData());

        if(nod.getLeft()!=null) DFS(nod.getLeft());
        if(nod.getRight()!=null) DFS(nod.getRight());

    }//DFS
}