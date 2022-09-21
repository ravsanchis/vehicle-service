package ru.demo.vehicleservice.domain.vehicle;

import ru.demo.vehicleservice.utils.StringUtils;

final class PassengerCarBuilder extends VehicleBuilder {

    private byte wheelCount;
    private String typeOfDrive;

    PassengerCarBuilder setWheelCount(String wheelCountValue) {
        if (!StringUtils.isNullOrEmpty(wheelCountValue)) {
            this.wheelCount = Byte.parseByte(wheelCountValue);
        }
        return this;
    }

    PassengerCarBuilder setTypeOfDrive(String typeOfDriveValue) {
        this.typeOfDrive = typeOfDriveValue;
        return this;
    }

    @Override
    Vehicle build() {
        final PassengerCar vehicle = new PassengerCar(super.manufacturer, super.model);
        vehicle.setEngine(super.engine);
        vehicle.setWeight(super.weight);
        vehicle.setSeatsCount(super.seatsCount);
        vehicle.setWheelCount(this.wheelCount);
        vehicle.setTypeOfDrive(this.typeOfDrive);
        return vehicle;
    }
}
