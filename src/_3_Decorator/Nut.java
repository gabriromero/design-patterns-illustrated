package _3_Decorator;

public class Nut extends YogurtDecorator{
    public Nut(Yogurt yogurt) {
        super(yogurt);
    }

    @Override
    public double cost() {
        return super.cost() + 0.2;
    }
}
