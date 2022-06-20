package classes;

import patterns.strategy.Dice;

import java.util.Random;

public class SixSidedDice implements Dice {
    public int roll() {
        return new Random().nextInt(6) + 1;
    }
}
