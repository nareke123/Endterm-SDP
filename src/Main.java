import Commands.AddItemCommand;
import Controllers.CartController;
import Decorators.DiscountDecorator;
import Models.Cart;
import Models.User;
import Interfaces.CartCommand;
import Interfaces.Observer;
import Interfaces.Product;
import Interfaces.ProductFactory;
import Models.ClothingFactory;
import Models.ElectronicsFactory;
import Notifier.ProductNotifier;
import Proxy.PaymentProxy;
import View.CartView;

public class Main {
    public static void main(String[] args) {
        // MVC Pattern
        Cart cart = Cart.getInstance();
        CartView view = new CartView();
        CartController controller = new CartController(cart, view);

        // Abstract Factory
        ProductFactory clothingFactory = new ClothingFactory();
        ProductFactory electronicsFactory = new ElectronicsFactory();
        Product shirt = clothingFactory.createProduct();
        Product phone = electronicsFactory.createProduct();

        // Decorator
        Product discountedShirt = new DiscountDecorator(shirt);

        // Command
        CartCommand addShirtCommand = new AddItemCommand(cart, discountedShirt.getDescription());
        CartCommand addPhoneCommand = new AddItemCommand(cart, phone.getDescription());
        addShirtCommand.execute();
        addPhoneCommand.execute();

        // Proxy
        PaymentProxy paymentProxy = new PaymentProxy(true);
        paymentProxy.processPayment(200);

        // Observer
        User user1 = new User("Alice");
        User user2 = new User("Bob");
        ProductNotifier notifier = new ProductNotifier();
        notifier.addObserver((Observer) user1);
        notifier.addObserver((Observer) user2);
        notifier.notifyObservers("New product available!");

        // MVC: Displaying items in the cart
        controller.displayItems();
    }
}
