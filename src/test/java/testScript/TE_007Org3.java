package testScript;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import practice.CreateNewOrganizationPage;
import practice.HomePage;
import practice.OrganizationsPage;

public class TE_007Org3 extends BaseClass {
	@Test(groups="smoke")
	public void ORG_003() throws Exception{
		System.out.println("test case ORG3 executed");
		HomePage hp=new HomePage(driver);
	    hp.ClickonorganizationsMenu();
	    OrganizationsPage lp=new OrganizationsPage(driver);
	    lp.clickOnCreateNewOrganizationIcon();
	    CreateNewOrganizationPage co=new CreateNewOrganizationPage(driver);
	    String organizationName=eUtil.getDataFromExcel("Organisation",9,1);
	    String website=eUtil.getDataFromExcel("Organisation",9,2);
	    String billingAddress=eUtil.getDataFromExcel("Organisation",9,3);
	    String billingState=eUtil.getDataFromExcel("Organisation",9,4);
	    String billingCity=eUtil.getDataFromExcel("Organisation",9,5);
	    co.CreateNewOrganizationPage(organizationName,website, billingAddress, billingState,billingCity);
	   }
}
