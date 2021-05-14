package com.vehicle.rental.system.driver;

import com.vehicle.rental.system.enums.VehicleType;
import com.vehicle.rental.system.inventory.UserInventory;
import com.vehicle.rental.system.inventory.VehicleInventory;
import com.vehicle.rental.system.service.VehicleService;
import java.sql.Timestamp;

public class DriverClass {

  public static void main(String[] args) {
    VehicleInventory vehicleInventory = new VehicleInventory();
    vehicleInventory.addVehicle(VehicleType.CAR);
    vehicleInventory.addVehicle(VehicleType.SUV);
    vehicleInventory.addVehicle(VehicleType.CAR);
    vehicleInventory.addVehicle(VehicleType.MOTORCYCLE);
    vehicleInventory.addVehicle(VehicleType.TRUCK);
    vehicleInventory.addVehicle(VehicleType.VAN);

    UserInventory userInventory = new UserInventory();
    userInventory.addUser("abc@gmail.com", "abc");
    userInventory.addUser("xyz@gmail.com", "xyz");

    VehicleService vehicleService = new VehicleService();
    Timestamp startTime = new Timestamp(System.currentTimeMillis());
    Timestamp endTime = new Timestamp(startTime.toInstant().plusSeconds(3000000).toEpochMilli());
    vehicleService.bookAVehicle(VehicleType.CAR, startTime, endTime, "abc@gmail.com");
    vehicleService.bookAVehicle(VehicleType.MOTORCYCLE, startTime, endTime, "xyz@gmail.com");
    
  }
}
