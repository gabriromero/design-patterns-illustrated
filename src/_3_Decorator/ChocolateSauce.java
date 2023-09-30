package _3_Decorator;

public class ChocolateSauce extends YogurtDecorator{

    public ChocolateSauce(Yogurt yogurt) {
        super(yogurt);
    }

    @Override
    public double cost() {
        return super.cost() + 0.5;
    }
}
