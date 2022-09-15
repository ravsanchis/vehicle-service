package ru.demo.vehicleservice.domain.vehicle;

public abstract class Vehicle {

    private Enum vehicleModel;
    private Enum vehicleType;     // убрать car, сделать enum, добавить бренд
    private short vehicleWeight;
    private float engineVolume;

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

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleModel=" + vehicleModel +
                ", vehicleType=" + vehicleType +
                ", vehicleWeight=" + vehicleWeight +
                ", engineVolume=" + engineVolume + '\'' +
                '}';
    }

    public abstract Object getNewVehicle();
}
