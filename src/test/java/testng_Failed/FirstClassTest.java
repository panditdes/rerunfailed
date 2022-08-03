package testng_Failed;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstClassTest {
	
	//Run failed test cases using run time 
		
	  @Test
	    public void testMethod1() 
	    {
			System.out.println("i am testMethod1 From FirstClass");
		}
	    @Test
	    public void testMethod2() 
	    {
			System.out.println("i am testMethod2 From FirstClass");
		}
	    
	    @Test
	    public void testMethod3() 
	    {
			System.out.println("i am testMethod3 From FirstClass");
		}
	    
	    @Test
	    public void testMethod4() 
	    {
			System.out.println("i am testMethod4 From FirstClass");
		}
	    
	    @Test
	    public void testMethod5() 
	    {
			System.out.println("i am testMethod5 From FirstClass");
			Assert.fail();
		}

	    
//	    <build>
//
//	    <plugins>
//
//	    <plugin>
//
//	     <groupId>org.apache.maven.plugins</groupId>
//	        <artifactId>maven-surefire-plugin</artifactId>
//	        <version>3.0.0-M7</version>
//
//	    </plugin>
//
//	    </plugins>
//
//	    </build>

}
