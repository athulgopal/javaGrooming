package com.crack.stack;

/**
 * Created by wipro on 12/2/16.
 */
public class QueueMain {
    public static void main(String args[]){
        Queue queue=new Queue();
        String[] list={"1","2","3","4","5"};
        for(String data:list){
            queue.enqueue(data);
        }
        while(queue.next()){
            System.out.print(" "+queue.deQueue());
        }
        System.out.println("");
        for(int i=1;i<=100;i++){
            queue.enqueue(i+"");
        }
        while(queue.next()){
            System.out.print(" "+queue.deQueue());
        }
    }
}
