package in.anilbarnwal.lld1minejuly22.lld2.strategy.strategies;

public class WalkPathCalculator implements PathCalculator{

    @Override
    public void findPath(String source, String destination) {
        System.out.println("Walking path from " + source + " to " + destination);
    }
}
