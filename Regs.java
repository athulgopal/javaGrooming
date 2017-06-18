import org.apache.xerces.impl.xpath.regex.RegularExpression;

/**
 * Created by wipro on 10/18/16.
 */
public class Regs {

    public static void main(String args[]){

        //String reg2="/^[0-9A-Fa-f]{8}-[0-9A-Fa-f]{4}-[2][0-9A-Fa-f]{4}-[8-9A-Ba-b][0-9A-Fa-f]{3}-[0-9A-Fa-f]{12}$/";
        String reg1="^([A-Za-z0-9]+[A-Za-z0-9_]*(?<!_))+$";
        String reg2="/^[0-9A-Fa-f]{8}-[0-9A-Fa-f]{4}-[0-9A-Fa-f]{4}-[8-9A-Ba-b][0-9A-Fa-f]{3}-[0-9A-Fa-f]{12}$/";

        String reg3="[0-9A-Fa-f]{8}-[0-9A-Fa-f]{4}-[0-9A-Fa-f]{4}-[8-9ABab][0-9A-Fa-f]{3}-[0-9A-Fa-f]{12}";
        String reg4="^([0-9]+\\.){2}[0-9]+$";



        String test="0  hfhgd";
        String uuid="123e4567-e89b-12d3-a456-426655440000";
        String uid ="123e4567-e89b-12d3-a456-426655440000";
        String ipv="test";


        RegularExpression expression=new RegularExpression(reg1);
        //RegularExpression expression=new RegularExpression("[a-zA-Z_]+");
       // expression.setPattern("[a-zA-Z_]+");

        if(expression.matches(ipv)){

            System.out.print("Came 4 "+test);
        }
//        if(test.matches(reg1)){
//
//            System.out.print("Came 1");
//        }

//        if(uid.matches(reg3)){
//
//            System.out.print("Came 2");
//        }
//R
//        if(uuid.matches(reg2)){
//
//            System.out.print("Came 2");
//        }
    }
}
