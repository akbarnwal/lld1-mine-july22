package in.anilbarnwal.lld1minejuly22.lld2.structural.decorator;

public class ChocoCone implements IceCream{
    @Override
    public double getCost() {
        return 20;
    }

    @Override
    public String getDescription() {
        return "Choco cone ";
    }
}
