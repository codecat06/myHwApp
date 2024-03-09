package com.mycompany.app;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static int performComputation(ArrayList<Integer> list1, int[] array2, String param3, int param4) {
        // Perform a meaningful computation on the parameters
        int result = 0;

        for (Integer num : list1) {
            result += num;
        }

        for (int num : array2) {
            result -= num;
        }

        result *= param4;

        if (param3.equals("multiply")) {
            result *= 2;
        }

        return result;
    }
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
