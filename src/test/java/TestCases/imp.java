package TestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class imp extends BaseClass {
	
	@Test(priority=1)
	public void imp1(){
		System.out.println("hello p1");
		
	}
	@Test(priority=2)
	public void imp2() throws InterruptedException{
		System.out.println("hello p2");
	 
 }
}
