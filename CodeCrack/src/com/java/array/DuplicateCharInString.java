package com.java.array;

import java.util.Optional;

/**
 * Created by wipro on 3/15/17.
 */
public class DuplicateCharInString {

    public static void main(String args[])throws Exception{
        String data="athul";
        for(int i=0;i<data.length();i++){


        }

        EnvironmentEnum anEnum=EnvironmentEnum.Dev;

        Optional stringToUse = Optional.of( "Athul" );
        if( stringToUse.isPresent() )
        {
            System.out.println( stringToUse.get() + " "+anEnum.name());
        }
    }
}
