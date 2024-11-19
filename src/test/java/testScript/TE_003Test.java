package testScript;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import practice.CreateNewLead;
import practice.HomePage;
import practice.LeadsPage;

public class TE_003Test extends BaseClass {
	@Test
	public void LE_004() throws Exception
	{
		HomePage hp=new HomePage(driver);
	    hp.ClickonLeadsMenu();
	    LeadsPage lp=new LeadsPage(driver);
	    lp.clickOnCreateNewLeadIcon();
	    CreateNewLead cn=new CreateNewLead(driver);
	    String fName=eUtil.getDataFromExcel("Leads",9,1);
	    String lName=eUtil.getDataFromExcel("Leads",9,2);
	    String company=eUtil.getDataFromExcel("Leads",9,3);
	    String title=eUtil.getDataFromExcel("Leads",9,4);
	    String phone=eUtil.getDataFromExcel("Leads",9,5);
	    String mobile=eUtil.getDataFromExcel("Leads",9,6);
	    String email=eUtil.getDataFromExcel("Leads",9,7);
	    String noOfEmp=eUtil.getDataFromExcel("Leads",9,8);
	   
    }
	
}
