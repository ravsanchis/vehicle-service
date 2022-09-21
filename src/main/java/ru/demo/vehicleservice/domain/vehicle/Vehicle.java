package ru.demo.vehicleservice.domain.vehicle;

 public abstract class Vehicle {

    private final Manufacturer manufacturer;
    private final Model model;
    private Engine engine;
    private short weight;
    private short seatsCount;

    protected Vehicle(Manufacturer manufacturer, Model model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public Model getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public short getWeight() {
        return weight;
    }

    public void setWeight(short weight) {
        this.weight = weight;
    }

    public short getSeatsCount() {
        return seatsCount;
    }

    public void setSeatsCount(short seatsCount) {
        this.seatsCount = seatsCount;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "manufacturer=" + manufacturer +
                ", model=" + model +
                ", engine=" + engine +
                ", weight=" + weight +
                ", seatsCount=" + seatsCount +
                '}';
    }
}
