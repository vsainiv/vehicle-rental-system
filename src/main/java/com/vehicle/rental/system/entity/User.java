package com.vehicle.rental.system.entity;

import java.util.List;

public class User {

  private String email;
  private String userName;
  private int vehicleBarcode;
  private List<Booking> bookings;

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public int getVehicleBarcode() {
    return vehicleBarcode;
  }

  public void setVehicleBarcode(int vehicleBarcode) {
    this.vehicleBarcode = vehicleBarcode;
  }

  public List<Booking> getBookings() {
    return bookings;
  }

  public void setBookings(List<Booking> bookings) {
    this.bookings = bookings;
  }
}
