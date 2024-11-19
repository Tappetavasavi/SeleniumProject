package testScript;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import practice.ContactsPage;
import practice.CreateNewContactsPage;
import practice.CreateNewOrganizationPage;
import practice.HomePage;
import practice.OrganizationsPage;
@Listeners(genericUtility.ListenersImpelementation.class)
public class TE_009Con extends BaseClass {
	@Test(groups="Regression")
	public void CONT_001() throws Exception
	{
	HomePage hp=new HomePage(driver);
    hp.ClickonContactsMenu();
    ContactsPage lp=new ContactsPage(driver);
    lp.clickOnCreateNewOrganizationIcon();
    Assert.fail();
    CreateNewContactsPage cp=new CreateNewContactsPage(driver);
    String fname=eUtil.getDataFromExcel("Contacts",1,1);
    String lname=eUtil.getDataFromExcel("Contacts",1,2);
    String title=eUtil.getDataFromExcel("Contacts",1,3);
    cp.CreateNewContactsPage(fname, lname, title);
    System.out.println("test case tc009 is executed");
}
    }
