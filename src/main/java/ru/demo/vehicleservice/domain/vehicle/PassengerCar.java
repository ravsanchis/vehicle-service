package ru.demo.vehicleservice.domain.vehicle;

public final class PassengerCar extends Vehicle{

    @Override
    public PassengerCar getNewVehicle() {
        PassengerCar passCar = new PassengerCar();
        passCar.setVehicleModel(Model.CAMRY);
        passCar.setVehicleType(Manufacturer.TOYOTA);
        return passCar;
    }
}
