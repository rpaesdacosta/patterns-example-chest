package patterns.singleton;

import java.util.Random;

public class MagicDice {

    private static MagicDice instance;
    private Random random = new Random();

    private MagicDice(){}

    public static MagicDice getInstance(){
        if(instance == null) {
            instance = new MagicDice();
        }
        return instance;
    }

    public int rollFrom1To(int value) {
        return random.nextInt(value) + 1;
    }
}
