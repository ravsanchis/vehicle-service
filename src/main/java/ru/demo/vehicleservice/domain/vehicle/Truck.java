package ru.demo.vehicleservice.domain.vehicle;

public final class Truck extends Vehicle{

    @Override
    public Truck getNewVehicle() {
        Truck truck = new Truck();
        truck.setVehicleModel(Model.K4562);
        truck.setVehicleType(Manufacturer.KAMAZ);
        return truck;
    }
}
