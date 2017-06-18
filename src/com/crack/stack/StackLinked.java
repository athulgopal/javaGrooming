package com.crack.stack;

/**
 * Created by wipro on 12/2/16.
 */
public class StackLinked {
    LinkedList top;
    LinkedList pop(){
        if(top!=null){
            LinkedList node=top;
            top=top.getNext();
            return node;
        }
        return null;
    }//pop
    void push (Object nodeData){
        LinkedList node=new LinkedList(null,nodeData);
        node.setNext(top);
        top=node;
    }//push
    boolean next (){
        if(top!=null) return true;
        else return false;
    }
}