public class Warrior {
    String name;
    int health = 100;

    public Warrior(String name) {
        this.name = name;
    }
    public void toAttack (Warrior warrior) {
        warrior.health = warrior.health - 20;
        System.out.println(name + " attack " + warrior.name + ". " + warrior.name + " health: " + warrior.health);
    }
}

