package in.anilbarnwal.lld1minejuly22.lld3.parkinglot.repository;

import in.anilbarnwal.lld1minejuly22.lld3.parkinglot.models.ParkingFloor;

import java.util.Map;
import java.util.TreeMap;

public class ParkingFloorRepository {
    private Map<Long, ParkingFloor> parkingFloorMap = new TreeMap<>();
    private Long previousId = 0L;

    public ParkingFloor save(ParkingFloor parkingFloor){
        if(parkingFloor.getId() == null){
            parkingFloor.setId(++previousId);
        }
        parkingFloorMap.put(parkingFloor.getId(), parkingFloor);
        return parkingFloor;
    }

    public ParkingFloor getParkingFloorById(Long id){
        return parkingFloorMap.get(id);
    }

}
