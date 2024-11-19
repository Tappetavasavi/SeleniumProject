package testScript;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import practice.CreateNewOrganizationPage;
import practice.HomePage;
import practice.LeadsPage;
import practice.OrganizationsPage;

public class TE_005Org1 extends BaseClass {
	@Test
	public void ORG_001() throws Exception{
	HomePage hp=new HomePage(driver);
    hp.ClickonLeadsMenu();
    OrganizationsPage lp=new OrganizationsPage(driver);
    lp.clickOnCreateNewOrganizationIcon();
    CreateNewOrganizationPage co=new CreateNewOrganizationPage(driver);
    String organizationName=eUtil.getDataFromExcel("Organisation",1,1);
    String website=eUtil.getDataFromExcel("Organisation",1,2);
    String employees=eUtil.getDataFromExcel("Organisation",1,3);
    co.CreateNewOrganizationPage(organizationName,website,employees);
    System.out.println("testcase org1 executed");
   }
}

