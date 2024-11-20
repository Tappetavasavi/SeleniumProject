package testScript;


import org.testng.annotations.Test;

import genericUtility.BaseClass;
import practice.CreateNewLead;
import practice.HomePage;
import practice.LeadsPage;

public class TE_002Test extends BaseClass {
	@Test//(@groups="smoke")
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
	    String title=eUtil.getDataFromExcel("Leads",1,4);
	    String phone=eUtil.getDataFromExcel("Leads",1,5);
	    String mobile=eUtil.getDataFromExcel("Leads",1,6);
	    String email=eUtil.getDataFromExcel("Leads",1,7);
	    String noOfEmp=eUtil.getDataFromExcel("Leads",1,8);
	    String street=eUtil.getDataFromExcel("Leads",1,9);
	    String postalcode=eUtil.getDataFromExcel("Leads",1,10);
	    String poBox=eUtil.getDataFromExcel("Leads",1,11);
	    String city=eUtil.getDataFromExcel("Leads",1,12);
	    String country=eUtil.getDataFromExcel("Leads",1,13);
	    String state=eUtil.getDataFromExcel("Leads",1,14);
	    cn.createNewLead(fName, lName, company);
	    System.out.println("Te_002 is executed");
		

}
}
