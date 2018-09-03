package SeleniumSessions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigation {
	/* Variable Declaration */
	private static String DriverPath = "D:\\BrowserDrivers\\chromedriver.exe";
	private static String Url;
	private static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {
		Url = "http://www.google.com";
		System.setProperty("webdriver.chrome.driver", DriverPath);
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get(Url);
		Thread.sleep(1000);

		Url = "http://www.half.ebay.com";
		driver.navigate().to(Url);
		Thread.sleep(1000);

		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.quit();
	}
}
