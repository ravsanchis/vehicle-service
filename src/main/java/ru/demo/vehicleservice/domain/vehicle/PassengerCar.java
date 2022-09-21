package ru.demo.vehicleservice.domain.vehicle;

final class PassengerCar extends Vehicle {

    private byte wheelCount;
    private String typeOfDrive;

    public PassengerCar(Manufacturer manufacturer, Model model) {
        super(manufacturer, model);
    }

    public byte getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(byte wheelCount) {
        this.wheelCount = wheelCount;
    }

    public String getTypeOfDrive() {
        return typeOfDrive;
    }

    public void setTypeOfDrive(String typeOfDrive) {
        this.typeOfDrive = typeOfDrive;
    }

    @Override
    public String toString() {
        return "PassengerCar{" +
                super.toString() +
                ", wheelCount=" + wheelCount +
                ", typeOfDrive='" + typeOfDrive + '\'' +
                '}';
    }
}
