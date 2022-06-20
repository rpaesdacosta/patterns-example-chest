package classes;

import patterns.strategy.Dice;

import java.util.Random;

public class TwentySidedDice implements Dice {
    public int roll() {
        return new Random().nextInt(20) + 1;
    }
}
