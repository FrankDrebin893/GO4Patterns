package dk.lalilulelo.creational.factory_method;

/**
 * Created by Rasmu on 2/13/2017.
 */
public class ProductFactory {
    public IProduct getProduct(String productType) {
        switch(productType) {
            case "ONE":
                return new ProductOne();
            case "TWO":
                return new ProductTwo();
            default:
                return new ProductOne();
        }
    };
}
