package  Inheritences.HybridInheritance.vehicleManagementSystem;
public class VehicleSystem {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle("Tesla Model 3", 200, 75);
        PetrolVehicle pv = new PetrolVehicle("Honda Civic", 180, 50);
        ev.charge();
        System.out.println("-------------------");
        pv.refuel();
    }
}