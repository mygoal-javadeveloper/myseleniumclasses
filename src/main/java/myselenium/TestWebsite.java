package myselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWebsite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/.../.../.../myseleniumclasses/src/main/java/driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///.../.../.../.../myseleniumclasses/HelloWorld.HTML");
		System.out.println(driver.getTitle());
		WebElement message = driver.findElementByTagName("h1");
		System.out.println(message.getText());
		
	}

}
