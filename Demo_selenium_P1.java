package Demo_project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_selenium_P1 {

	public static void main(String[] args) {
		System.out.println("Welcome to the class");
		System.setProperty("webdriver.chrome.driver", "E:\\Automation Testing\\Batch30_all_Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");

	}
}
