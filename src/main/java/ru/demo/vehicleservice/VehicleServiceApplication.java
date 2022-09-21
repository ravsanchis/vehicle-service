package ru.demo.vehicleservice;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import ru.demo.vehicleservice.data.VehicleRepository;
import ru.demo.vehicleservice.domain.vehicle.Vehicle;
import ru.demo.vehicleservice.domain.vehicle.VehicleHandler;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
class VehicleServiceApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(VehicleServiceApplication.class).run(args);

        List<Vehicle> vehicles = new ArrayList<>();
        for (String[] items: VehicleRepository.items.values()) {
            final Vehicle vehicle = VehicleHandler.getVehicle(items);
            if (vehicle != null) {
                vehicles.add(vehicle);
            }
        }
        vehicles.forEach(System.out::println);
    }
}
