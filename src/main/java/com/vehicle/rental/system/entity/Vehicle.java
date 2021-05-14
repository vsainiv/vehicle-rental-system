package com.vehicle.rental.system.entity;

import com.vehicle.rental.system.enums.VehicleType;
import java.sql.Timestamp;

public class Vehicle {

  private int barCode;
  private int parkingStallNumber;
  private VehicleType vehicleType;
  private boolean isAvailable;
  private Timestamp startTime;
  private Timestamp endTime;

  public int getBarCode() {
    return barCode;
  }

  public void setBarCode(int barCode) {
    this.barCode = barCode;
  }

  public int getParkingStallNumber() {
    return parkingStallNumber;
  }

  public void setParkingStallNumber(int parkingStallNumber) {
    this.parkingStallNumber = parkingStallNumber;
  }

  public VehicleType getVehicleType() {
    return vehicleType;
  }

  public void setVehicleType(VehicleType vehicleType) {
    this.vehicleType = vehicleType;
  }

  public boolean isAvailable() {
    return isAvailable;
  }

  public void setAvailable(boolean available) {
    isAvailable = available;
  }

  public Timestamp getStartTime() {
    return startTime;
  }

  public void setStartTime(Timestamp startTime) {
    this.startTime = startTime;
  }

  public Timestamp getEndTime() {
    return endTime;
  }

  public void setEndTime(Timestamp endTime) {
    this.endTime = endTime;
  }
}
