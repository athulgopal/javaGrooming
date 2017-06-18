/**
 * Created by wipro on 10/18/16.
 */
public class InstantiatingSingleTon {

    public static void main(String args[]) throws  Exception{

        SingleTon singleTon=SingleTon.getInstance();
        singleTon.show();

        System.out.println(singleTon);

        SingleTon singleTons=SingleTon.getInstance();
        singleTon.show();

        System.out.println(singleTons);

    }
}
