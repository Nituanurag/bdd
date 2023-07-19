package stepDefinition;

import java.net.URL;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class loginStep {
	public WebDriver driver;

	//fgffhgfhg

	@Given("user is allready on login page")
	public void user_is_allready_on_login_page() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://dsportalapp.herokuapp.com/login");
	}

	@When("user title of login page is ds portal")
	public void user_title_of_login_page_is_ds_portal() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Login",title);	
	}

	@Then("user enters user name and password")
	public void user_enters_user_name_and_password() {
		driver.findElement(By.name("username")).sendKeys("nitukaran@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Success@2022");
	}

	@Then("user click on login button")
	public void user_click_on_login_button() {
		WebElement loginBtn = driver.findElement(By.xpath("//input[@type = 'submit']"));
		loginBtn.click();
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("argument[0].click();", loginBtn);
	}

	@Then("user is on home page")
	public void user_is_on_home_page() {
		String title = driver.getTitle();
		System.out.println("Title of the homepage : "+ title);
		Assert.assertEquals("NumpyNinja", title);
	}

}
