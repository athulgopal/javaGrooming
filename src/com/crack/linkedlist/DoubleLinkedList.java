package com.crack.linkedlist;

/**
 * Created by wipro on 12/1/16.
 */
public class DoubleLinkedList {

    DoubleLinkedListNode node;
    DoubleLinkedListNode first;

    public void insertData(Object data){
        DoubleLinkedListNode newNode;
        newNode =new DoubleLinkedListNode(node,data);
        if(node==null) first=newNode;
        else    node.setNext(newNode);
        node=newNode;
    }//insertData

    public void deleteData(Object data){
        node=first;
        while(node.getNext()!=null){
            if(node.getData().hashCode()==data.hashCode()) node.getPrev().setNext(node.getNext());
            node=node.getNext();
        }
    }//deleteData

    public void deleteData(DoubleLinkedListNode node){

        node.getPrev().setNext(node.getNext());

    }//deleteData

    public void showData(){
        node=first;
        while(node!=null){
            System.out.print("  "+node.getData());
            node=node.getNext();
        }
        System.out.println("  ");
    }//showData

    public void sort(){

        DoubleLinkedListNode current=first;
        DoubleLinkedListNode runner;

        while (current!=null){

            System.out.println("current "+current.getData());
            runner=current.getNext();
            DoubleLinkedListNode tmp=current;
            while(runner!=null){
                if(Integer.parseInt(runner.getData()+"") < Integer.parseInt(tmp.getData()+"") ) {
                    tmp = runner;
                }
                runner=runner.getNext();
            }
            if(tmp!=current){
                Object data=tmp.getData();
                tmp.setData(current.getData());
                current.setData(data);

                current=first;
            }else{
                current=current.getNext();
            }

        }
    }//sort

    public void deleteDuplicate(){

        DoubleLinkedListNode left;
        DoubleLinkedListNode current=first;
        DoubleLinkedListNode right;
        int count=0;


    }

}