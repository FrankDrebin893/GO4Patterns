package dk.lalilulelo.creational.factory_method;

/**
 * Created by Rasmu on 2/12/2017.
 */
public class Main {
    public static void main(String[] args) {
        ProductFactory factory = new ProductFactory();

        IProduct product = factory.getProduct("ONE");
        product.firstProductMethod();

        product = factory.getProduct("TWO");
        product.firstProductMethod();
    }
}
