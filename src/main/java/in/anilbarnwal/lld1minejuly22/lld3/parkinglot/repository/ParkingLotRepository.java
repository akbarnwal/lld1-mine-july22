package in.anilbarnwal.lld1minejuly22.lld3.parkinglot.repository;

import in.anilbarnwal.lld1minejuly22.lld3.parkinglot.models.ParkingLot;

import java.util.Map;
import java.util.TreeMap;

public class ParkingLotRepository {
    private Map<Long, ParkingLot> parkingLotMap = new TreeMap<>();
    private Long privousId = 0l;

    public ParkingLot save(ParkingLot parkingLot){
        if(parkingLot.getId() == null){
            parkingLot.setId(++privousId);
        }
        parkingLotMap.put(parkingLot.getId(), parkingLot);
        return parkingLot;
    }

    public ParkingLot getParkingLotById(Long id){
        return parkingLotMap.get(id);
    }
}
