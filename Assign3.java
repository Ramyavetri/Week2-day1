package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign3 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Citicrop");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ramya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("A");
		WebElement eleDropdown = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select select = new Select(eleDropdown);
		select.selectByVisibleText("Direct Mail");
		WebElement ele1Dropdown = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select select2 = new Select(ele1Dropdown);
		select2.selectByVisibleText("Affiliate Sites");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Ramya");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("A");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mrs");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("05/03/1993");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("6,00,000.00");
		WebElement ele2Dropdown = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select select3 = new Select(ele2Dropdown);
		select3.selectByVisibleText("INR - Indian Rupee");
		WebElement ele3Dropdown = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select select4 = new Select(ele3Dropdown);
		select4.selectByVisibleText("Telecommunications");
		WebElement ele4Dropdown = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select select5 = new Select(ele4Dropdown);
		select5.selectByVisibleText("Corporation");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("6000122");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("68754506091");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("12");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("rumyaakumar@gmail.com");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Ramya");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("NO-8, F3 Sri Anejaneyar Flats");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Roja Street, CP Nagar");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
		WebElement ele5Dropdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select select6 = new Select(ele5Dropdown);
		select6.selectByVisibleText("Indiana");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("6000122");
		WebElement ele6Dropdown = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select select7 = new Select(ele6Dropdown);
		select7.selectByVisibleText("India");
		driver.findElement(By.className("smallSubmit")).click();
        String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
        System.out.println(text);
        String title = driver.getTitle();
        System.out.println(title);
		
	}

}
