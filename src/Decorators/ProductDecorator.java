package Decorators;

import Interfaces.Product;
public class ProductDecorator implements Product{
    protected Product product;

    public ProductDecorator(Product product) {
        this.product = product;
    }

    @Override
    public String getDescription() {
        return product.getDescription();
    }
}
