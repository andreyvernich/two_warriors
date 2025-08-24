public class Main {
    public static void main(String[] args) {
        Warrior vasya = new Warrior("Vasya");
        Warrior optimusPrime = new Warrior("Optimus Prime");
        FightService fightService = new FightService();

        fightService.fight(vasya, optimusPrime);
    }


}

