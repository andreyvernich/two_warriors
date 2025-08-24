import java.util.Random;

public class FightService {
    private final static Random random = new Random();

    public void fight(Warrior warr1, Warrior warr2) {

        while (warr1.getHealth() > 0 && warr2.getHealth() > 0) {
            int randomInt = random.nextInt(2);
            switch (randomInt) {
                case 0 -> warr1.attack(warr2);
                case 1 -> warr2.attack(warr1);
            }
        }
        checkWinner(warr1, warr2);
    }

    public void checkWinner(Warrior warr1, Warrior warr2) {
        if (warr2.getHealth() == 0) {
            System.out.println(warr1.getName() + " win");
        }
        if (warr1.getHealth() == 0) {
            System.out.println(warr2.getName() + " win");
        }
    }
}
