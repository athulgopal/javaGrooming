import java.util.Arrays;

/**
 * Created by wipro on 5/11/17.
 */
public class ReduceMap {
    public static void main(String args[]){

        String[] myArray = { "this", "is", "a", "sentence" };
        String result = Arrays.stream(myArray)
                .reduce("", (a,b) -> a + b);
        System.out.print("  "+result);
    }
}
