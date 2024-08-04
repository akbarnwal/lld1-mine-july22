package in.anilbarnwal.lld1minejuly22.lld2.structural.decorator;

public class VanillaCone implements IceCream{

    @Override
    public double getCost() {
        return 25;
    }

    @Override
    public String getDescription() {
        return "Vanilla Cone ";
    }
}
