/**
 * Created by wipro on 10/18/16.
 */
public class SingleTon {

    private static SingleTon instances=null;

    private SingleTon() throws Exception{

        if(instances!=null){
            throw new IllegalStateException("Already instantiated");
        }
    }

    public static SingleTon getInstance() throws  Exception{

        if(instances==null) instances=new SingleTon();
        return instances;
    }

    public SingleTon clone() throws CloneNotSupportedException{
        throw new CloneNotSupportedException("Cannot clone instance of this class");
    }

    public void show(){

        System.out.println("Hii");
    }

}
