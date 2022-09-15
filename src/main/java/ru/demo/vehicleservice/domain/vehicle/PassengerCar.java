package ru.demo.vehicleservice.domain.vehicle;

public final class PassengerCar extends Vehicle {

    private byte wheelCount;
    private String typeOfDrive;
    private boolean hasBigVehicle;
    private boolean hasOffRoadVehicle;

    public PassengerCar(PassengerCarBuilder passengerCarBuilder) {
        wheelCount = passengerCarBuilder.wheelCount;
        typeOfDrive = passengerCarBuilder.typeOfDrive;
        hasBigVehicle = passengerCarBuilder.hasBigVehicle;
        hasOffRoadVehicle = passengerCarBuilder.hasOffRoadVehicle;
    }
    public byte getWheelCount() {
        return wheelCount;
    }

    public String getTypeOfDrive() {
        return typeOfDrive;
    }

    public boolean isHasBigVehicle() {
        return hasBigVehicle;
    }

    public boolean isHasOffRoadVehicle() {
        return hasOffRoadVehicle;
    }

    @Override
    public PassengerCar getNewVehicle() {
        return null;
    }

    public static class PassengerCarBuilder {

        private byte wheelCount;
        private String typeOfDrive;
        private boolean hasBigVehicle;
        private boolean hasOffRoadVehicle;

        public PassengerCarBuilder(byte wheelCount, String typeOfDrive) {
            this.wheelCount = wheelCount;
            this.typeOfDrive = typeOfDrive;
        }

        public PassengerCarBuilder setHasBigVehicle(boolean hasBigVehicle) {
            this.hasBigVehicle = hasBigVehicle;
            return this;
        }

        public PassengerCarBuilder setHasOffRoadVehicle(boolean hasOffRoadVehicle) {
            this.hasOffRoadVehicle = hasOffRoadVehicle;
            return this;
        }

        public PassengerCar build() {
            return new PassengerCar(this);
        }

    }

}
