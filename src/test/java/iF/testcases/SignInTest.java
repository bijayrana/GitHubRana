package iF.testcases;


import java.util.Hashtable;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import iF.base.Page;
import iF.Pages.actions.SigninPage;
import iF.utilities.Utilities;

public class SignInTest {

 
	//Test112  qa123q1211
	@Test(dataProviderClass=Utilities.class,dataProvider="dp")
	public void signInTest(Hashtable<String,String> data)  {
		
		if(data.get("runmode").equalsIgnoreCase("N")){
			
			throw new SkipException("Skipping the test as the Run mode is NO");
			
			
		}
		Page.initConfiguration();
		SigninPage signin = new SigninPage();
		//Thread.sleep(1000);
		signin.doLogin(data.get("username"), data.get("password"));
		
		
	}
	
	
	@AfterMethod
	public void tearDown(){
		if(Page.driver!=null){
		Page.quitBrowser();
		}
	}
}
