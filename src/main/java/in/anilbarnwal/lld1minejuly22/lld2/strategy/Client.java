package in.anilbarnwal.lld1minejuly22.lld2.strategy;

import in.anilbarnwal.lld1minejuly22.lld2.strategy.strategies.PathCalculator;
import in.anilbarnwal.lld1minejuly22.lld2.strategy.strategies.WalkPathCalculator;

public class Client {
    public static void main(String[] args) {
        demoStrategies();
    }

    private static void demoStrategies() {
        PathCalculator pathCalculator = new WalkPathCalculator();
        GoogleMap googleMap = new GoogleMap(pathCalculator);
        googleMap.findPath("Kanya kumari", "Jammu Kashmir");
    }
}
