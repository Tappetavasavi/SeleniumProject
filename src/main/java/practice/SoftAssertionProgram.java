package practice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionProgram {
  /*@Test
  public void SoftComparisonSoftAssert(){
	  String expectedValue="Tharun";
	  String actualValue="tharun";
	  SoftAssert s=new SoftAssert();
	  s.assertAll();
  }*/
@Test
public void ContainsComparisonSoftAssert() {
	String expectedValue="Vassu";
	String actualValue="vassutharun";
	SoftAssert s =new SoftAssert();
	s.assertFalse(actualValue.contains(expectedValue));
	System.out.println("contains comparison soft assertion completed");
	s.assertAll();
}
}
