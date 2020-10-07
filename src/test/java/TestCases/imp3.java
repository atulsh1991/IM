package TestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class imp3 extends BaseClass {
	
	@Test(priority=1)
	public void impso(){
		System.out.println("hello p5");
		
	}
	@Test(priority=2)
	public void p2() throws InterruptedException{
		System.out.println("hello p6");
	 
 }
}
