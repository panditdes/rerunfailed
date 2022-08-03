package testng_Failed;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondClassTest {

	    @Test
	    public void testMethod1() 
	    {
			System.out.println("i am testMethod1 From SecondClass");
		}
	    @Test
	    public void testMethod2() 
	    {
			System.out.println("i am testMethod2 From SecondClass");
		}
	    
	    @Test
	    public void testMethod3() 
	    {
			System.out.println("i am testMethod3 From SecondClass");
		}
	    
	    @Test
	    public void testMethod4() 
	    {
			System.out.println("i am testMethod4 From SecondClass");
		}
	    
	    @Test
	    public void testMethod5() 
	    {
			System.out.println("i am testMethod5 From SecondClass");
			Assert.fail();
		}
		

	}



