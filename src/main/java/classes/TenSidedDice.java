package classes;

import patterns.strategy.Dice;

import java.util.Random;

public class TenSidedDice implements Dice {
    public int roll() {
        return new Random().nextInt(10) + 1;
    }
}
