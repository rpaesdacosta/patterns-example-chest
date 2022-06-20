package patterns.factory;

import classes.SixSidedDice;
import classes.TenSidedDice;
import classes.TwelveSidedDice;
import classes.TwentySidedDice;
import patterns.strategy.Dice;

public class DiceFactory {

    public Dice createDice(int sides) {
        Dice dice = null;
        if (sides == 6) {
            dice = new SixSidedDice();
        } else if (sides == 10) {
            dice = new TenSidedDice();
        } else if (sides == 12) {
            dice = new TwelveSidedDice();
        } else if (sides == 20) {
            dice = new TwentySidedDice();
        }
        return dice;
    }
}
