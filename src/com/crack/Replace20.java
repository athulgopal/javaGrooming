package com.crack;

/**
 * Created by wipro on 11/30/16.
 */
public class Replace20 {
    public static void main(String args[]){
        String indata=" Athul Gopal ";
        String outData="";
        char [] ch=indata.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i] == ' '){
                outData=outData+"%20";
            }else {
                outData = outData + ch[i];
            }
        }
        System.out.println("   "+outData);
    }
}