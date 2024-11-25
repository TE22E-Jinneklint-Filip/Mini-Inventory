public class Weapon extends Item {
    public int minDamage = 0;
    public int maxDamage = 0;

    public Weapon(String name, int maxDamage) {
        this.name = name;
        this.maxDamage = maxDamage;
    }

    public int Attack() {
        return (int) (Math.random() * (maxDamage - minDamage)) + minDamage;
    }
}
