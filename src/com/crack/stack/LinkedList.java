package com.crack.stack;

/**
 * Created by wipro on 12/2/16.
 */
public class LinkedList {

    private Object data;
    private LinkedList next;

    private LinkedList(){}
    public LinkedList(LinkedList next,Object data){
        this.next=next;
        this.data = data;
    }
    public Object getData() {
        return data;
    }
    public LinkedList getNext() { return next; }
    public void setData(Object data) { this.data = data; }
    public void setNext(LinkedList next) {
        this.next = next;
    }
}
