package in.anilbarnwal.lld1minejuly22.lld3.parkinglot.services.strategies.spotassignment;

import in.anilbarnwal.lld1minejuly22.lld3.parkinglot.models.ParkingSpot;
import in.anilbarnwal.lld1minejuly22.lld3.parkinglot.models.VehicleType;

public interface SpotAssignmentStrategy {
    ParkingSpot assignParkingSpot(VehicleType vehicleType);
//    ParkingSpot assignSpot(VehicleType vehicleType);
}
