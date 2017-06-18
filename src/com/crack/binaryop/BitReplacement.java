package com.crack.binaryop;

import java.util.Scanner;

/**
 * Created by wipro on 12/12/16.
 */
public class BitReplacement {
    public static void main(String args[]){

        Scanner scanner=new Scanner(System.in);
        String d=scanner.nextLine();
        int  num=0b10000000000;
        int  st=2;
        int  nd=6;
        int  repl=0b10101;
             repl=repl << st;
        int  op=num | repl;

             System.out.println(d);
             System.out.println(Integer.toBinaryString(num));
             System.out.println("    "+Integer.toBinaryString(repl));
             System.out.println(Integer.toBinaryString(op));



    }
}
