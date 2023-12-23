package vehicleFactory;

import vehicle.Car;
import vehicle.Truck;
import vehicle.Vehicle;

public class VehicleFactory {
    public Vehicle getVehicle(String type){
        if(type.equals("Truck")){
            return new Truck();
        }
        else if(type.equals("Car")){
            return new Car();
        }
        else
            return null;
    }
}
