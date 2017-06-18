/**
 * Created by wipro on 10/18/16.
 */
public class FootballCombination {
    public static void main(String args[]) throws  Exception{

        int t1=5;
        int t2=3;

        for(int i=0;i<=t1;i++) for (int j = 0; j <= t2; j++) System.out.println(i + " " + j);
        System.out.println(" ------------------ ");

        for (int n = 0; n < 10; n++) {
            int nCk = 1;
            for (int k = 0; k <= n; k++) {
                System.out.print(nCk + " ");
                nCk = nCk * (n-k) / (k+1);
            }
            System.out.println();
        }

    }
}
