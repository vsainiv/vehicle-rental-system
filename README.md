Machine Coding: Vehicle Rental System

Description :

Implement a vehicle rental system to rent out vehicles to users and manage inventory.

Features :

1. The system will support the renting of different automobiles like cars, trucks, SUVs, vans, and
   motorcycles.

2. Each vehicle should be added with a unique barcode and other details, including a parking stall
   number which helps to locate the vehicle.

3. The system should be able to retrieve information like which user took a particular vehicle or
   what vehicles have been rented out by a specific user.

4. Users should be able to search the vehicle inventory and reserve any available vehicle.

5. The system should collect a late-fee for vehicles returned after the due date.

Assumptions :

1. Assume user accounts already exist in the system with email as a unique identifier.
2. Assume any rates to rent vehicles.

Requirements :

1. Design class Structures for all the entities required. Figure out all the entities in the
   application and design a data model / class structures for each one of them, storing essential
   information.

2. List Available Vehicles: From the inventory, return the vehicles which are free for a given time
   duration by user. (Average complexity)

        // type = All/Car/SUV
        // isAvailable = true/false
        // timeFrame = Similar to hotel booking  (Define properly)

3. Book a Vehicle: Given a vehicle, startDateTime and duration, book a vehicle for that particular
   time. The vehicle should be marked unavailable only for the given time frame and should be
   available for others. (Average complexity)

4. Calculate amount to pay: Given a booking which contains vehicle, user, time frame for booking
   etc, calculate total amount user needs to pay. Assume any rate of the vehicle.

5. Return a vehicle: After booking complete, mark the vehicle as returned/available and end the
   booking when the user returns the vehicle.

6. Calculate late fee: If the vehicle is returned after the due date, charge some late fee. Assume
   any formula and rate to calculate the fee.

7. List of rented out vehicles: List all the rented out vehicles with their current tenant, due
   date, etc.

8. Locate a vehicle: Return current status of vehicle. If it is rented, return the booking and user.
   If free, return the parking lot number where the vehicle is parked.

9. List booking history of a user: For a given user, return all the past and future bookings of the
   user with status of bookings.
