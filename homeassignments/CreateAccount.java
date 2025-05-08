package week2.homeassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		 option.addArguments("guest");
		 ChromeDriver driver=new ChromeDriver(option); 
		 driver.get("http://leaftaps.com/opentaps/");
		 driver.manage().window().maximize();
		 driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.partialLinkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Accounts")).click();
		 driver.findElement(By.linkText("Create Account")).click();
		 
		 driver.findElement(By.id("accountName")).sendKeys("Dineshkumar R");
		 driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		 WebElement IndustryDD = driver.findElement(By.name("industryEnumId"));
		 Select DD1 = new Select(IndustryDD);
		 DD1.selectByIndex(3);
		 
		 WebElement IndustryDD1 = driver.findElement(By.name("industryEnumId"));
		 Select SelectDD1 = new Select(IndustryDD1);
		 SelectDD1.selectByIndex(3);
		 
		 WebElement Ownership = driver.findElement(By.name("ownershipEnumId"));
		 Select SelectDD2 = new Select(Ownership);
		 SelectDD2.selectByVisibleText("S-Corporation");
		 
		 WebElement Source = driver.findElement(By.id("dataSourceId"));
		 Select SelectDD3 = new Select(Source);
		 SelectDD3.selectByValue("LEAD_EMPLOYEE");
		 
		 WebElement MarketingCampaign = driver.findElement(By.name("marketingCampaignId"));
		 Select SelectDD4 = new Select(MarketingCampaign);
		 SelectDD4.selectByIndex(6);
		 
		 WebElement StateProvince = driver.findElement(By.id("generalStateProvinceGeoId"));
		 Select SelectDD5 = new Select(StateProvince);
		 SelectDD5.selectByValue("TX");
		 
		 driver.findElement(By.className("smallSubmit")).click();
		 WebElement name = driver.findElement(By.partialLinkText("Dineshkumar"));
		 String actualName = name.getText();
		 String ExpectedName = "Dineshkumar r";
		 if (actualName.contains(ExpectedName)) {
			System.out.println("Account name is displaying correctly");
		}
		 else {
			System.out.println("Account name is not displaying correctly");
		}
		 
		driver.close();
	}
}
