package stepdefinitions;

import java.sql.Driver;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Shopping {
	
	 WebDriver driver;
	 @Given("application is launched")
	 public void application_is_launched() throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
		   driver =  new ChromeDriver() ;
		   driver.manage().window().maximize();
		   Thread.sleep(3000);
	           driver.get("http://demowebshop.tricentis.com/cart");
	           Thread.sleep(3000);
	     // Write code here that turns the phrase above into concrete actions
	    // throw new cucumber.api.PendingException();
	 }

	@Given("DemoWebShop website is launched")
	public void demowebshop_website_is_launched() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	  
           
	}
	@Given("user clicks on register button")
	public void user_clicks_on_register_button() {
	driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();

	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		
	}

	@When("user enter details")
	public void user_enter_details() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException()
		driver.findElement(By.xpath("//*[@id=\"gender-female\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys("riya");
		driver.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys("kabra");
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("riya123456@gmail.com");
		
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("riya123");
		driver.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]")).sendKeys("riya123");
	}

	@Then("clicks on submit button and register")
	public void clicks_on_submit_button_and_register() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"register-button\"]")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
		driver.close();
	}

	/*@Given("registered user clicks on login")
	public void registered_user_clicks_on_login() {
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		
	}

	@Then("he provides valid input for login")
	public void he_provides_valid_input_for_login() {
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("riya123456@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("riya123");
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		
	}

	@Then("click on login button for the login validation")
	public void click_on_login_button_for_the_login_validation() {
	    // Write code here that turns the phrase above into concrete actions
	 //   throw new cucumber.api.PendingException();
		
	}*/
	
	@Given("registered user clicks on login link")
	public void registered_user_clicks_on_login_link() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
	}

	@Then("he provides valid username {string}")
	public void he_provides_valid_username(String string1) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(string1);
	}

	@Then("he provides valid password {string}")
	public void he_provides_valid_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
	 //   throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys(string);
	}

	@Then("login successful")
	public void login_successful() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
	driver.close();
	}
	
	


	@Given("user search for item")
	public void user_search_for_item() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		
	}

	@Given("user types the desired item")
	public void user_types_the_desired_item() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		
		
	}

	@When("user clicks on search button for the item")
	public void user_clicks_on_search_button_for_the_item() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		
	}

	@Then("required item is displayed")
	public void required_item_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	
	}

	@Given("user clicks on add to cart")
	public void user_clicks_on_add_to_cart() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		
	}

	@Given("select required feature and quantity for item")
	public void select_required_feature_and_quantity_for_item() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	
	}

	@When("user add the item")
	public void user_add_the_item() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	
	}

	@Then("item is added to cart successfully")
	public void item_is_added_to_cart_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	
	}
}
