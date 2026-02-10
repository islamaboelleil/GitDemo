package test;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {
	
	@Override
	public void onTestStart(ITestResult result) {
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("I Successfully executed Listeners Pass code");
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("I Failed to execute Listeners code" + result.getName());
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
	}
	
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}
}
