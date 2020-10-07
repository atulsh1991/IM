package TestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class imp2 extends BaseClass {
	
	@Test(priority=1)
	public void imp123(){
		System.out.println("hello p3");
		
	}
	@Test(priority=2)
	public void imp456() throws InterruptedException{
		System.out.println("hello p4");
	 
 }
}
