package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class alerthandling {
	WebDriver driver;

	@Test
	public void open() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", ".\\Data_Files\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		//driver.findElement(By.linkText("Generate Alert Box")).click();
		/*driver.findElement(By.xpath("//button[contains(.,'Generate Alert Box')]")).click();
		Alert accept = driver.switchTo().alert();
		System.out.println(accept.getText());
		accept.accept();*/
		//Thread.sleep(5000);
		/*driver.findElement(By.xpath("//button[contains(.,'Generate Confirm Box')]")).click();
		System.out.println(accept.getText());
		accept.dismiss();*/
		//accept.getText();
		//System.out.println(accept);
		
		WebElement from = driver.findElement(By.id("sourceImage"));
		WebElement to = driver.findElement(By.id("targetDiv"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(from,to).build().perform();
		
	}
}
