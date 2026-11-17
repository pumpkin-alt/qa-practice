package srv;

public class TestRunner {
    public static void main(String[] args) {
        UiTest teslBotton = new UiTest("Проверка кнопки");
        ApiTest testLogin = new ApiTest("Проверка логина");
        ApiTest testExit = new ApiTest("Проверка выхода");

        Test[] arraytest = new Test[] {teslBotton, testExit, testLogin};

        for (int i = 0; i < arraytest.length; i++){
            arraytest[i].execute();

            System.out.println("Тест: " + arraytest[i].getTestName() + ", Статус: " + arraytest[i].isPassed());
        }

    }
}
