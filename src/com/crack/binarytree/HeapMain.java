package com.crack.binarytree;

/**
 * Created by wipro on 12/15/16.
 */
public class HeapMain {
    public static void main(String args[]){
        int[] list={10,3,5,6,8,2,7,4,9};

        Heap heap=new Heap();
        heap.insert(list);
        heap.showAllPath();
    }
}
