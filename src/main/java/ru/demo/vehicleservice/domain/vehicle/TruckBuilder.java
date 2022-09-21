package ru.demo.vehicleservice.domain.vehicle;

import ru.demo.vehicleservice.utils.StringUtils;

final class TruckBuilder extends VehicleBuilder {

    private int carrying;

    TruckBuilder setCarrying(String carryingValue) {
        if (!StringUtils.isNullOrEmpty(carryingValue)) {
            this.carrying = Integer.parseInt(carryingValue);
        }
        return this;
    }

    @Override
    Vehicle build() {
        final Truck vehicle = new Truck(super.manufacturer, super.model);
        vehicle.setEngine(super.engine);
        vehicle.setWeight(super.weight);
        vehicle.setSeatsCount(super.seatsCount);
        vehicle.setCarrying(this.carrying);
        return vehicle;
    }
}
