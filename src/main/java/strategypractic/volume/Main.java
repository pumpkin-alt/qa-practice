package strategypractic.volume;

public class Main {
    public static void main(String[] args) {

        Column column = new Column();

        column.setSound(new StrategyMusic());
        column.setVolume(10);
        column.execute();

        column.setSound(new StrategyPodcast());
        column.setVolume(5);
        column.execute();

        column.setSound(new StrategySilence());
        column.execute();
    }
}
