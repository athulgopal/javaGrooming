/**
 * Created by wipro on 12/1/16.
 */
public class LinkedListOps {
    public static void main(String args[]){

        LinkedList first=null;
        LinkedList newNode;
        String[] inps={"1","2","3","4","5","6"};

        for(String data:inps)
            if(first==null){
                first=new LinkedList();
                first.setData(data);
            }else{
                LinkedList node=first;
                while(node.getNext()!=null) node=node.getNext();

                newNode=new LinkedList();
                newNode.setData(data);
                node.setNext(newNode);
            }
        newNode=first;
        while(newNode.getNext()!=null){
            System.out.println("  "+newNode.getData());
            newNode=newNode.getNext();
        }
    }
}
