package ru.demo.vehicleservice;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import ru.demo.vehicleservice.domain.vehicle.Manufacturer;
import ru.demo.vehicleservice.domain.vehicle.Model;

@SpringBootApplication
class VehicleServiceApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(VehicleServiceApplication.class).run(args);

        for (Manufacturer elements: Manufacturer.values()) {
            System.out.println(elements);
        }

        for (Model elements: Model.values()) {
            System.out.println(elements);
        }

        // создание объектов через builder
    }
}
