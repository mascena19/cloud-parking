package br.com.rodrigoMascena.parking.service;

import br.com.rodrigoMascena.parking.model.Parking;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;


@Service
public class ParkingService {

    private static Map<String, Parking> parkingMap = new HashMap();
    
    static {
        String id = getUUID();
        Parking parking = new Parking(id, "DDD-1111", "SC", "CELTA", "PRETO");
        parkingMap.put(id, parking);
    }

    public List<Parking> findAll(){
        return parkingMap.values().stream().collect(Collectors.toList());
    }

    private static String getUUID() {
        return UUID.randomUUID().toString();
    }


}
