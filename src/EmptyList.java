import java.util.ArrayList;

/**
 * Created by wipro on 10/20/16.
 */
public class EmptyList {

    public static void main(String args[]){

        ArrayList<TestSetter> lis=new ArrayList<TestSetter>();
        lis.add(null);

        for(TestSetter s:lis){
                System.out.print(" "+s.getName());
        }

    }
}
