
public class OddNumber {

    final int nums;
    public static void main(String args[]){

        int[] arr={5,5,6,5,5};
        OddNumber number=new OddNumber();
        System.out.print(number.solution(arr));


    }

    public OddNumber(){

        nums=10;
    }

    public int solution(int[] A) {

        if(A.length<2) return -1;
        else{
            for(int i=0;i<A.length-2;i++){
                if(A[i]!=A[i+2]){
                    if(i+4 <=A.length-1){
                        if(A[i+2]!=A[i+4]) return A[i+2];
                        else return A[i];
                    }else if(i-2 >=0){
                        if(A[i-2]!=A[i]) return A[i];
                        else return A[i+2];
                    }else{
                        return A[i+2];
                    }
                }
            }
        }

        return -1;
    }
}