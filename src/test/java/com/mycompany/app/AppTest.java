package com.mycompany.app;

import java.util.ArrayList;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{

    public void testPerformComputation() {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(5);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);


        assertFalse(App.performComputation(list1, list2, "add", 2)==15);
    }

    public void testPerformComputation2() {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(5);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);

        assertTrue(App.performComputation(list1, list2, "add", 2)==4);
    }

    
    public void testPerformComputationWithEmptyList() {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);

        assertTrue(App.performComputation(list1, list2, "add", 3)==-18);
    }

    
    public void testPerformComputationWithMultiply() {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(5);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);

        assertTrue(App.performComputation(list1, list2, "multiply", 3)==12);
    }

    
    public void testPerformComputationWithZeroParam4() {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(5);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);

        assertTrue( App.performComputation(list1, list2, "add", 0)==0);
    }

    
    public void testPerformComputationWithNegativeNumbers() {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(-3);
        list1.add(5);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);

        assertTrue(App.performComputation(list1, list2, "add", 2)==-8);
    }
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
