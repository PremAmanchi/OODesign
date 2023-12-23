package clients;

import vehicle.Vehicle;
import vehicleFactory.VehicleFactory;

public class App {
    public static void main(String[] args) {
        System.out.println("*********TRUCK*********");
        VehicleFactory factory = new VehicleFactory();
        Vehicle truck = factory.getVehicle("Truck");
        truck.startEngine();

        System.out.println("*********CAR*********");
        Vehicle car = factory.getVehicle("Car");
        car.startEngine();
    }
}
