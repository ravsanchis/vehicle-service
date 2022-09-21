package ru.demo.vehicleservice.domain.vehicle;

final class Engine {

    private final float volume;

    public Engine(float volume) {
        this.volume = volume;
    }

    public float getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "volume=" + volume +
                '}';
    }
}
