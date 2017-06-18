import java.util.*;

/**
 * Created by wipro on 5/9/17.
 */
public class JavaOne {
    public static void main(String args[]){
        List<String> names2 = new ArrayList<String>();
        names2.add("Mahesh ");
        names2.add("Suresh ");
        names2.add("Ramesh ");
        names2.add("Naresh ");
        names2.add("Kalpesh ");
        System.out.println("Sort using Java 8 syntax: "+names2.toString());
        Collections.sort(names2,(s1,s2)-> s1.compareTo(s2));
        int i=Collections.binarySearch(names2,"Suresh",(s1,s2)-> s1.compareTo(s2));
        names2.forEach(System.out::println);
        Long aLong=new Long("271008820");
        System.out.println(" INt val is  "+aLong.intValue());

    }
}
