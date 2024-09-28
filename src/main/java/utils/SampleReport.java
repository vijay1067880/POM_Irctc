package utils;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class SampleReport {
	
	@Test
	public void generateReport() {

		// start report
		ExtentReports report = new ExtentReports("./Reports/Result.html", false);
		
		// start test
		ExtentTest test = report.startTest("TC005", "To verify IrctcRegistration");
		
		test.assignAuthor("Vijay");
		
		test.assignCategory("Regression");
		
		// log test steps
		test.log(LogStatus.PASS, "The browser got laucnehd successfully");
		test.log(LogStatus.PASS, "The browser got laucnehd successfully");
		test.log(LogStatus.PASS, "The browser got laucnehd successfully");
		test.log(LogStatus.PASS, "The browser got laucnehd successfully");
		test.log(LogStatus.PASS, "The browser got laucnehd successfully");
		test.log(LogStatus.PASS, "The browser got laucnehd successfully");
		test.log(LogStatus.PASS, "The browser got laucnehd successfully");
		test.log(LogStatus.PASS, "The browser got laucnehd successfully");
		test.log(LogStatus.PASS, "The browser got laucnehd successfully");
		test.log(LogStatus.PASS, "The browser got laucnehd successfully");
		test.log(LogStatus.PASS, "The browser got laucnehd successfully");
		test.log(LogStatus.PASS, "The browser got laucnehd successfully");
		test.log(LogStatus.PASS, "The browser got laucnehd successfully");
		test.log(LogStatus.PASS, "The browser got laucnehd successfully");
		test.log(LogStatus.PASS, "The browser got laucnehd successfully");
		test.log(LogStatus.PASS, "The browser got laucnehd successfully");
		test.log(LogStatus.PASS, "The browser got laucnehd successfully");
		test.log(LogStatus.PASS, "The browser got laucnehd successfully");
		test.log(LogStatus.PASS, "The browser got laucnehd successfully");
		test.log(LogStatus.PASS, "The browser got laucnehd successfully");
		
		
		report.endTest(test);
		
		report.flush();
		
		
		
		
	}

}
