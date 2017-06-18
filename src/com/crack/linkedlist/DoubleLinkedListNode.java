package com.crack.linkedlist;

/**
 * Created by wipro on 12/1/16.
 */
public class DoubleLinkedListNode {

    private Object data;
    private DoubleLinkedListNode next;
    private DoubleLinkedListNode prev;

    private DoubleLinkedListNode(){}
    public DoubleLinkedListNode(DoubleLinkedListNode prev,Object data){
        this.data = data;
        this.prev = prev;
    }
    public Object getData() {
        return data;
    }
    public DoubleLinkedListNode getNext() {
        return next;
    }
    public DoubleLinkedListNode getPrev() {
        return prev;
    }
    public void setData(Object data) { this.data = data; }
    public void setPrev(DoubleLinkedListNode prev) {
        this.prev = prev;
    }
    public void setNext(DoubleLinkedListNode next) {
        this.next = next;
    }

}
