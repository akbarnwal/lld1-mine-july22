package in.anilbarnwal.lld1minejuly22.lld2.strategy.strategies;

public class BikePathCalculator implements PathCalculator{
    @Override
    public void findPath(String source, String destination) {
        System.out.println("Bike path from " + source + " to " + destination);
    }
}
