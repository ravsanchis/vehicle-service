package ru.demo.vehicleservice.domain.subject;

public final class Employee extends Subject{

    private final String number;

    public Employee(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

}
