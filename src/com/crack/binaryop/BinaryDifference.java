package com.crack.binaryop;

import java.util.Scanner;

/**
 * Created by wipro on 12/12/16.
 */
public class BinaryDifference {
    public static void main(String args[]){

        Scanner scanner=new Scanner(System.in);
        System.out.print(" First number -- ");
        int one=Integer.parseInt(scanner.nextLine());

        System.out.print(" Second number -- ");
        int two=Integer.parseInt(scanner.nextLine());
        int rotate=0;
        int count=0;

//        if(one >two){
//            rotate=Integer.toBinaryString(one).length()-Integer.toBinaryString(two).length();
//            two=two << rotate;
//        }else{
//            rotate=Integer.toBinaryString(two).length()-Integer.toBinaryString(one).length();
//            one=one << rotate;
//        }

        System.out.println(Integer.toBinaryString(one)+"  "+Integer.toBinaryString(two)+" = "+Integer.toBinaryString((one ^ two)));

        for(char c:Integer.toBinaryString((one ^ two)).toCharArray()){
            if(c == '1') count++;
        }

        System.out.println(" The difference is  "+count);
    }
}