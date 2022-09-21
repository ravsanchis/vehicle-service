package ru.demo.vehicleservice.domain.vehicle;

import java.util.HashMap;
import java.util.Map;

public enum VehicleType {

    PassengerCar("01"),
    Truck("02"),
    Bus("03");

    private static final Map<String, VehicleType> BY_CODE = new HashMap<>();
    static {
        for (VehicleType e: values()) {
            BY_CODE.put(e.code, e);
        }
    }

    private final String code;
    VehicleType(String code) {
        this.code = code;
    }

    public static VehicleType getByCode(String code) {
        return BY_CODE.get(code);
    }
}
