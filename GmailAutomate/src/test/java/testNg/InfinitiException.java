package testNg;

import org.testng.annotations.Test;

public class InfinitiException {

	     @Test(timeOut=2000)
	     public void infinitloopTest() {
	    	 int i=1;
	    	 while(i==1) {
	    		 System.out.println(i);
	    	 }
	}
    //@Test(expectedExceptions=NumberFormatException.class)
    //public void testException() {
    	//String x="121J";
    	//Integer.parseInt(x);
	     {
	    	 
	     }
    	
    }

