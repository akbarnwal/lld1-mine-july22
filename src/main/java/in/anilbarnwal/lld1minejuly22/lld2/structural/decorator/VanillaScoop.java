package in.anilbarnwal.lld1minejuly22.lld2.structural.decorator;

public class VanillaScoop extends ToppingScope {

    VanillaScoop(IceCream iceCream){
        this.iceCream = iceCream;
    }

    @Override
    public double getCost() {
        return iceCream.getCost() + 70;
    }

    @Override
    public String getDescription() {
        return this.iceCream.getDescription() + ", Vanilla Scoop";
    }
}
