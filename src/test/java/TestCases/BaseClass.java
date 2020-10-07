package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {

	WebDriver driver = null;

	@BeforeClass
	@Parameters({ "url", "browser", "username", "password" })
	public void WebDriverManager1(String url, String browser, String username, String password)
			throws InterruptedException {

		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Atul\\workspace\\IM\\Driver\\chromedriver_win32\\chromedriver.exe");
			System.out.println("chrome");
			driver = new ChromeDriver();

		} else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\Atul\\workspace\\IM\\Driver\\geckodriver-v0.27.0-win64\\geckodriver.exe");
			System.out.println("firefox");
			driver = new FirefoxDriver();

		} else if (browser.equals("IE")) {
			System.setProperty("webdriver.chrome.driver",
					"D:\\atul\\software\\selenium\\eclipse-SDK-4-2-1-win32-x86_64\\chromedriver_win32\\chromedriver.exe");
			System.out.println("IE");
			driver = new ChromeDriver();

		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		if (driver.findElement(By.xpath("//*[@id='body']")).isDisplayed()){
			driver.findElement(By.xpath("//*[@id='details-button']")).click();
			driver.findElement(By.xpath("//*[@id='proceed-link']")).click();
		}
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='UserName']")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id='TxtPassword']")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id='TheForm']/div[1]/div/div[2]/input")).click();
		if (driver.findElement(By.xpath("//*[@id='infoMessage_popover']/div/div")).isDisplayed()) {
			driver.findElement(By.xpath("//*[@id='popup']/div[2]/div/a[1]")).click();
		}
		driver.findElement(By.xpath("//*[@id='ChooseUserGroupForm']/div/div/div[2]/a[1]")).click();
		Thread.sleep(2000);
	}

	@AfterClass
	public void QuitBrowser() {
		driver.quit();
	}

}
