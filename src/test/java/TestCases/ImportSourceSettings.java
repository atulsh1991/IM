package TestCases;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ImportSourceSettings extends BaseClass {
	
	@Test(priority=1)
	public void ImportSource() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id='li_AppMan_40']/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='div_import']/ul/li[1]/a/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='importSource']/div[2]/table/tbody/tr[1]/td[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='divShowUpdatePanel']/a/img")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='CustomerXml']")).clear();
		driver.findElement(By.xpath("//*[@id='CustomerXml']"))
				.sendKeys("C:\\Users\\Atul\\workspace\\IM\\Importfiles\\new_deb.xml");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='InvoiceXml']")).clear();
		driver.findElement(By.xpath("//*[@id='InvoiceXml']"))
				.sendKeys("C:\\Users\\Atul\\workspace\\IM\\Importfiles\\new_inv.xml");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='ImportlogFileName']")).clear();
		driver.findElement(By.xpath("//*[@id='ImportlogFileName']")).sendKeys("import.log");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='divMainFooter']/div/div[2]/ul/li[2]/a/img")).click();
		Thread.sleep(1000);		
		logoutAfterACtionCreation();
	}	
	@Test(priority=2)
	public void logoutAfterACtionCreation() throws InterruptedException {
		if (driver.findElement(By.xpath("//*[@id='notificationModal']/div/div")).isDisplayed()) {
			driver.findElement(By.xpath("//*[@id='notificationModal']/div/div/div/div[3]/button[1]")).click();
		}
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/ul/li/a/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/ul/li/ul/li[2]/a")).click();
		Thread.sleep(2000);
}
}
