package TestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ProfileAction extends BaseClass {

	@Test(priority=1)
	public void AlwaysGenerateAction() throws InterruptedException {

		driver.findElement(By.xpath("//*[@id='li_functional']/a/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='div_functional']/ul/li[12]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='grid_profiles']/div[2]/table/tbody/tr[2]/td[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='divShowUpdatePanel']/a/img")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='divShowCreatePanel']/a/img")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='ProfileActionCat']")).sendKeys("Always generate actions    ");
		driver.findElement(By.xpath("//*[@id='ProfileActionType']")).sendKeys("Telephone action");
		driver.findElement(By.xpath("//*[@id='txtComments']")).sendKeys("always action");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div[3]/div/div[2]/div/div/ul/li[3]/a/img")).click();
		Thread.sleep(2000);
		
	}

	@Test(priority=2)
	public void CreateRecurringAction() throws InterruptedException {
		// recurring monday
		driver.findElement(By.xpath("//*[@id='divShowCreatePanel']/a/img")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='ProfileActionCat']")).sendKeys("Recurring actions    ");
		driver.findElement(By.xpath("//*[@id='ProfileActionType']")).sendKeys("Increase risk code");
		driver.findElement(By.xpath("//*[@id='txtComments']")).sendKeys("Recurring action");
		driver.findElement(By.xpath("//*[@id='WeeklyWhichDay']")).sendKeys("Monday");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div[3]/div/div[2]/div/div/ul/li[3]/a/img")).click();
		Thread.sleep(2000);
		// recurring tuesday
		driver.findElement(By.xpath("//*[@id='divShowCreatePanel']/a/img")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='ProfileActionCat']")).sendKeys("Recurring actions    ");
		driver.findElement(By.xpath("//*[@id='ProfileActionType']")).sendKeys("Increase risk code");
		driver.findElement(By.xpath("//*[@id='txtComments']")).sendKeys("Recurring action");
		driver.findElement(By.xpath("//*[@id='WeeklyWhichDay']")).sendKeys("Tuesday");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div[3]/div/div[2]/div/div/ul/li[3]/a/img")).click();
		Thread.sleep(2000);
		// recurring Wednesday
		driver.findElement(By.xpath("//*[@id='divShowCreatePanel']/a/img")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='ProfileActionCat']")).sendKeys("Recurring actions    ");
		driver.findElement(By.xpath("//*[@id='ProfileActionType']")).sendKeys("Increase risk code");
		driver.findElement(By.xpath("//*[@id='txtComments']")).sendKeys("Recurring action");
		driver.findElement(By.xpath("//*[@id='WeeklyWhichDay']")).sendKeys("Wednesday");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div[3]/div/div[2]/div/div/ul/li[3]/a/img")).click();
		Thread.sleep(2000);
		// recurring Thursday
		driver.findElement(By.xpath("//*[@id='divShowCreatePanel']/a/img")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='ProfileActionCat']")).sendKeys("Recurring actions    ");
		driver.findElement(By.xpath("//*[@id='ProfileActionType']")).sendKeys("Increase risk code");
		driver.findElement(By.xpath("//*[@id='txtComments']")).sendKeys("Recurring action");
		driver.findElement(By.xpath("//*[@id='WeeklyWhichDay']")).sendKeys("Thursday");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div[3]/div/div[2]/div/div/ul/li[3]/a/img")).click();
		Thread.sleep(2000);
		// recurring Friday
		driver.findElement(By.xpath("//*[@id='divShowCreatePanel']/a/img")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='ProfileActionCat']")).sendKeys("Recurring actions    ");
		driver.findElement(By.xpath("//*[@id='ProfileActionType']")).sendKeys("Increase risk code");
		driver.findElement(By.xpath("//*[@id='txtComments']")).sendKeys("Recurring action");
		driver.findElement(By.xpath("//*[@id='WeeklyWhichDay']")).sendKeys("Friday");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div[3]/div/div[2]/div/div/ul/li[3]/a/img")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='save_and_close']/img")).click();
		Thread.sleep(2000);
		
	}
	@Test(priority=3)
	public void logoutApplicationManager() throws InterruptedException {
		if (driver.findElement(By.xpath("//*[@id='notificationModal']/div/div")).isDisplayed()) {
			driver.findElement(By.xpath("//*[@id='notificationModal']/div/div/div/div[3]/button[1]")).click();
		}
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/ul/li/a/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/ul/li/ul/li[2]/a")).click();
		Thread.sleep(2000);
	}

	

}
