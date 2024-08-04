package in.anilbarnwal.lld1minejuly22.lld2.structural.decorator;

public class ChocoScoop extends ToppingScope{
    ChocoScoop(IceCream iceCream) {
        this.iceCream = iceCream;
    }
    @Override
    public double getCost() {
        return iceCream.getCost() + 85;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " Choco Scoop";
    }
}
