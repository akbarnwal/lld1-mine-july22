package in.anilbarnwal.lld1minejuly22.lld3.parkinglot.services.factories;

import in.anilbarnwal.lld1minejuly22.lld3.parkinglot.models.SpotAssignmentStrategyType;
import in.anilbarnwal.lld1minejuly22.lld3.parkinglot.services.strategies.spotassignment.NearestSpotAssignmentStrategy;
import in.anilbarnwal.lld1minejuly22.lld3.parkinglot.services.strategies.spotassignment.RandomSpotAssignmentStrategy;
import in.anilbarnwal.lld1minejuly22.lld3.parkinglot.services.strategies.spotassignment.SpotAssignmentStrategy;

public class SpotAssignmentStrategyFactory {

    public static SpotAssignmentStrategy getSpotAssignmentStrategy(SpotAssignmentStrategyType spotAssignmentStrategyType){
        switch (spotAssignmentStrategyType) {
            case FARTHEST:
                return null;
            case CHEAPEST:
                return null;
            case RANDOM:
                return new RandomSpotAssignmentStrategy();
            case NEAREST:
                return new NearestSpotAssignmentStrategy();
            default:
                return new RandomSpotAssignmentStrategy();
        }
    }
}
