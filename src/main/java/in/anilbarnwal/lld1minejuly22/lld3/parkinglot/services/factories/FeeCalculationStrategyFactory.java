package in.anilbarnwal.lld1minejuly22.lld3.parkinglot.services.factories;

import in.anilbarnwal.lld1minejuly22.lld3.parkinglot.models.FeeCalculationStrategyType;
import in.anilbarnwal.lld1minejuly22.lld3.parkinglot.services.strategies.feecalculation.*;

public class FeeCalculationStrategyFactory {
    public static FeeCalculationStrategy getFeeCalculationStrategy(FeeCalculationStrategyType strategyType){
        return switch (strategyType){
            case DAILY -> new DailyFeeCalculationStrategy();
            case HOURLY -> new HourlyFeeCalculationStrategy();
            case WEEKEND -> new WeekendFeeCalculationStrategy();
            case SPECIAL -> new SpecialFeeCalculationStrategy();
        };

    }
}
