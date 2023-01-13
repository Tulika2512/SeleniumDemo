import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListners implements ITestListener {
    @Override
    public void onTestStart(ITestResult iTestResult) {
        System.out.println("Test execution started...");
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {

        System.out.println("Test execution successful");
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("Test execution failed...");
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        System.out.println("Test execution skipped...");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {
        System.out.println("Starts test execution");
    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        System.out.println("Ends test execution");
    }
}
