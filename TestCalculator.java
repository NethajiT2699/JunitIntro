package junitIntro;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCalculator {
    Calculator c=new Calculator();
    
    @Before
    public void showB() {
      System.out.println("welcome!");	
    }
    
    @Test
    public void test() {
      System.out.println(c.addition(12, 12)); 	
    }
    @Test
    public void testsub() {
    	System.out.println(c.subraction(14, 3));
    }
    @Test
    public void testMul() {
    	System.out.println(c.multiplication(12,11));
    }
    @Test
    public void testDiv() {
    	System.out.println(c.divition(32,5));
    }
    
    @After
    public void ShowA() {
    	System.out.println("thank you!");
    }
}
