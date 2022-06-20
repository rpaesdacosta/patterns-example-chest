package patterns.singleton;

public class MagicDiceTest {

    public static void main(String[] args) {
        MagicDice magicDice = MagicDice.getInstance();
        System.out.println(magicDice.rollFrom1To(60));
        System.out.println(magicDice.rollFrom1To(100));
        System.out.println(magicDice.rollFrom1To(120));
        System.out.println(magicDice.rollFrom1To(200));
    }
}
