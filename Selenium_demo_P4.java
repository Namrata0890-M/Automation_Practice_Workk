package Demo_selenium_p4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class Selenium_demo_P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("My Name is Namrata. I am An Engineer!!");
		System.setProperty("webdriver.chrome.driver", "E:\\Automation Testing\\Batch30_all_Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.instagram.com");
		driver.get("file:///E:/Automation%20Testing/HTML_Files_%20automation/signup.html");
		//driver.get("E:\\Automation Testing\\HTML_Files_ automation\\signup.html");
		
		//(to test the first name element text box by.id locator)
		driver.findElement(By.id("firstname")).sendKeys("Namrata");	
		
		//(to test the last name element text by.id locator)
		//driver.findElement(By.id("lastname")).sendKeys("Mane");
		
		//(you can also test with by.name locator)
		driver.findElement(By.name("lastname")).sendKeys("Dattu");
		
		//to test mobile number element by id)
		//driver.findElement(By.id("mobilenumber")).sendKeys("123456789");
		
		//(to test mobile number element by name) 
		driver.findElement(By.name("mobilenumber")).sendKeys("789456123");
		
		//(to test email id element by id)
		//driver.findElement(By.id("email")).sendKeys("abc123@gmail.com");
		
		//(to test email id by name)
		driver.findElement(By.name("email")).sendKeys("xyz789@gmail.com");
		
		//(to test address by id)
		//driver.findElement(By.id("address")).sendKeys("6/11,abc building,dadasaheb dhokle road,mountain,tekadi-123456");
		
		//(to test address element by name locator)
		driver.findElement(By.name("address")).sendKeys("6/11,abc building,dadasaheb dhokle road,mountain,tekadi-123456");
		
	}
}
