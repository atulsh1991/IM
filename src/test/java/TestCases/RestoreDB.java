package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

public class RestoreDB {

	@Test(priority = 1)
	public void RestoreDatabase() throws InterruptedException {
		// TODO Auto-generated method stub

		try {
			Runtime.getRuntime().exec("cmd /c start C:\\Users\\Atul\\Desktop\\job.bat");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread.sleep(3 * 60 * 1000);
	}
}
