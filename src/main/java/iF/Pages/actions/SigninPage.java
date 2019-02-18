package iF.Pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import iF.base.Page;
import iF.Pages.locators.SigninPageLocators;

public class SigninPage extends Page {
	
	
	public SigninPageLocators signinPage;
	

	public SigninPage(){
		
		this.signinPage = new SigninPageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);
		PageFactory.initElements(factory, this.signinPage);
		
	}
	
	public void doLogin(String username,String password){
		
		
		type(signinPage.email,username);
		type(signinPage.password,password);
		click(signinPage.submit);
		
	}

}
