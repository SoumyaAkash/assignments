package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class duplicateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Launch URL "http://leaftaps.com/opentaps/control/login"
		driver.get("http://leaftaps.com/opentaps/control/main");
		//Enter UserName and Password Using Id Locator
		WebElement username= driver.findElement(By.id("username"));
		username.sendKeys("Demosalesmanager");
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		//Click on Login Button using Class Locator
		WebElement login=driver.findElement(By.className("decorativeSubmit"));
		login.click();
		//Click on CRM/SFA Link	
		WebElement crmsfa=driver.findElement(By.className("crmsfa"));
		crmsfa.click();
		//Click on Leads Button
		WebElement Leads=driver.findElement(By.linkText("Leads"));
		Leads.click();
		//Click on create Leads Button
		WebElement createLead=driver.findElement(By.linkText("Create Lead"));
		createLead.click();
		//Enter CompanyName Field Using id Locator
		WebElement companyName= driver.findElement(By.id("createLeadForm_companyName"));
		companyName.sendKeys("Wipro");
		//Enter FirstName Field Using id Locator
		WebElement firstName=driver.findElement(By.id("createLeadForm_firstName"));
		firstName.sendKeys("Anila ");
		//Enter LastName Field Using id Locator
		WebElement lastName=driver.findElement(By.id("createLeadForm_lastName"));
		lastName.sendKeys("Thomas");
		//Enter FirstName(Local) Field Using id Locator
		WebElement firstNameLocal=driver.findElement(By.id("createLeadForm_firstNameLocal"));
		firstNameLocal.sendKeys("Ani");
		//Enter Department Field Using any Locator of Your Choice
		WebElement departmentName=driver.findElement(By.name("departmentName"));
		departmentName.sendKeys("IT SECTION");
		//Enter Description Field Using any Locator of your choice 
		WebElement description=driver.findElement(By.name("description"));
		description.sendKeys(" Scrum Master with 12 years of experience.");
		//Enter your email in the E-mail address Field using the locator of your choice
		WebElement emailId=driver.findElement(By.id("createLeadForm_primaryEmail"));
		emailId.sendKeys("Anitha.Thomas@wipro.in");
		//Select State/Province as NewYork Using Visible Text
		WebElement stateProvince=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		stateProvince.sendKeys("New York");
		//Click on Create Button
		WebElement submitButton=driver.findElement(By.name("submitButton"));
		submitButton.click();
	//16. Get the Title of Resulting Page(refer the video)  using driver.getTitle()	
		String title=driver.getTitle();
		System.out.println(title);
	//17. Click on Duplicate button
		WebElement duplicateLead=driver.findElement(By.linkText("Duplicate Lead"));
		duplicateLead.click();
		// 18. Clear the CompanyName Field using .clear() And Enter new CompanyName
		WebElement companyName1= driver.findElement(By.id("createLeadForm_companyName"));
		companyName1.clear();
		companyName1.sendKeys("Tata Consultancy");
       //  19.Clear the FirstName Field using .clear() And Enter new FirstName
		WebElement firstName1= driver.findElement(By.id("createLeadForm_firstName"));
		firstName1.clear();
		firstName1.sendKeys("Vanitha");
       //  20.Click on Create Lead Button
		WebElement createLead1=driver.findElement(By.linkText("Create Lead"));
		createLead1.click();
	//20. Get the Title of Resulting Page. refer the video  using driver.getTitle()
		String title1=driver.getTitle();
	  System.out.println(title1);

	}

}
