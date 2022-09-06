package ru.demo.vehicleservice;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
class VehicleServiceApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(VehicleServiceApplication.class).run(args);
    }
}
