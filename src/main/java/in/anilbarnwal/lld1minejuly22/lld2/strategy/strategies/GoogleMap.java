package in.anilbarnwal.lld1minejuly22.lld2.strategy.strategies;

public class GoogleMap {
    private PathCalculator pathCalculator;
    public GoogleMap(PathCalculator pathCalculator) {
        this.pathCalculator = pathCalculator;
    }

    void findPath(String source, String destination){
        pathCalculator.findPath(source, destination);
    }
}
