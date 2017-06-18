package com.java.array;

/**
 * Created by wipro on 3/14/17.
 */
public class UniqueChar {
    public static void main(String args[]){

        String inVal=" Athul ";
        boolean chat_set[] =new boolean[256];
        int i=0;

        for(i =0;i<inVal.trim().length();i++){
            int val=inVal.trim().charAt(i);

            if(chat_set[val]){
                System.out.print(" Not Unique ");
                break;
            }else{
                chat_set[val]=true;
            }
        }

        if(i >= inVal.trim().length())
         System.out.print(" Is Unique ");
    }
}
