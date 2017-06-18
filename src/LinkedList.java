/**
 * Created by wipro on 10/24/16.
 */
public class LinkedList {

    private Object data;
    private LinkedList next;

    public Object getData() {
        return data;
    }

    public LinkedList getNext() {
        return next;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void setNext(LinkedList next) {
        this.next = next;
    }
}
