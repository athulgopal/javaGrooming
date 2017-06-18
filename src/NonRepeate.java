import java.util.HashMap;

/**
 * Created by wipro on 10/17/16.
 */
public class NonRepeate {

    public static void main(String args[]){

        String word="teeter";
        NonRepeate nonRepeate=new NonRepeate();

        System.out.print("  "+nonRepeate.getNonRepete(word));

    }

    private String getNonRepete(String word){

        String op="";

        HashMap<String,Integer> map=new HashMap<>();

        int temp=0;
        for(int i=0;i<word.length();i++){

            temp=0;

            if(map.get((word.charAt(i) + "").toLowerCase())!=null){

                temp=map.get((word.charAt(i) + "").toLowerCase());
                map.put((word.charAt(i) + "").toLowerCase(),++temp);

            }else if ( map.get((word.charAt(i) + "").toUpperCase())!=null ){

                temp=map.get((word.charAt(i) + "").toUpperCase());
                map.put((word.charAt(i) + "").toUpperCase(),++temp);
            }
            else{
                map.put(word.charAt(i) + "",++temp);
            }
        }

        for(String k:map.keySet()){
            if(map.get(k)<=1){
                op=k;
                break;
            }
        }

        return op;
    }//getNonRepeate
}
