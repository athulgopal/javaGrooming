package com.crack;

/**
 * Created by wipro on 11/30/16.
 */
public class Anagram {
    public static void main(String args[]){

        Anagram anagram=new Anagram();
        System.out.println(" -- "+anagram.isAnagram("ab","bbaac"));
    }
    private boolean isAnagram(String n1, String n2){
        boolean isAnagram=false;
        int sum1=0;
        int sum2=0;

        n1=unique(n1);
        n2=unique(n2);
        if(n1.length()!=n2.length())
            return isAnagram;
        for(Character c:n1.toCharArray())
            sum1=sum1+c;
        for(Character c:n2.toCharArray())
            sum2=sum2+c;
        if(sum1==sum2)
            isAnagram=true;
        return isAnagram;
    }//isAnagram
    private String unique(String inData){

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
        return inData;
    }
}