package com.java.array;

import java.util.ArrayList;

/**
 * Created by wipro on 3/16/17.
 */
public class NonRepeat {
    public static void main(String args[])throws Exception {
        String inData="meem";
        ArrayList list=new ArrayList();
        for(char c:inData.toCharArray()){
            if(!list.contains(c))
                list.add(c);
            else
                list.remove(list.indexOf(c));
        }
        if(list.isEmpty())
            System.out.print(" No repeating word ");
        else
            System.out.print(" Repeating word is "+list.get(0));
    }
}