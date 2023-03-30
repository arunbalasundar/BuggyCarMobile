package Pages;

import java.util.Date;
import org.junit.Assert;
import org.openqa.selenium.By;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class RegisterScreen {
	 
	private AndroidDriver<MobileElement> driver;
		
	public RegisterScreen() {
	}
		
	public RegisterScreen(AndroidDriver driver) {
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}
	By lnkhome = By.xpath("//a[text()='Buggy Rating']");
	By lnkregister = By.xpath("//a[contains(text(),'Register')]");
	By txtfirstname = By.xpath("//input[@name='firstName']");
	By txtlastname = By.xpath("//input[@name='lastName']");
	By txtlogin = By.xpath("//input[@name='username']");
	By txtpassword = By.xpath("//label/following::input[@name='password']");
	By txtcpassword = By.xpath("//input[@name='confirmPassword']");
	By btncancel = By.xpath("//button[contains(text(),'Cancel')]");
	By btnregister = By.xpath("//button[contains(text(),'Register')]");
	By lblregister = By.xpath("//div[@class='result alert alert-success']");
    
	public void registerpass() throws InterruptedException {
		driver.findElement(lnkhome).click();
		driver.findElement(lnkregister).click();
		Assert.assertTrue(driver.getCurrentUrl().equals("https://buggy.justtestit.org/register"));
		clickregister();
		enterdetails();
		verifyregister();
		Thread.sleep(3000);		
	}
	
	public void registerfail() throws InterruptedException {
		driver.findElement(lnkhome).click();
		driver.findElement(lnkregister).click();
		Assert.assertTrue(driver.getCurrentUrl().equals("https://buggy.justtestit.org/register"));
		clickregister();
		enterdetails1();
		verifyregister();
		Thread.sleep(3000);		
	}
	
	
	public void verifyregister() throws InterruptedException {
		Thread.sleep(3000);	
		try{
			driver.findElement(lblregister).isDisplayed();
			Thread.sleep(3000);	
			Assert.assertTrue(driver.findElement(lblregister).getText().equals("Registration is successful"));
		}catch(Exception e) {
			System.out.println("Registration not succcessful");
		}
	}
	
	public void clickregister() throws InterruptedException {
		driver.findElement(btnregister).click();
		Thread.sleep(3000);		
	}
	
	public void enterdetails() throws InterruptedException {			
		driver.findElement(txtfirstname).sendKeys("test");
		driver.findElement(txtlastname).sendKeys("test");
		Date date = new Date();
		long timeMilli = date.getTime();
		driver.findElement(txtlogin).sendKeys("a"+timeMilli);		
		driver.findElement(txtpassword).sendKeys("A123456789a!");
		driver.findElement(txtcpassword).sendKeys("A123456789a!");
		Thread.sleep(2000);
		driver.findElement(btnregister).click();
	}
	public void enterdetails1() throws InterruptedException {			
		driver.findElement(txtfirstname).sendKeys("df");
		driver.findElement(txtlastname).sendKeys("sdf");
		driver.findElement(txtlogin).sendKeys("test");
		driver.findElement(txtpassword).sendKeys("A123456789a!");
		driver.findElement(txtcpassword).sendKeys("A123456789a!");
		Thread.sleep(2000);
		driver.findElement(btnregister).click();
	}
}
