package com.vehicle.rental.system.inventory;

import com.vehicle.rental.system.entity.Vehicle;
import com.vehicle.rental.system.enums.VehicleType;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class VehicleInventory {

  Map<Integer, Vehicle> vehicleMap = new HashMap();
  int parkingStallNumber = 1;

  public void addVehicle(VehicleType vehicleType) {
    Vehicle vehicle = new Vehicle();
    vehicle.setVehicleType(vehicleType);
    vehicle.setParkingStallNumber(parkingStallNumber);
    int barcode = new Random().nextInt();
    vehicle.setBarCode(barcode);
    vehicleMap.put(barcode, vehicle);
    parkingStallNumber++;
  }

  public void removeVehicle(int barcode) {
    vehicleMap.remove(barcode);
  }

  public Map<Integer, Vehicle> getVehicleMap() {
    return vehicleMap;
  }
}
