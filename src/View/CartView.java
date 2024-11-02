package View;


import java.util.List;

public class CartView {
    public void displayCartItems(List<String> items) {
        System.out.println("Items in Cart:");
        for (String item : items) {
            System.out.println(item);
        }
    }

    public void showMessage(String message) {
        System.out.println(message);
    }
}
