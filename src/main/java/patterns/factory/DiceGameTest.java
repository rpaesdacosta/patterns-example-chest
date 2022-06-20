package patterns.factory;

public class DiceGameTest {

    public static void main(String[] args) {
        DiceGame diceGame = new DiceGame();
        System.out.println(diceGame.rollASidedDiceFrom1To(6));
        System.out.println(diceGame.rollASidedDiceFrom1To(10));
        System.out.println(diceGame.rollASidedDiceFrom1To(12));
        System.out.println(diceGame.rollASidedDiceFrom1To(20));
    }
}
