package com.pluralsight;

import java.math.BigDecimal;
import java.time.Year;

public class Main {
    public static void main(String[] args) {
        int thisYear = Year.now().getValue();
        House house = new House("My house", "2026-09-12", new BigDecimal("200000"),
                "1409 Cedar Hills Ave.", 2, 1800, 6000);

        System.out.println(house.getValue());

        Vehicle newCar = new Vehicle("Car", "2024-08-20", new BigDecimal("20000"),
                "Honda Civic", thisYear - 2, 30000);
        Vehicle midCar = new Vehicle("Car", "2024-08-20", new BigDecimal("20000"),
                "Toyota Corolla", thisYear - 5, 60000);
        Vehicle oldCar = new Vehicle("Car", "2024-08-20", new BigDecimal("200000"),
                "Ford Focus", thisYear - 12, 150000);

        System.out.println("New car: " + newCar.getValue());
        System.out.println("Mid car: " + midCar.getValue());
        System.out.println("Old car: " + oldCar.getValue());
    }
}
