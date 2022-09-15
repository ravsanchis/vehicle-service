package ru.demo.vehicleservice.domain.vehicle;

public final class Bus extends  Vehicle{

    @Override
    public Bus getNewVehicle() {
        Bus busVehicle = new Bus();
        busVehicle.setVehicleModel(Model.B1045);
        busVehicle.setVehicleType(Manufacturer.ICARUS);
        return busVehicle;
    }
}
