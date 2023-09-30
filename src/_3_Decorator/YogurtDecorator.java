package _3_Decorator;

public class YogurtDecorator implements Yogurt{

    private Yogurt yogurt;

    public YogurtDecorator(Yogurt yogurt){
        this.yogurt = yogurt;
    }

    @Override
    public double cost() {
        return this.yogurt.cost();
    }
}
