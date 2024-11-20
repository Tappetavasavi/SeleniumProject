package testScript;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import practice.CreateNewLead;
import practice.HomePage;
import practice.LeadsPage;

public class TE_004 extends BaseClass{
	@Test
	public void LE_004() throws Exception
	{
		HomePage hp=new HomePage(driver);
	    hp.ClickonLeadsMenu();
	    LeadsPage lp=new LeadsPage(driver);
	    lp.clickOnCreateNewLeadIcon();
	    CreateNewLead cn=new CreateNewLead(driver);
	    String fName=eUtil.getDataFromExcel("Leads",13,1);
	    String lName=eUtil.getDataFromExcel("Leads",13,2);
	    String company=eUtil.getDataFromExcel("Leads",13,3);
	    String street=eUtil.getDataFromExcel("Leads",13,4);
	    String postalcode=eUtil.getDataFromExcel("Leads",13,5);
	    String poBox=eUtil.getDataFromExcel("Leads",13,6);
	    String city=eUtil.getDataFromExcel("Leads",13,7);
	    String country=eUtil.getDataFromExcel("Leads",13,8);
	    String state=eUtil.getDataFromExcel("Leads",13,9);
	    cn.createNewLead(fName, lName, company,street,postalcode,poBox,city,country,state);
	    System.out.println("Te_004 is executed");
	    
	}

}
