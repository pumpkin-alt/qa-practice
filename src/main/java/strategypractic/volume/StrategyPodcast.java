package strategypractic.volume;

public class StrategyPodcast implements Sound{

    @Override
    public void produceSound(int volume){
        System.out.println("Ведущий рассказывает новости....");
        System.out.println("Громкость: " + volume);
    }
}
