package com.pluralsight;

import java.math.BigDecimal;
import java.time.Year;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>();

        assets.add(new House("My house", "2023-10-10", new BigDecimal("150000"),
                        "1564 Congress Ave.", 2, 1200, 6000));
        assets.add(new House("Vacation home", "2024-12-08", new BigDecimal("350000"),
                "4000 Ozymandias St.", 3, 1800, 10000));

        assets.add(new Vehicle("Tom's truck", "2021-03-10", new BigDecimal("35000"),
                "Ford F-150", 2019, 120000));
        assets.add(new Vehicle("My car", "2024-08-20", new BigDecimal("20000"),
                "Honda Civic", 2024, 30000));

        for (Asset carAndHouse : assets) {
            System.out.println("Description:    " + carAndHouse.getDescription());
            System.out.println("Date acquired:  " + carAndHouse.getDateAcquired());
            System.out.println("Paid:           $" + carAndHouse.getOriginalCost());
            System.out.println("Value:          $" + carAndHouse.getValue());
            System.out.println("---------------------------------------------");
        }

        //        int thisYear = Year.now().getValue();
//        House house = new House("My house", "2026-09-12", new BigDecimal("200000"),
//                "1409 Cedar Hills Ave.", 2, 1800, 6000);
//
//        System.out.println(house.getValue());
//
//        Vehicle newCar = new Vehicle("Car", "2024-08-20", new BigDecimal("20000"),
//                "Honda Civic", thisYear - 2, 30000);
//        Vehicle midCar = new Vehicle("Car", "2024-08-20", new BigDecimal("20000"),
//                "Toyota Corolla", thisYear - 5, 60000);
//        Vehicle oldCar = new Vehicle("Car", "2024-08-20", new BigDecimal("200000"),
//                "Ford Focus", thisYear - 12, 150000);
//
//        System.out.println("New car: " + newCar.getValue());
//        System.out.println("Mid car: " + midCar.getValue());
//        System.out.println("Old car: " + oldCar.getValue());
    }
}
