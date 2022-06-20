package patterns.strategy;

import classes.SixSidedDice;
import classes.TenSidedDice;
import classes.TwelveSidedDice;
import classes.TwentySidedDice;

public class DiceTest {

    public static void main(String[] args) {

        Dice d6 = new SixSidedDice();
        Dice d10 = new TenSidedDice();
        Dice d12 = new TwelveSidedDice();
        Dice d20 = new TwentySidedDice();

        System.out.println(d6.roll());
        System.out.println(d10.roll());
        System.out.println(d12.roll());
        System.out.println(d20.roll());
    }
}
