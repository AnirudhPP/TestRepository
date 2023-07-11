package testCRM;

import org.testng.annotations.Test;

import com.testCRM.browserLaunch;
import com.testCRM.loginDetails;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class cogmentoCRMTest {

	browserLaunch open=new browserLaunch();
	loginDetails login=new loginDetails();
	
	@BeforeClass
	public void beforeClass() {
	
	open.openChromeBrowser("https://cogmento.com/");
	
	
	}

	@Test
	public void signInPage() {
		
		login.loginPage();
		
	}


	@AfterClass
	public void afterClass() {
	}

}
