package in.anilbarnwal.lld1minejuly22.lld3.parkinglot.repository;

import in.anilbarnwal.lld1minejuly22.lld3.parkinglot.models.Gate;

import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class GateRepository {
    private Map<Long, Gate> gateMap = new TreeMap<>();
    private Long previousId = 0L;

    public Gate save(Gate gate){

        //Creating new record
        if(gate.getId() == null){
            gate.setId(++previousId);
        }
        gateMap.put(gate.getId(), gate);
        return gate;
    }

    public Optional<Gate> findGateById(Long id){
        if(gateMap.containsKey(id)){
            return Optional.of(gateMap.get(id));
        }
        return Optional.empty();
    }

    public Gate delete(Long id){
        return gateMap.remove(id);
    }

}
