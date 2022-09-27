package week2.day1;

//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class Day1Assignment {
//
//	public static void main(String[] args) {
//		Assignment 1:Edit Lead
//		  1. Launch URL "http://leaftaps.com/opentaps/control/login"
//		  2. Enter UserName and Password Using Id Locator
//		  3. Click on Login Button using Class Locator
//		  4. Click on CRM/SFA Link
//		  5. Click on Leads Button
//		  6. Click on Create Lead 
//		  7. Enter CompanyName Field Using id Locator
//		  8. Enter FirstName Field Using id Locator
//		  9. Enter LastName Field Using id Locator
//		  10. Enter FirstName(Local) Field Using id Locator
//		  11. Enter Department Field Using any Locator of Your Choice
//		  12. Enter Description Field Using any Locator of your choice 
//		  13. Enter your email in the E-mail address Field 
//                14. Click on Create Button
//                15. Click on edit button
//                16. Clear the Description Field using .clear()
//		  17. Fill ImportantNote Field with Any text
//		  18. Click on update button 
//		  19. Get the Title of Resulting Page. 
//		WebDriverManager.chromedriver().setup();
//		ChromeDriver driver=new ChromeDriver();
//		driver.get("http://leaftaps.com/opentaps/control/login");
//		driver.manage().window().maximize();
		import org.openqa.selenium.By;
		import org.openqa.selenium.chrome.ChromeDriver;

		import io.github.bonigarcia.wdm.WebDriverManager;

		public class EditLead {
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
				driver.findElement(By.name("departmentName")).sendKeys("IT");

				//Enter Description Field Using any Locator of your choice 
				driver.findElement(By.name("description")).sendKeys("Testing Description Field");

				//Enter your email in the E-mail address Field 
				driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("SwapnaThota@gmail.com");

				//Click on Create Button
				driver.findElement(By.name("submitButton")).click();

				//Click on edit button
				driver.findElement(By.linkText("Edit")).click();

				//Clear the Description Field using .clear()
				driver.findElement(By.id("updateLeadForm_description")).clear();
				//driver.findElement(By.linkText("This is a automation script")).clear();

				//Fill ImportantNote Field with Any text
				driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Testing Important Note Field");

				//Click on update button 
				driver.findElement(By.name("submitButton")).click();

				//Get the Title of Resulting Page
				System.out.println(driver.getTitle());
			}
		}


