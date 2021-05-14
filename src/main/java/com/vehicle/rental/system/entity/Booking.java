package com.vehicle.rental.system.entity;

import java.sql.Timestamp;

public class Booking {

  private Vehicle vehicle;
  private User user;
  private Timestamp bookingStartTime;
  private Timestamp bookingEndTime;

  public Vehicle getVehicle() {
    return vehicle;
  }

  public void setVehicle(Vehicle vehicle) {
    this.vehicle = vehicle;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public Timestamp getBookingStartTime() {
    return bookingStartTime;
  }

  public void setBookingStartTime(Timestamp bookingStartTime) {
    this.bookingStartTime = bookingStartTime;
  }

  public Timestamp getBookingEndTime() {
    return bookingEndTime;
  }

  public void setBookingEndTime(Timestamp bookingEndTime) {
    this.bookingEndTime = bookingEndTime;
  }
}
