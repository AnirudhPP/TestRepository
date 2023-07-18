package testCRM;

import org.testng.annotations.Test;

import com.testCRM.browserLaunch;
import com.testCRM.crmPage;
import com.testCRM.loginDetails;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class cogmentoCRMTest {

	browserLaunch open=new browserLaunch();
	loginDetails login=new loginDetails();
	crmPage page=new crmPage();
	
	@BeforeClass
	public void beforeClass() {
	
	open.openChromeBrowser("https://cogmento.com/");
	
	
	}

	@Test(priority = 1)
	public void signInPage() {
		
		login.loginPage();
		
	}
	
	@Test(priority = 2)
	public void contactsPage() {
		
		page.contactsScenario();
		
	}


	@AfterClass
	public void afterClass() {
	}

}
