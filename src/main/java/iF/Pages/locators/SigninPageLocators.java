package iF.Pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SigninPageLocators {
	
	
	@FindBy(css="#ContentPlaceHolder_ContentPlaceHolder_ContentPlaceHolder_txtName")
	public WebElement email;
	@FindBy(css="#ContentPlaceHolder_ContentPlaceHolder_ContentPlaceHolder_txtPassword")
	public WebElement password;
	@FindBy(css="#ContentPlaceHolder_ContentPlaceHolder_ContentPlaceHolder_btnSignIn")
	public WebElement submit;

}
