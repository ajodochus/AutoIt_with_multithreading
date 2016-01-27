import static java.util.concurrent.TimeUnit.SECONDS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;


public class MainApp {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.db.de");
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(30, SECONDS).pollingEvery(2, SECONDS);

		NewThread newThread = new NewThread();
		Thread childThread = new Thread(newThread, "");
		childThread.start();
		
	

		for (int i = 0; i < 20; i++) {
			System.out.print(driver.getTitle().toString());
			wait.until(ExpectedConditions.titleIs("Willkommen auf der Konzernwebsite der Deutschen Bahn | DB Konzern"));
			driver.findElement(By.xpath(".//span[@class='normal']/a[text()='Konzern']")).click();

			wait.until(ExpectedConditions.titleIs("Konzern | DB Konzern"));
			System.out.println(driver.getTitle().toString());

			driver.findElement(By.xpath(".//*[@id='logo']/a/img")).click();
		}
		
		driver.close();

		
		
	

	}

}
