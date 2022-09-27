package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLeadAsnmt2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		//Launch URL "http://leaftaps.com/opentaps/control/login"
		driver.get("http://leaftaps.com/opentaps/control/login");

		//Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		//Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();

		//Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();

		//Click on Leads Button
		driver.findElement(By.linkText("Leads")).click();

		//Click on Create Lead
		driver.findElement(By.linkText("Create Lead")).click();

		//Enter CompanyName Field Using id Locator
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");

		//Enter FirstName Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Swapna");

		//Enter LastName Field Using id Locator
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Thota");

		//Enter FirstName(Local) Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Sapna");

		//Enter Department Field Using any Locator of Your Choice
		driver.findElement(By.name("departmentName")).sendKeys("Marketting");

		//Enter Description Field Using any Locator of your choice 
		driver.findElement(By.name("description")).sendKeys("Testing Description");

		//Enter your email in the E-mail address Field 
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sappu@gmail.com");

		//Click on Create Button
		driver.findElement(By.name("submitButton")).click();

		//Click on Duplicate
		driver.findElement(By.linkText("Duplicate Lead")).click();

		//Clear the CompanyName using .clear()
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("New Company Name");
		
		//Clear the FirstName using .clear() and enter new FirstName
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("New First Name");

		//Click on Create Lead button 
		driver.findElement(By.name("submitButton")).click();

		//Get the Title of Resulting Page
		System.out.println(driver.getTitle());

	}

}
