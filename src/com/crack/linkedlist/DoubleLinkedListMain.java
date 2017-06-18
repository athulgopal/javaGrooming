package com.crack.linkedlist;

/**
 * Created by wipro on 12/1/16.
 */
public class DoubleLinkedListMain {
    public static void main(String args[]) {

        DoubleLinkedList linkedList=new DoubleLinkedList();
        String[] list={"7","2","3","4","5","6","7","7"};

        for(String data:list){
            linkedList.insertData(data);
        }
        linkedList.showData();
        linkedList.deleteData("4");
        linkedList.showData();

        linkedList.sort();
        linkedList.showData();

        //linkedList.deleteDuplicate();
        //linkedList.showData();
    }
}