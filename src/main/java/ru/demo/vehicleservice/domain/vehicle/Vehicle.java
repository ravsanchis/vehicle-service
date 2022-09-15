package ru.demo.vehicleservice.domain.vehicle;

public abstract class Vehicle {

    private Enum vehicleModel;
    private Enum vehicleType;     // убрать car, сделать enum, добавить бренд
    private short vehicleWeight;
    private byte wheelCount;        // перенести
    private float engineVolume;
    private String typeOfDrive;

    public Enum getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(Enum vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public Enum getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(Enum vehicleType) {
        this.vehicleType = vehicleType;
    }

    public short getVehicleWeight() {
        return vehicleWeight;
    }

    public void setVehicleWeight(short vehicleWeight) {
        this.vehicleWeight = vehicleWeight;
    }

    public byte getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(byte wheelCount) {
        this.wheelCount = wheelCount;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getTypeOfDrive() {
        return typeOfDrive;
    }

    public void setTypeOfDrive(String typeOfDrive) {
        this.typeOfDrive = typeOfDrive;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleModel=" + vehicleModel +
                ", vehicleType=" + vehicleType +
                ", vehicleWeight=" + vehicleWeight +
                ", wheelCount=" + wheelCount +
                ", engineVolume=" + engineVolume +
                ", typeOfDrive='" + typeOfDrive + '\'' +
                '}';
    }

    public abstract Object getNewVehicle();
}
