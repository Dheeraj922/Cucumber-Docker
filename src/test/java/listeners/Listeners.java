package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("On Test Start");
        System.out.println(result.getMethod());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("On Test Success");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("On Test Failure");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("On Test Skipped");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("On Test FailedWithinSuccessPercentage");
    }

//    @Override
//    public void onTestFailedWithTimeout(ITestResult result) {
//        System.out.println("On Test FailedWithTimeout");
//    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("On Test method Start");
        System.out.println(context.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("On Test method Finish");
    }
}
