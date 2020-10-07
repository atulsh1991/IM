package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

public class RunBatchFileOfImport {

	@Test(priority = 1)
	public void runbatch() throws InterruptedException {
		// TODO Auto-generated method stub

		try {
			Runtime.getRuntime().exec("cmd /c start C:\\Users\\Atul\\Desktop\\file.bat");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread.sleep(40 * 60 * 1000);

	}
}
