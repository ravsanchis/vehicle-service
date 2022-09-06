package ru.demo.vehicleservice;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import ru.demo.vehicleservice.domain.subject.Employee;

@SpringBootApplication
class VehicleServiceApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(VehicleServiceApplication.class).run(args);
        Employee employee = new Employee(number);
        System.out.println(employee.getNumber());
    }
}
