# Driver Travel Management System

This Java project demonstrates basic object-oriented programming by managing information about drivers and their travel data.

---

## Project Overview

The project consists of three main classes within the `com` package:

### 1. Driver Class
- Represents individual drivers.
- Stores attributes:
  - Driver ID (unique identifier)
  - Name
  - Category (Auto, Car, or Lorry)
  - Total distance traveled (in kilometers)
- Provides a constructor, getters, and a `toString()` method for easy display.

### 2. Travel Class
- Utility class with static methods to operate on a list of `Driver` objects.
- Methods include:
  - `isCarDriver(Driver d)` – checks if a driver operates a Car.
  - `retriveByDriverId(ArrayList<Driver>, driverID)` – fetches driver info by ID.
  - `retriveCountOfDriver(ArrayList<Driver>, category)` – counts drivers by category.
  - `retriveDriver(ArrayList<Driver>, category)` – returns list of drivers filtered by category.
  - `retriveMaximumDistanceTravelledDriver(ArrayList<Driver>)` – finds the driver with the maximum distance traveled.

### 3. TestDriver Class
- Contains the `main` method.
- Creates multiple `Driver` objects.
- Adds drivers to an `ArrayList`.
- Demonstrates and tests all methods from the `Travel` class with printed output.

---

## How to Run

1. Clone or download this repository.
2. Open the project in your favorite IDE (e.g., Eclipse).
3. Navigate to the `com` package.
4. Run the `TestDriver` class as a Java application.
5. Observe the console output showcasing results of all operations on drivers.

---
