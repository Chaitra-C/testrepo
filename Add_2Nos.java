package additionTwoNumbers.additionTwoNumbers;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Add_2Nos {
	
	ExtentReports report;
	ExtentTest test;
	
	@Test
	public void adding_Two_Nos() {
		
		report = new ExtentReports("./Reports/report.html");
		
		test = report.startTest("addition.test");
		test.log(LogStatus.INFO, "CALC started");
		
	int a = 20,b=30;
	int sum = a+b;
	AssertJUnit.assertEquals(sum, 50);
	test.log(LogStatus.PASS, "Sum Calcuated is correct");
	report.endTest(test);
	report.flush();
	}

}
