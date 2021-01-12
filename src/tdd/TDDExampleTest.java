package tdd;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.After;
import org.junit.Before;

import tdd.TDDExample;


public class TDDExampleTest {

    @Before
    public void before() {

    }

    @After
    public void after() {

    }

    @Test
    public void test1() {
      int arr[] = {1, 2, 3};
      assertEquals(3, TDDExample.highestNumber(arr, 0));
    }

    @Test
    public void test2() {
      int arr[] = {1, 2, 3};
      assertFalse(TDDExample.containsNumber(arr, 4, 0));
    }
 
    
}