package com.crack.binarytree;

import java.util.Scanner;

/**
 * Created by wipro on 12/14/16.
 */
public class BalanceMain {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        BalanceTree bt=new BalanceTree();
        System.out.print(" Enter the number of nodes ");
        int count=Integer.parseInt(sc.nextLine());
        System.out.println(" ");
        for(int i=1;i<=count;i++){
            System.out.print(" Enter  "+i+" node data ");
            bt.insert(Integer.parseInt(sc.nextLine().trim()));
        }

        bt.printPath();
//        bt.balance();
//        System.out.println(" ---------------------- "+bt.odList.size());
//        bt.printPath();

    }//main
}//