package dk.lalilulelo.behavioral.visitor;

/**
 * Created by Rasmu on 2/14/2017.
 */
public class ConcreteProduct implements IProduct {
    private double value;

    public ConcreteProduct() {
        value = 2.0;
    }

    @Override
    public void acceptVisitor(IVisitor visitor) {
        visitor.visitProduct(this);
    }

    public double getValue() {
        return value;
    }
}
