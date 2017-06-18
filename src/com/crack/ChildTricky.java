package com.crack;

/**
 * Created by wipro on 2/24/17.
 */
public class ChildTricky extends Tricky {

    public ChildTricky(){

        System.out.println(" From the ChildTricky ");
    }



    @Override
    public void tests(){
        System.out.println(" From the child ");
        System.out.println(Double.MIN_VALUE);
    }

    public static void main(String args[]){

        ChildTricky tricky = new ChildTricky();
        System.out.println(" --------------- ");
        Tricky tricky1     = new ChildTricky();
        System.out.println(" --------------- ");
        Tricky tricky2     = new Tricky();
        System.out.println(" --------------- ");
        ChildTricky trickys    = new Trickys();
        System.out.println(" --------------- ");

       /* tricky.tests();
        tricky1.tests();
        tricky2.tests();*/

        trickys.tests();

    }
}

class Trickys extends ChildTricky{

    public Trickys(){

        System.out.println(" From the child Tricky");
    }
}
