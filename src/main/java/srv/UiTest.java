package srv;

public class UiTest extends BaseTest {
    public UiTest(String testName) {
        super(testName);

    }


    public void execute() {
        System.out.println("Выполняется UI-тест: " + getTestName());
        markAsPassed();
    }

}
