package week2.homeassignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateFBAccount {
	
	public static void main(String[] args){
		 ChromeOptions option = new ChromeOptions();
		 option.addArguments("guest");
		 ChromeDriver driver=new ChromeDriver(option); 
		 driver.get("https://en-gb.facebook.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")).click();
		 driver.findElement(By.name("firstname")).sendKeys("Dineshkumar");
		 driver.findElement(By.name("lastname")).sendKeys("R");
		 WebElement Day = driver.findElement(By.id("day"));
		 Select DropDown1 = new Select(Day);
		 DropDown1.selectByValue("25");
		 
		 WebElement Month = driver.findElement(By.id("month"));
		 Select DropDown2 = new Select(Month);
		 DropDown2.selectByVisibleText("Feb");
		
		 WebElement Year = driver.findElement(By.id("year"));
		 Select DropDown3 = new Select(Year);
		 DropDown3.selectByVisibleText("2000");
		 
		 driver.findElement(By.xpath("//input[@type='radio' and @value='2']")).click();	
		 
		 driver.findElement(By.name("reg_email__")).sendKeys("9659219161");
		 driver.findElement(By.id("password_step_input")).sendKeys("Luna@9090");

	}
	
}