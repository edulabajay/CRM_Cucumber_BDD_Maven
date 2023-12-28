package com.stepdefinitions;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.core.logging.Logger;
import io.cucumber.core.logging.LoggerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class LoginStepDefinitions {


    private static final Logger logger = LoggerFactory.getLogger(LoginStepDefinitions.class);

	WebDriver driver;

	@Given("User should be on login page")
	public void user_should_be_on_login_page() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://ui.cogmento.com/");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS );
		driver.manage().window().maximize(); 
	}

	@When("Title of login page is Free CRM")
	public void title_of_login_page_is_free_crm() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Cogmento CRM", title);

	}


	/*case - 1 Login Page methods without data driven testing*/
	
	/*
	@Then("User enters username and password")
	public void user_enters_username_and_password() {
		driver.findElement(By.name("email")).sendKeys("ajaybalajikadam69@gmail.com");
		driver.findElement(By.name("password")).sendKeys("edulab321");

	}*/
	/*case - 2 Login Page methods with data driven testing*/

	
	@Then("User enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_and_password(String username , String password) {

		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
	}
 
	@Then("User clcik on login button")
	public void user_clcik_on_login_button() {
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click(); 

	}

	@Then("User should be on home page")
	public void user_should_be_on_home_page() {
		String title = driver.getTitle();
		System.out.println("home page title::: "+ title);
		Assert.assertEquals("Cogmento CRM", title);    

	}


	@Then("user redirect to new conatct page")
	public void user_redirect_to_new_conatct_page() {
		driver.findElement(By.xpath("//span[normalize-space()='Contacts']")).click();
	}


	@Then("user will click on create conatct button")
	public void user_will_click_on_create_conatct_button() {
	
		driver.findElement(By.xpath("//button[normalize-space()='Create']")).click();
	}




	/*case - 3  Create new contacts Page methods without data driven testing*/
/*
	@Then("user enters first name and middle name and last name and company name")
	public void user_enters_first_name_and_middle_name_and_last_name_and_company_name() {
	
		driver.findElement(By.name("first_name")).sendKeys("Rahul");
		driver.findElement(By.name("middle_name")).sendKeys("Edulab");
		driver.findElement(By.name("last_name")).sendKeys("Rajbhar");
		driver.findElement(By.xpath("//div[@name='company']//input[@type='text']")).sendKeys("EDULAB EXCHANGE");
	}*/

	/*case - 4  Create new contacts Page methods with data driven testing*/
	@Then("user enters \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	public void user_enters_first_name_and_middle_name_and_last_name_and_company_name(String firstname, String middlename, String lastname, String companyname) {
	    try {
	        driver.findElement(By.name("first_name")).sendKeys(firstname);
	        driver.findElement(By.name("middle_name")).sendKeys(middlename);
	        driver.findElement(By.name("last_name")).sendKeys(lastname);
	        driver.findElement(By.xpath("//div[@name='company']//input[@type='text']")).sendKeys(companyname);
	    } catch (Exception e) {
	        // Handle the exception (e.g., log it, report it, take a screenshot, etc.)
	        e.printStackTrace(); // This is just an example; you may want to use a logging framework
	    }
	}

	
	@Then("user click on save button")
	public void user_click_on_save_button() {
		driver.findElement(By.xpath("//i[@class='save icon']")).click();
	}



	@Then("close the browser")
	public void close_the_browser() {
		driver.quit();
	}

	public static Logger getLogger() {
		return logger;
	}



}
