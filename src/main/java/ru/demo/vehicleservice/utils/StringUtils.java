package ru.demo.vehicleservice.utils;

public final class StringUtils {

    public static boolean isNullOrEmpty(String value) {

        return value == null || value.isBlank();
    }
}
