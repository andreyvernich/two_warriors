public class Warrior {
    private final String name;
    private int health = 100;

    public Warrior(String name) {
        this.name = name;
    }
    public void attack(Warrior warrior) {
        warrior.setHealth(warrior.getHealth() - 20);
        System.out.println(name + " attack " + warrior.getName() + ". " + warrior.getName() + " health: " + warrior.getHealth());
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}

