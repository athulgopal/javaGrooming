package com.crack;


/**
 * Created by wipro on 11/29/16.
 */
public class UniqueCharacters {
    public static void main (String args[]){
        String inData="athulGopalabcdefltG";
        for(int i=0;i<inData.toCharArray().length;i++) {
            //System.out.println(inData.charAt(i)+" -- " +inData.lastIndexOf(inData.charAt(i)));
            if (i != inData.lastIndexOf(inData.charAt(i))) {
                if (i > 0 && i!= inData.toCharArray().length) {
                    inData = inData.substring(0, i) + inData.substring(i + 1, inData.length());
                    i--;
                } else if(i == 0) {
                    inData = inData.substring(i + 1, inData.length());
                    i=-1;
                }else{
                    inData=inData.substring(0,inData.length()-1);
                }
            }
        }
        System.out.print(" The Duplicate character " +inData);
    }
}