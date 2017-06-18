/**
 * Created by Athul on 10/12/16.
 */
public class LinkedListTest {

    String reverse="";

    public static void main(String args[]) {

        LinkedListTest listTest=new LinkedListTest();

        Node node1=new Node("1");
        Node node2=new Node("2");
        Node node3=new Node("3");
        Node node4=new Node("4");
        Node node5=new Node("5");

        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);

        Node current =node1;
        Node mid =node1;
        int len=0;

        do {

            len++;
            if(len%2==0) mid=mid.next;
            current=current.next;

        }while (current.next!=null);

        System.out.println(" Middle node is  "+mid.data);

        listTest.rev(node1,listTest);


        System.out.print(listTest.reverse);

    }



    public Node rev(Node current,LinkedListTest listTest){

        if(current.next!=null){
            rev(current.next,listTest);
        }

        listTest.reverse=listTest.reverse+current.data;
        System.out.println("  "+current.data);

        return current;
    }

}