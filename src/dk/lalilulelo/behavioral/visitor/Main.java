package dk.lalilulelo.behavioral.visitor;

/**
 * Created by Rasmu on 2/12/2017.
 */
public class Main {
    public static void main(String[] args) {
        ConcreteProduct product = new ConcreteProduct();
        ConcreteVisitor visitor = new ConcreteVisitor();

        visitor.visitProduct(product);


    }
}
