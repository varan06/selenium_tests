package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleTest {
public static void main(String[] args) {
	
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\hp\\Downloads\\geckodriver-v0.21.0-win64/geckodriver.exe");
	WebDriver firefox= new FirefoxDriver();
	firefox.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-server/3.13.0");
	firefox.quit();
}
}
