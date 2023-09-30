package _3_Decorator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ordered basic yogurt");
        Yogurt basicYogurt = new BasicYogurt();

        System.out.print("Actual price: ");
        System.out.println(basicYogurt.cost() + "$");
        System.out.println("---");

        Yogurt yogurt_chocolate = new ChocolateSauce(basicYogurt);
        System.out.println("Added chocolate sauce");

        System.out.print("Actual price: ");
        System.out.println(yogurt_chocolate.cost() + "$");
        System.out.println("---");

        Yogurt yogurt_chocolate_nut = new Nut(yogurt_chocolate);
        System.out.println("Added nuts");
        Yogurt yogurt_chocolate_nut_marshmallow = new Marshmallow(yogurt_chocolate_nut);
        System.out.println("Added marshmallow");

        System.out.print("Actual price: ");
        System.out.println(yogurt_chocolate_nut_marshmallow.cost() + "$");

    }
}
