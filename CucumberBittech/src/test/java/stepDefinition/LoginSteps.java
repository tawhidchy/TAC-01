package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginSteps {
	
	
	WebDriver dr;
	
	@Given("open Browser")
	public void open_browser() {
		

		
		System.setProperty("webdriver.chrome.driver", "/Users/tawhidchowdhury/Downloads/ChromeDriver");
		 dr= new ChromeDriver();
	    
	}

	@Then("user is on home page")
	public void user_is_on_home_page() {
		dr.get("https://www.target.com/");
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
	   
	}

	@Then("user click on signIn Button")
	public void user_click_on_sign_in_button() throws InterruptedException {
		dr.findElement(By.xpath("//*[@id=\"account\"]/span[1]")).click();
		Thread.sleep(3000);
	  
	}

	@Then("User Click on Create Account")
	public void user_click_on_create_account() {
		dr.findElement(By.xpath("//*[@id=\"accountNav-createAccount\"]/a/div")).click();
	   
	}

	@Then("User Type email address")
	public void user_type_email_address() {
		dr.findElement(By.id("username")).sendKeys("xyz@xyz.com");

	   
	}

	@Then("User Type First Name")
	public void user_type_first_name() {
		dr.findElement(By.id("firstname")).sendKeys("xyz");
	   
	}

	@Then("User Type Last Name Name")
	public void user_type_last_name_name() {
		dr.findElement(By.id("lastname")).sendKeys("xyz");
	  
	}

	@Then("User Type Password")
	public void user_type_password() {
		dr.findElement(By.id("password")).sendKeys("123456xyz");
	}

	@Then("User Click on Keep me sign in button")
	public void user_click_on_keep_me_sign_in_button() {
		dr.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/form/div[7]/label/div")).click();
	}

	@Then("User click on Bottom Create Account")
	public void user_click_on_bottom_create_account() {
	    dr.findElement(By.xpath("//*[@id=\"createAccount\"]")).click();
	   
	}

}
