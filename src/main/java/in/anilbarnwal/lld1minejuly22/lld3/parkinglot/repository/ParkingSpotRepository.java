package in.anilbarnwal.lld1minejuly22.lld3.parkinglot.repository;

import in.anilbarnwal.lld1minejuly22.lld3.parkinglot.models.ParkingSpot;

import java.util.Map;
import java.util.TreeMap;

public class ParkingSpotRepository {
    private Map<Long, ParkingSpot> parkingSpotMap = new TreeMap<>();
    private Long previousId = 0L;

    public ParkingSpot save(ParkingSpot parkingSpot){
        if(parkingSpot.getId() == null){
            parkingSpot.setId(++previousId);
        }
        parkingSpotMap.put(parkingSpot.getId(), parkingSpot);
        return parkingSpot;
    }

    public ParkingSpot getParkingSpotById(Long id){
        return parkingSpotMap.get(id);
    }

    public ParkingSpot delete(Long id){
        return parkingSpotMap.remove(id);
    }
}
