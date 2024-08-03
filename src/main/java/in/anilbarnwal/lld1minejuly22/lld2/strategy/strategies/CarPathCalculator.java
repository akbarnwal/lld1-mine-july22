package in.anilbarnwal.lld1minejuly22.lld2.strategy.strategies;

public class CarPathCalculator implements PathCalculator{
    @Override
    public void findPath(String source, String destination) {
        System.out.println("Car path from " + source + " to " + destination);
    }
}
