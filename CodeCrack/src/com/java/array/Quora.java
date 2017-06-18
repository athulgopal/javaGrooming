package com.java.array;

import java.util.Scanner;

/**
 * Created by wipro on 3/20/17.
 */
public class Quora {
    public static void main(String args[])throws Exception {

        Scanner sc = new Scanner(System.in);
        int[] alph = new int[10];
        for (int i = 0; i < alph.length; i++){
            int num = sc.nextInt();
            alph[i] = num;
        }
        int[] delt = new int[10];
        for (int i = 0; i < delt.length; i++){
            delt[i] = alph[9-i];
            System.out.println(delt[i]);
        }

    }
}
