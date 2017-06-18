package com.crack.stack;

/**
 * Created by wipro on 12/2/16.
 */
public class Queue {
    LinkedList first;
    LinkedList last;

    void enqueue(Object data){
        LinkedList node=new LinkedList(null,data);
        if(first == null){
            first=node;
            last=node;
        }else{
            last.setNext(node);
            last=node;
        }

    }//enqueue
    Object deQueue(){
        Object data;
        data=first.getData();
        first=first.getNext();
        return data;
    }//deQueue

    boolean next(){
        if(first !=null) return true;
        else return false;
    }
}
