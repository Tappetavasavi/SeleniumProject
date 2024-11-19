package practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionProgram {
     @Test
     public void StrictComparisonHardAssert(){
    	 String expectedValue="robin";
    	 String actualValue="Robin";
    	 Assert.assertEquals(actualValue,expectedValue);
    	 System.out.println("Assertion Completed");
     }
     @Test
     public void ContainsComparisonHardAssert() {
    	 String expectedValue="corn";
    	 String actualValue="babycorn";
    	 Assert.assertTrue(actualValue.contains(expectedValue));
    	 System.out.println("contains comparison completed");
     }
}
