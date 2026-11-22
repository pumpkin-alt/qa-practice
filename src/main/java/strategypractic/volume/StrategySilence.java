package strategypractic.volume;

public class StrategySilence implements Sound{

    @Override
    public void produceSound(int volume){
        System.out.println("Колонка в режиме без звука");
    }
}
