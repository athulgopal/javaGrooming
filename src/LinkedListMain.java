/**
 * Created by wipro on 10/24/16.
 */
public class LinkedListMain {

    public static void main(String args[]){

        LinkedListMain linkedListMain=new LinkedListMain();


        System.out.println(linkedListMain.reverse("Athul"));

        LinkedList list;
        LinkedList next=null;
        LinkedList first=null;

        for(int i=0;i<10;i++) {

            list=new LinkedList();
            list.setData(new Integer(i));
            if(next!=null) next.setNext(list);
            if(i==0) first=list;

            next=list;
        }

        next.setNext(first);

        list=first;
        next=first;
        int count=0;
        boolean setFlag=false;
        while (count<30){

            if(list==null) break;

            list=list.getNext();
            count++;
            if(count%2==0){ next=next.getNext();}


            if(list==next) {

                setFlag = true;
                System.out.println(" There is a loop  " + count);
                break;
            }

        }


        if(!setFlag){
            System.out.println(" There is no loop  " );

        }

    }

    public String reverse(String input){
        char[] in = input.toCharArray();
        int begin=0;
        int end=in.length-1;
        char temp;
        while(end>begin){
            temp = in[begin];
            in[begin]=in[end];
            in[end] = temp;
            end--;
            begin++;

        }
        return new String(in);
    }
}
