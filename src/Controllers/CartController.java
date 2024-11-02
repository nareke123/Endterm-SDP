package Controllers;

import View.CartView;
import Models.Cart;
public class CartController {
    private Cart cart;
    private CartView view;

    public CartController(Cart cart, CartView view) {
        this.cart = cart;
        this.view = view;
    }

    public void addItem(String item) {
        cart.addItem(item);
        view.showMessage("Item added: " + item);
    }

    public void removeItem(String item) {
        cart.removeItem(item);
        view.showMessage("Item removed: " + item);
    }

    public void displayItems() {
        view.displayCartItems(cart.listItems());
    }
}
