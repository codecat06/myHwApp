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
        list1.add(0);
        list1.add(1);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);

        assertEquals("hellohihe123", App.performComputation(list1, list2, "hello", "hi"));
    }

    public void testPerformComputation2() {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(0);
        list1.add(1);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);

        assertFalse("asada".equals(App.performComputation(list1, list2, "hello", "hi")));
    }

    public void testPerformComputationWithEmptyList() {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        assertEquals("hellohi", App.performComputation(list1, list2, "hello", "hi"));
    }

    public void testPerformComputationWithListOneEmpty() {
        ArrayList<Integer> list1 = new ArrayList<>();

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);

        assertEquals("hellohi123", App.performComputation(list1, list2, "hello", "hi"));
    }

    public void testPerformComputationWithListTwoEmpty() {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(0);
        list1.add(1);

        ArrayList<Integer> list2 = new ArrayList<>();

        assertEquals("hellohihe", App.performComputation(list1, list2, "hello", "hi"));
    }

    public void testPerformComputationWithNegativeNumbers() {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(-3);
        list1.add(5);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);

        assertEquals("Wrong input for Box1", App.performComputation(list1, list2, "hello", "hi"));
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
