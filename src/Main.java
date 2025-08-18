import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Warrior vasya = new Warrior("Vasya");
        Warrior optimusPrime = new Warrior("Optimus Prime");
        toFight(vasya, optimusPrime);
    }

    public static void toFight(Warrior warr1, Warrior warr2) {
        Random random = new Random();
        while (warr1.health > 0 && warr2.health > 0) {
            int randomInt = random.nextInt(2);
            switch (randomInt) {
                case 0 -> {
                    warr1.toAttack(warr2);
                }
                case 1 -> {
                    warr2.toAttack(warr1);
                }
            }
        }
        if (warr2.health == 0) {
            System.out.println(warr1.name + " win");
        }
        if (warr1.health == 0) {
            System.out.println(warr2.name + " win");
        }
    }
}

