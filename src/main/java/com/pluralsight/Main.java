package com.pluralsight;

import java.math.BigDecimal;
import java.time.Year;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Asset> myAssets = new ArrayList<>();

        myAssets.add(new House("My house", "2023-10-10", new BigDecimal("150000"),
                        "1564 Congress Ave.", 2, 1200, 6000));
        myAssets.add(new House("Vacation home", "2024-12-08", new BigDecimal("350000"),
                "4000 Ozymandias St.", 3, 1800, 10000));

        myAssets.add(new Vehicle("Tom's truck", "2021-03-10", new BigDecimal("17000"),
                "Ford F-150", 2019, 150000));
        myAssets.add(new Vehicle("My car", "2024-08-20", new BigDecimal("20000"),
                "Honda Civic", 2024, 30000));
        myAssets.add(new Cash("Savings", "2026-11-18", new BigDecimal("0"), new BigDecimal("12000")));


        for (Asset asset : myAssets) {
            System.out.println("Description:    " + asset.getDescription());
            System.out.println("Date acquired:  " + asset.getDateAcquired());
            System.out.println("Paid:           $" + asset.getOriginalCost());
            System.out.println("Value:          $" + asset.getValue());
            System.out.println("---------------------------------------------");

            if (asset instanceof House house) {
                System.out.println("Address:      " + house.getAddress());
            } else if (asset instanceof Vehicle vehicle) {
                System.out.println("Vehicle:     " + vehicle.getYear() + " " + vehicle.getMakeModel());
            } else if (asset instanceof Cash cash) {
                System.out.println("Cash:        " + cash.getCash());
            }
            System.out.println("---------------------------------------------");
        }
    }
}
