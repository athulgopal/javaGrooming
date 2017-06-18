/**
 * Created by wipro on 10/12/16.
 */
public class FibonacciSeries {
    public static void main(String args[]){
        int i=0;
        int j=1;
        int temp;
        int number=100243530;
        int n=3;
        System.out.print(i+" "+j+" ");
        while (n>0){
            temp=j;
            j=i+j;
            i=temp;
            System.out.print(j+" ");
            n--;
        }
        int rev=0;
        while (number!=0){
            rev=rev*10+number%10;
            number=number/10;
        }
        System.out.println(" REv is "+rev+" ");
    }
}//
