package strategypractic.volume;

import lombok.Setter;

@Setter
public class Column {
    private Sound sound;
    private int volume;

    public void execute(){
        sound.produceSound(volume);
    }
}
