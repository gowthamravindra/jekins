package jekins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class jekins {
	
	public void test(){
		System.setProperty("webdriver.gecko.driver", "E:\\extensions\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("pass")).sendKeys("thdh");
	}

}
