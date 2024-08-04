package in.anilbarnwal.lld1minejuly22.lld2.structural.decorator;

public class Client {
    public static void main(String[] args) {
        demoDecoratorPattern();
    }

    private static void demoDecoratorPattern() {
        IceCream iceCream = new ChocoCone();
        iceCream = new VanillaScoop(iceCream);
        iceCream = new ChocoScoop(iceCream);
        iceCream = new Cherry(iceCream);

        System.out.println("Total cost: " + iceCream.getCost());
        System.out.println(iceCream.getDescription());
    }
}
