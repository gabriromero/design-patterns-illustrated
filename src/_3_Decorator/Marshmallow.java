package _3_Decorator;

public class Marshmallow extends YogurtDecorator{
    public Marshmallow(Yogurt yogurt) {
        super(yogurt);
    }

    @Override
    public double cost() {
        return super.cost() + 0.8;
    }
}
