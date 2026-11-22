package strategypractic.volume;

public class StrategyMusic implements Sound{

    @Override
    public void produceSound(int volume){
        System.out.println("Играет бодрый рок!");
        System.out.println("Громкость: " + volume);
    }
}
