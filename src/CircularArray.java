/**
 * Created by wipro on 11/15/16.
 */
public class CircularArray {
    static int val=0;
    public static void main(String args[]){

        //int[] list={1,2,3,4,5,6,7};
        int[] list={4,3,2,1,7,6,5};
        //int[] list={7};
        val=list[0];
        CircularArray circularArray=new CircularArray();

        System.out.println("Max is "+ circularArray.largeVal(0,list));
    }

    private int largeVal(int start,int[] list){


        int len=list.length-(start-1);

        System.out.println("");
        System.out.println("Came 1 "+start);
        System.out.println("Came 2 "+list[start]);
        System.out.println("Came 3 "+list[len/2]);
        System.out.println("Val    "+val);

        if(list[start]>list[len/2]) {

            if(list[start]<val){

                System.out.println("1 Got it "+val);
                return val;
            }
            else{

                val=list[start];
                if(start<list.length-1)
                    largeVal(start+1,list);
                else {

                    System.out.println("3 Got it "+val);
                    return val;
                }
            }

        }
        else if(list[start]<list[len/2]){

            if(list[len/2]<=val) {
                System.out.println("2 Got it "+val);
                return val;
            }
            else{
                val=list[len/2];
                largeVal((len/2),list);
            }

        }
        return val;

    }
}
