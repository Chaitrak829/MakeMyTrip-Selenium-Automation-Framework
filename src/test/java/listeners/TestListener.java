package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import base.BaseTest;
import utils.ExtentReportManager;
import utils.ScreenshotUtil;

public class TestListener implements ITestListener{
	
	ExtentReports extent = ExtentReportManager.getReportInstance();
    ExtentTest test;

    public void onTestStart(ITestResult result) {
        test = extent.createTest(result.getName());
    }

    public void onTestSuccess(ITestResult result) {
        test.pass("Test Passed");
    }

    public void onTestFailure(ITestResult result) {

        test.fail(result.getThrowable());

        BaseTest base = (BaseTest) result.getInstance();
        String path = ScreenshotUtil.captureScreenshot(base.driver, result.getName());

        try {
            test.addScreenCaptureFromPath(path);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void onFinish(ITestContext context) {
        extent.flush();
    }

}
