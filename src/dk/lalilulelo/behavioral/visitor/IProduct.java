package dk.lalilulelo.behavioral.visitor;

/**
 * Created by Rasmu on 2/14/2017.
 */
public interface IProduct {
    public void acceptVisitor(IVisitor visitor);
}
