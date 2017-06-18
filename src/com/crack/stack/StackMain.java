package com.crack.stack;

/**
 * Created by wipro on 12/2/16.
 */
public class StackMain {
    public static void main(String args[]){
        StackLinked stack=new StackLinked();
        String[] list={"1","2","3","4","5"};
        for(String data:list){
            stack.push(data);
        }
        while (stack.next()){
            System.out.println(stack.pop().getData());
        }
    }//main
}
