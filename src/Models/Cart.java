package Models;

import java.util.ArrayList;
import java.util.List;
// Singleton Pattern for managing the Cart instance.
public class Cart {
    private static Cart instance;
    private List<String> items;

    private Cart() {
        items = new ArrayList<>();
    }

    public static Cart getInstance() {
        if (instance == null) {
            instance = new Cart();
        }
        return instance;
    }

    public void addItem(String item) {
        items.add(item);
        System.out.println("Item '" + item + "' added to the cart.");
    }

    public void removeItem(String item) {
        items.remove(item);
        System.out.println("Item '" + item + "' removed from the cart.");
    }

    public List<String> listItems() {
        return items;
    }
}
