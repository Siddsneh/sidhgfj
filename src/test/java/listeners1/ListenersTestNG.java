package listeners1;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersTestNG implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("siddhesh"+result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("snehal"+result.getName());
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("shaila"+result.getName());
		
	}

	public void onTestSkipped(ITestResult result) {
	System.out.println("rajendra"+result.getName());
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		System.out.println("pawar"+result.getName());
	}

	public void onStart(ITestContext context) {
	System.out.println("santosh");
		
	}

	public void onFinish(ITestContext context) {
		System.out.println("surekha");
		
	}

}
