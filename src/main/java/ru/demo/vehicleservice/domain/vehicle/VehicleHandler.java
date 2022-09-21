package ru.demo.vehicleservice.domain.vehicle;

public final class VehicleHandler {

    public static Vehicle getVehicle(String... values) {

        if (values == null || values.length == 0) {
            return null;
        }

        VehicleBuilder builder;
        final VehicleType type = VehicleType.getByCode(values[0]);
        switch (type) {
            case PassengerCar:
                builder = new PassengerCarBuilder();
                return ((PassengerCarBuilder)builder)
                        .setWheelCount(values[6])
                        .setTypeOfDrive(values[7])
                        .setSeatsCount(values[5])
                        .setWeight(values[3])
                        .setEngine(values[4])
                        .setManufacturerAndModel(values[1], values[2])
                        .build();
            case Truck:
                builder = new TruckBuilder();
                return ((TruckBuilder)builder)
                        .setCarrying(values[6])
                        .setSeatsCount(values[5])
                        .setWeight(values[3])
                        .setEngine(values[4])
                        .setManufacturerAndModel(values[1], values[2])
                        .build();
        }

        return null;
    }
}
