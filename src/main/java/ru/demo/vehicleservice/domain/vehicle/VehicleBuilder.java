package ru.demo.vehicleservice.domain.vehicle;

import ru.demo.vehicleservice.utils.StringUtils;

abstract class VehicleBuilder {

    protected Manufacturer manufacturer;
    protected Model model;
    protected Engine engine;
    protected short weight;
    protected short seatsCount;

    VehicleBuilder setManufacturerAndModel(String manufacturerValue, String modelValue) {
        if (!StringUtils.isNullOrEmpty(manufacturerValue)) {
            this.manufacturer = Manufacturer.valueOf(manufacturerValue);
        }
        if (!StringUtils.isNullOrEmpty(modelValue)) {
            this.model = Model.valueOf(modelValue);
        }
        return this;
    }

    VehicleBuilder setEngine(String engineValue) {
        if (!StringUtils.isNullOrEmpty(engineValue)) {
            this.engine = new Engine(Float.parseFloat(engineValue));
        }
        return this;
    }

    VehicleBuilder setWeight(String weightValue) {
        if (!StringUtils.isNullOrEmpty(weightValue)) {
            this.weight = Short.parseShort(weightValue);
        }
        return this;
    }

    VehicleBuilder setSeatsCount(String seatsCountValue) {
        if (!StringUtils.isNullOrEmpty(seatsCountValue)) {
            this.seatsCount = Short.parseShort(seatsCountValue);
        }
        return this;
    }

    abstract Vehicle build();
}
