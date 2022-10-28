package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	 
	 @FindBy(id="username")
	 private WebElement uname;
	 @FindAll({
		 @FindBy(id="password"),
		 @FindBy(name="password")
		 })
	 private WebElement pwd;



	 
	 @FindAll({
		 @FindBy(id="login"),
		 @FindBy(className="button"),
		 @FindBy(name="login_button")
 })
	 private WebElement loginbtn;


	public void enterUsername(String user) {
		// TODO Auto-generated method stub
		uname.sendKeys(user);
//		pwd.sendKeys(pass);
//		loginbtn.click();
		
	}
	public void enterPasswordn(String pass) {
		// TODO Auto-generated method stub
		//uname.sendKeys(user);
		pwd.sendKeys(pass);
		//loginbtn.click();
		
	}
	public void clicklogin() {
		// TODO Auto-generated method stub
		//uname.sendKeys(user);
		//pwd.sendKeys(pass);
		loginbtn.click();
		
	}
	 
	 
	 

}