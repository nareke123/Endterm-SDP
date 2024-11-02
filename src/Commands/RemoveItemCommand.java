package Commands;

import Models.Cart;
import Interfaces.CartCommand;
public class RemoveItemCommand {
    private Cart cart;
    private String item;

    public RemoveItemCommand(Cart cart, String item) {
        this.cart = cart;
        this.item = item;
    }
}
