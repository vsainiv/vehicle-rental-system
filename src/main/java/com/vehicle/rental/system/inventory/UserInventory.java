package com.vehicle.rental.system.inventory;

import com.vehicle.rental.system.entity.User;
import java.util.HashMap;
import java.util.Map;

public class UserInventory {

  Map<String, User> userMap = new HashMap<>();

  public void addUser(String email, String userName) {
    User user = new User();
    user.setEmail(email);
    user.setUserName(userName);
    userMap.put(email, user);
  }

  public Map<String, User> getUserMap() {
    return userMap;
  }
}
