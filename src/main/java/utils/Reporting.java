package utils;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public abstract class Reporting {
	
	public String testCaseName, testCaseDescription;
	
	public String author, category;
	
	public static ExtentReports report;
	
	public static ExtentTest test ;
	
	public void startReport() {
		 report = new ExtentReports("./reports/Result.html");
	}
	
	
	public void startTest(String testName, String description) {
		test =report.startTest(testName, description);
		test.assignAuthor(author);
		test.assignCategory(category);
	}
	
	
	public void reportStep(String details, String status) {
		
		long snapNumber = takeSnap();
		
		if(status.equalsIgnoreCase("pass")) {
			test.log(LogStatus.PASS, details +test.addScreenCapture(".././reports/screenshots/"+snapNumber+".png"));
		} else if(status.equalsIgnoreCase("fail")) {
			test.log(LogStatus.FAIL, details +test.addScreenCapture(".././reports/screenshots/"+snapNumber+".png"));
		} else if(status.equalsIgnoreCase("info")) {
			test.log(LogStatus.INFO, details +test.addScreenCapture(".././reports/screenshots/"+snapNumber+".png"));
		} else if(status.equalsIgnoreCase("warning")) {
			test.log(LogStatus.WARNING, details +test.addScreenCapture(".././reports/screenshots/"+snapNumber+".png"));
		}
	}
	
	
	/**
	 * This method will take snapshot of the browser
	 * @author Basha - LibertyTestingCenter
	 */
	public abstract long takeSnap();
	
	
	public void reportStep(String details, String status, boolean snap) {
		
		if(!snap) {
		if(status.equalsIgnoreCase("pass")) {
			test.log(LogStatus.PASS, details);
		} else if(status.equalsIgnoreCase("fail")) {
			test.log(LogStatus.FAIL, details);
		} else if(status.equalsIgnoreCase("info")) {
			test.log(LogStatus.INFO, details);
		} else if(status.equalsIgnoreCase("warning")) {
			test.log(LogStatus.WARNING, details);
		}
		}
	}
	
	public void endTest() {
		report.endTest(test);
	}

	public void endReport() {
		report.flush();
	}
}
