package RideHailingApplication;
abstract class Vehicle {
    private int vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicle(int vehicleId, String driverName, double ratePerKm) {
        setVehicleId(vehicleId);
        setDriverName(driverName);
        setRatePerKm(ratePerKm);
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        if (vehicleId <= 0) {
            this.vehicleId = 1;
        } else {
            this.vehicleId = vehicleId;
        }
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        if (driverName == null || driverName.trim().isEmpty()) {
            this.driverName = "Unknown Driver";
        } else {
            this.driverName = driverName;
        }
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    public void setRatePerKm(double ratePerKm) {
        if (ratePerKm <= 0) {
            this.ratePerKm = 1;
        } else {
            this.ratePerKm = ratePerKm;
        }
    }

    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId + ", Driver: " + driverName + ", Rate/km: " + ratePerKm);
    }

    public abstract double calculateFare(double distance);
}

interface GPS {
    String getCurrentLocation();
    void updateLocation(String location);
}

class Car extends Vehicle implements GPS {
    private String currentLocation;

    public Car(int vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() + 50;
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String location) {
        currentLocation = location;
    }
}

class Bike extends Vehicle implements GPS {
    private String currentLocation;

    public Bike(int vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String location) {
        currentLocation = location;
    }
}

class Auto extends Vehicle implements GPS {
    private String currentLocation;

    public Auto(int vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() + 20;
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String location) {
        currentLocation = location;
    }
}

public class RideHailingApp {
    public static void processRides(Vehicle[] vehicles, double distance) {
        for (Vehicle v : vehicles) {
            v.getVehicleDetails();
            double fare = v.calculateFare(distance);
            System.out.println("Fare for " + distance + " km: " + fare);
            if (v instanceof GPS) {
                GPS gps = (GPS) v;
                gps.updateLocation("Downtown");
                System.out.println("Current Location: " + gps.getCurrentLocation());
            }
            System.out.println("----------------------");
        }
    }

    public static void main(String[] args) {
        Vehicle v1 = new Car(201, "Alice", 15);
        Vehicle v2 = new Bike(202, "Bob", 10);
        Vehicle v3 = new Auto(203, "Charlie", 12);

        Vehicle[] rides = { v1, v2, v3 };
        processRides(rides, 10);
    }
}

