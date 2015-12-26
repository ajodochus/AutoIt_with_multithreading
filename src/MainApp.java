import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MainApp {

	public static void main(String[] args) {
		

		NewThread newThread = new NewThread();
		WebDriver driver = new FirefoxDriver();
	      driver.get("http://www.google.de");
	      System.out.println("th name: " + newThread.toString());
	      newThread.stopThread();
	      System.out.println("th name: " + newThread.toString());
	      
	      

	}

}
