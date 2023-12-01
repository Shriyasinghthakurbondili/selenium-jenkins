package pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
 
	@FindBy(xpath="//a[text()='Log in']")
	static WebElement login_Link;
	@FindBy(xpath="//input[@id='Email']")
	static WebElement email_field;
	@FindBy(xpath="//input[@id='Password']")
	static WebElement password_field;
	@FindBy(xpath="(//input[@type='submit'])[2]")
	static WebElement login_button;
	@FindBy(xpath="(//a[text()='Log out'])")
	public WebElement logout_button;
	//@FindBy(xpath="(//a[text()='Log out'])")
	//static WebElement logout;
	
     public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
     public void Login_details(String email, String password) throws InterruptedException{
 		
    	 login_Link.click();
    	 email_field.sendKeys(email);
    	 password_field.sendKeys(password);
    	 login_button.click();
    	
     }
}
