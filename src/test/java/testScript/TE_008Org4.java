package testScript;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import practice.CreateNewOrganizationPage;
import practice.HomePage;
import practice.OrganizationsPage;

public class TE_008Org4 extends BaseClass{
	@Test(groups="smoke")
	public void ORG_004() throws Exception
	{
		System.out.println("test case ORG4 executed");
	HomePage hp=new HomePage(driver);
    hp.ClickonLeadsMenu();
    OrganizationsPage lp=new OrganizationsPage(driver);
    lp.clickOnCreateNewOrganizationIcon();
    CreateNewOrganizationPage co=new CreateNewOrganizationPage(driver);
    String organizationName=eUtil.getDataFromExcel("Organisation",13,1);
    String website=eUtil.getDataFromExcel("Organisation",13,2);
    String employees=eUtil.getDataFromExcel("Organisation",13,3);
    String phone=eUtil.getDataFromExcel("Organisation",13,4);
    String otherPhone=eUtil.getDataFromExcel("Organisation",13,5);
    String email=eUtil.getDataFromExcel("Organisation",13,6);
    String billingAddress=eUtil.getDataFromExcel("Organisation",13,7);
    String billingState=eUtil.getDataFromExcel("Organisation",13,8);
    String billingCity=eUtil.getDataFromExcel("Organisation",13,9);
    co.CreateNewOrganizationPage(organizationName,website,employees,phone,otherPhone,email,billingAddress,billingState,billingCity);
     }
}
