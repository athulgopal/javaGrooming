package com.crack;

/**
 * Created by wipro on 2/24/17.
 */
public class Tricky {

    public Tricky(){

        System.out.println(" From the Tricky ");
    }

    public static void main(String[] args) {

        test();
    }

    public static void test(){

        System.out.println(Math.min(Double.MIN_VALUE, 0.0d));
        System.out.println(Math.min(Double.MIN_VALUE, 0.0d));
        System.out.println(Math.min(Double.MIN_VALUE, 0.0d));
        System.out.println(Double.MIN_VALUE);
    }

    public void tests(){

        System.out.println(" From the parent ");
        System.out.println(Double.MIN_VALUE);
    }

}
