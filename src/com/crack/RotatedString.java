package com.crack;

/**
 * Created by wipro on 11/30/16.
 */
public class RotatedString {
    public static void main(String args[]){
        String n1="waterbottle";
        String n2="erbottlewat";

        n1=n1+n2;

        if(n1.length()== (2*n2.length()) && n1.contains(n2)){
            System.out.println("    Rotated");
        }else{
            System.out.println("Not Rotated");
        }

    }
}
