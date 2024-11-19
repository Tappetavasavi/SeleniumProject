package testScript;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import practice.CreateNewLead;
import practice.HomePage;
import practice.LeadsPage;

public class TE_001Test extends BaseClass {
	@Test
	public void LE_001() throws Exception
	{
		HomePage hp=new HomePage(driver);
	    hp.ClickonLeadsMenu();
	    LeadsPage lp=new LeadsPage(driver);
	    lp.clickOnCreateNewLeadIcon();
	    CreateNewLead cn=new CreateNewLead(driver);
	    String fName=eUtil.getDataFromExcel("Leads",1,1);
	    String lName=eUtil.getDataFromExcel("Leads",1,2);
	    String company=eUtil.getDataFromExcel("Leads",1,3);
	    cn.createNewLead(fName, lName, company);
		

}
}
