package Commands;

import Models.Cart;
import Interfaces.CartCommand;

public class AddItemCommand implements CartCommand {
    private Cart cart;
    private String item;

    public AddItemCommand(Cart cart, String item) {
        this.cart = cart;
        this.item = item;
    }

    @Override
    public void execute() {
        cart.addItem(item);
    }
}
