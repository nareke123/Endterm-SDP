package Models;

import Interfaces.Product;
import Interfaces.ProductFactory;
import Models.Electronics;

public class ElectronicsFactory implements ProductFactory{
    public Product createProduct() {
        return new Electronics();
    }
}
