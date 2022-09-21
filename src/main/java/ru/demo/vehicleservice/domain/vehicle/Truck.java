package ru.demo.vehicleservice.domain.vehicle;

final class Truck extends Vehicle {

    private int carrying;

    public Truck(Manufacturer manufacturer, Model model) {
        super(manufacturer, model);
    }

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }
}
