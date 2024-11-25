import java.util.ArrayList;

public class Inventory {
    public ArrayList<Item> items = new ArrayList<>();

    public Inventory(){
        items.add(new Weapon("Short Sword", 10));
        items.add(new Consumable(5,"Kebab"));
    }
    public void Display() {

    }
}
