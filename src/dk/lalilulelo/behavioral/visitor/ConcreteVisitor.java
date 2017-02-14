package dk.lalilulelo.behavioral.visitor;

/**
 * Created by Rasmu on 2/14/2017.
 */
public class ConcreteVisitor implements IVisitor {

    @Override
    public void visitProduct(ConcreteProduct product) {
        System.out.println("Concrete visit product");
        double value = product.getValue();
        value = value * 2;
        System.out.println(value);
    }
}
