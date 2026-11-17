package srv;

public class BaseTest implements Test {
    private String testName;
    private boolean passed;

    public BaseTest(String testName) {
        this.testName = testName;
        this.passed = false;

    }

    public String getTestName() {
        return testName;
    }

    public boolean isPassed() {
        return passed;
    }

    protected void markAsPassed() {
        this.passed = true;
    }

    public void execute() {
    }

}
