package in.anilbarnwal.lld1minejuly22.lld2.structural.decorator;

public class Cherry extends ToppingScope{
    Cherry(IceCream iceCream){
        this.iceCream = iceCream;
    }

    @Override
    public double getCost() {
        return iceCream.getCost() + 5;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " with cherry";
    }
}
