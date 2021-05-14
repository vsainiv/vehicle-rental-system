package com.vehicle.rental.system.service;

import com.vehicle.rental.system.entity.Booking;
import com.vehicle.rental.system.entity.User;
import com.vehicle.rental.system.entity.Vehicle;
import com.vehicle.rental.system.enums.VehicleType;
import com.vehicle.rental.system.inventory.UserInventory;
import com.vehicle.rental.system.inventory.VehicleInventory;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

public class VehicleService {

  VehicleInventory vehicleInventory = new VehicleInventory();
  UserInventory userInventory = new UserInventory();

  public List<Vehicle> getAllVehicles(VehicleType vehicleType) {
    List<Vehicle> vehicleList = new ArrayList<>();
    for (Entry<Integer, Vehicle> entry : vehicleInventory.getVehicleMap().entrySet()) {
      Vehicle vehicle = entry.getValue();
      if (vehicle.isAvailable() && vehicle.getVehicleType().equals(vehicleType)) {
        vehicleList.add(vehicle);
      }
    }
    return vehicleList;
  }

  public void bookAVehicle(VehicleType vehicleType, Timestamp startTime, Timestamp endTime,
      String email) {
    List<Vehicle> availableVehicles = getAllVehicles(vehicleType);
    if (availableVehicles.size() > 0) {
      Vehicle vehicle = availableVehicles.get(0);
      vehicle.setAvailable(false);
      vehicle.setStartTime(startTime);
      vehicle.setEndTime(endTime);
      vehicleInventory.getVehicleMap().put(vehicle.getBarCode(), vehicle);

      User user = userInventory.getUserMap().get(email);
      user.setVehicleBarcode(vehicle.getBarCode());
      List<Booking> bookingList = user.getBookings();
      Booking booking = new Booking();
      booking.setVehicle(vehicle);
      booking.setUser(user);
      booking.setBookingStartTime(startTime);
      booking.setBookingEndTime(endTime);
      bookingList.add(booking);
      user.setBookings(bookingList);
      userInventory.getUserMap().put(user.getEmail(), user);
    }
  }

  public long amountToPay(Booking booking) {

    VehicleType vehicleType = booking.getVehicle().getVehicleType();
    long duration = booking.getBookingStartTime().getTime() - booking.getBookingEndTime().getTime();
    switch (vehicleType) {
      case CAR:
        return duration * 25;
      case VAN:
        return duration * 30;
      case SUV:
        return duration * 35;
      case TRUCK:
        return duration * 40;
      case MOTORCYCLE:
        return duration * 20;
    }
    return 0;
  }

  public void returnAVehicle(Booking booking) {
    Vehicle vehicle = booking.getVehicle();
    vehicle.setAvailable(true);
    vehicleInventory.getVehicleMap().put(vehicle.getBarCode(), vehicle);
  }

  public long calculateLateFee(Vehicle vehicle) {
    Timestamp expectedEndTime = vehicle.getEndTime();
    long duration = new Timestamp(System.currentTimeMillis()).getTime() - expectedEndTime.getTime();
    switch (vehicle.getVehicleType()) {
      case CAR:
        return duration * 25;
      case VAN:
        return duration * 30;
      case SUV:
        return duration * 35;
      case TRUCK:
        return duration * 40;
      case MOTORCYCLE:
        return duration * 20;
    }
    return 0;
  }

  public List<Vehicle> listRentedOutVehicle() {
    List<Vehicle> vehicleList = new ArrayList<>();
    for (Entry<Integer, Vehicle> entry : vehicleInventory.getVehicleMap().entrySet()) {
      Vehicle vehicle = entry.getValue();
      if (!vehicle.isAvailable()) {
        vehicleList.add(vehicle);
      }
    }
    return vehicleList;
  }

  public List<Booking> bookingHistory(User user) {
    return userInventory.getUserMap().get(user.getEmail()).getBookings();
  }
}
