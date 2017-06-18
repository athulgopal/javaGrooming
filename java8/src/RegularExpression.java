import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by wipro on 5/17/17.
 */
public class RegularExpression {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int num=Integer.parseInt(in.nextLine());
        String vals=in.nextLine();
        BigInteger sum=new BigInteger("0");
        for(String s:vals.split("\\s+")){
            if(s!=null && !s.trim().equals("")) {
                sum = sum.add(new BigInteger(s));
            }
        }
        System.out.println(sum);

    }
}
