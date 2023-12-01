package utilities;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.ITestContext;

public class ItestListenerClass implements ITestListener{

	public void onTestStart(ITestResult result)
	{
		System.out.println("Test method has been started");
	}
	
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Test method is success");
	}
	
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Test methodis failure");
		System.out.println("screenshot code");
	}
	
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("Test method is skipped");
	}
	
	public void onTestFiledWithTimeout(ITestResult result)
	{
		System.out.println("Test method is failure due to timeout");
	}
	
	public void onStart(ITestContext context)
	{
		System.out.println("Testing has started");
	}
	
	public void onFinish(ITestContext context)
	{
		System.out.println("Testing has  ended");
	}
	
	
	
}
