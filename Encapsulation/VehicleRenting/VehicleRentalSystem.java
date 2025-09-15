package VehicleRenting;
abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        setVehicleNumber(vehicleNumber);
        setType(type);
        setRentalRate(rentalRate);
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        if (vehicleNumber == null || vehicleNumber.trim().isEmpty()) {
            this.vehicleNumber = "UNKNOWN";
        } else {
            this.vehicleNumber = vehicleNumber;
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (type == null || type.trim().isEmpty()) {
            this.type = "General";
        } else {
            this.type = type;
        }
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        if (rentalRate < 0) {
            this.rentalRate = 0;
        } else {
            this.rentalRate = rentalRate;
        }
    }

    public abstract double calculateRentalCost(int days);

    public void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Type: " + type);
        System.out.println("Rental Rate per Day: " + rentalRate);
    }
}

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

class Car extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Car", rentalRate);
        setInsurancePolicyNumber(insurancePolicyNumber);
    }

    public String getInsurancePolicyNumber() {
        return insurancePolicyNumber;
    }

    public void setInsurancePolicyNumber(String insurancePolicyNumber) {
        if (insurancePolicyNumber == null || insurancePolicyNumber.trim().isEmpty()) {
            this.insurancePolicyNumber = "NOT ASSIGNED";
        } else {
            this.insurancePolicyNumber = insurancePolicyNumber;
        }
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.1;
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance Policy: " + insurancePolicyNumber;
    }
}

class Bike extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Bike(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Bike", rentalRate);
        setInsurancePolicyNumber(insurancePolicyNumber);
    }

    public String getInsurancePolicyNumber() {
        return insurancePolicyNumber;
    }

    public void setInsurancePolicyNumber(String insurancePolicyNumber) {
        if (insurancePolicyNumber == null || insurancePolicyNumber.trim().isEmpty()) {
            this.insurancePolicyNumber = "NOT ASSIGNED";
        } else {
            this.insurancePolicyNumber = insurancePolicyNumber;
        }
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 0.9;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.05;
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance Policy: " + insurancePolicyNumber;
    }
}

class Truck extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        setInsurancePolicyNumber(insurancePolicyNumber);
    }

    public String getInsurancePolicyNumber() {
        return insurancePolicyNumber;
    }

    public void setInsurancePolicyNumber(String insurancePolicyNumber) {
        if (insurancePolicyNumber == null || insurancePolicyNumber.trim().isEmpty()) {
            this.insurancePolicyNumber = "NOT ASSIGNED";
        } else {
            this.insurancePolicyNumber = insurancePolicyNumber;
        }
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 1.2;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.15;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance Policy: " + insurancePolicyNumber;
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        Vehicle v1 = new Car("CAR123", 2000, "C-INS-1001");
        Vehicle v2 = new Bike("BIKE456", 500, "B-INS-2002");
        Vehicle v3 = new Truck("TRUCK789", 3000, "T-INS-3003");

        Vehicle[] vehicles = { v1, v2, v3 };

        for (Vehicle v : vehicles) {
            v.displayDetails();
            double rentalCost = v.calculateRentalCost(5);
            double insurance = 0;
            if (v instanceof Insurable) {
                Insurable ins = (Insurable) v;
                insurance = ins.calculateInsurance();
                System.out.println(ins.getInsuranceDetails());
            }
            System.out.println("Rental Cost (5 days): " + rentalCost);
            System.out.println("Insurance: " + insurance);
            System.out.println("Total Cost: " + (rentalCost + insurance));
            System.out.println("----------------------------");
        }
    }
}