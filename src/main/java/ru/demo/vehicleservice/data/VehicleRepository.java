package ru.demo.vehicleservice.data;

import java.util.HashMap;
import java.util.Map;

public final class VehicleRepository {

    public static Map<String, String[]> items;
    static {
        //PassengerCar - VehicleType, Manufacturer, Model, Weight, Engine.Volume, SeatsCount, WheelCount, TypeOfDrive
        //Truck - VehicleType, Manufacturer, Model, Weight, Engine.Volume, SeatsCount, Carrying
        items = new HashMap<>();
        items.put("passengerCar1", new String[]{"01", "BMW", "X5", "2350", "2993", "5", "4", "x4"});
        items.put("passengerCar2", new String[]{"01", "AUDI", "A5", "2100", " ", "4", "4", "x2"});
        items.put("truck1", new String[]{"02", "KAMAZ", "K4562", "7900", "11970", "3", "36000"});
    }
}
