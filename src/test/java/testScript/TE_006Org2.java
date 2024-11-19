package testScript;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import practice.CreateNewOrganizationPage;
import practice.HomePage;
import practice.OrganizationsPage;

public class TE_006Org2 extends BaseClass{
	@Test(groups="smoke")
	public void ORG_002() throws Exception{
		System.out.println("test case ORG2 executed");
		
		HomePage hp=new HomePage(driver);
	    hp.ClickonLeadsMenu();
	    OrganizationsPage lp=new OrganizationsPage(driver);
	    lp.clickOnCreateNewOrganizationIcon();
	    CreateNewOrganizationPage co=new CreateNewOrganizationPage(driver);
	    String organizationName=eUtil.getDataFromExcel("Organisation",5,1);
	    String website=eUtil.getDataFromExcel("Organisation",5,2);
	    String employees=eUtil.getDataFromExcel("Organisation",5,3);
	    String phone=eUtil.getDataFromExcel("Organisation",5,4);
	    String otherPhone=eUtil.getDataFromExcel("Organisation",5,5);
	    String email=eUtil.getDataFromExcel("Organisation",5,6);
	    co.CreateNewOrganizationPage(organizationName,website,employees,phone,otherPhone,email);
	   }
}
