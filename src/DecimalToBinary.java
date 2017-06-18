/**
 * Created by Athul on 10/13/16.
 */
public class DecimalToBinary {

    public static void main(String args[]){

        DecimalToBinary toBinary=new DecimalToBinary();
        String bin=new StringBuffer(toBinary.getBinary(4)).reverse().toString();
        System.out.println(bin);
        System.out.println(toBinary.getSequence(bin));
    }

    public String getBinary(int number){

        String bin="";
        while(number>0){

            bin=bin+(number%2);
            number=number/2;
        }
        return bin;
    }

    public int getSequence(String bin){
        int val=0;
        int now=0;
        int num=Integer.parseInt(bin);

        while (num >0){
            int temp=num%10;
            num=num/10;

            if(temp==0){
                now++;
            }else if(now>val){
                val=now;
                now=0;
            }

        }
        return val;
    }
//
}