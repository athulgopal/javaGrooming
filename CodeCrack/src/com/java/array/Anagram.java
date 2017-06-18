package com.java.array;

import java.util.Arrays;

/**
 * Created by wipro on 3/16/17.
 */
public class Anagram {
    public static void main(String args[])throws Exception {
        String checkDataOne = new String("Athul");
        String checkDataTwo = new String("Athul");
        char[] two;
        char[] one;
        boolean isAnagram = false;
        try{
            char a='a';
            char b='b';
            System.out.print(a+b);

            if (checkDataOne.length() == checkDataTwo.length()) {
                one = checkDataOne.toCharArray();
                two= checkDataTwo.toCharArray();
                Arrays.sort(one);
                Arrays.sort(two);
                isAnagram = Arrays.equals(one, two);
            }
//            if (isAnagram)
//                System.out.print(checkDataOne + " and " + checkDataTwo + " are Anagrams");
//            else
//                System.out.print(checkDataOne + " and " + checkDataTwo + " are not Anagrams");
        }catch(Exception e){
            e.printStackTrace();;
        }finally {
            checkDataOne=null;
            checkDataTwo=null;
            two=null;
            one=null;
        }
    }
}