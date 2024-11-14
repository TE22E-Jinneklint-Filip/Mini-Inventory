public class Weapon extends Item {
    int minDamage = 10;
    int maxDamage = 100;

    public int Attack() {
        return (int) (Math.random() * (maxDamage - minDamage)) + minDamage;
    }
}
