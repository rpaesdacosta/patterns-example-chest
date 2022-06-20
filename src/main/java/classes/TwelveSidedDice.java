package classes;

import patterns.strategy.Dice;

import java.util.Random;

public class TwelveSidedDice implements Dice {
    public int roll() {
        return new Random().nextInt(12) + 1;
    }
}
