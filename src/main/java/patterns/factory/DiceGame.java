package patterns.factory;

import patterns.strategy.Dice;

public class DiceGame {
    public int rollASidedDiceFrom1To(int value) {
        DiceFactory diceFactory = new DiceFactory();
        Dice dice = diceFactory.createDice(value);
        return dice.roll();
    }
}
