package Decorators;

import Decorators.ProductDecorator;
import Interfaces.Product;
public class DiscountDecorator extends ProductDecorator {

    public DiscountDecorator(Product product) {
        super(product);
    }

    @Override
    public String getDescription() {
        return product.getDescription() + " - now with a discount!";
    }

}
