package srv;

public class ApiTest extends BaseTest{

    public ApiTest(String testName) {
        super(testName);
    }
    public void execute() {
        System.out.println("Выполняется Api-тест: " + getTestName());
        markAsPassed();
    }


}
