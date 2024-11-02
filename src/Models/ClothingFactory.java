package Models;

import Interfaces.Product;
import Interfaces.ProductFactory;
import Models.Clothing;

public class ClothingFactory implements ProductFactory{
    public Product createProduct() {
        return new Clothing();
    }
}
