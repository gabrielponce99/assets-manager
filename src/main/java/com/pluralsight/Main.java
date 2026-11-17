package com.pluralsight;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        House house = new House("My house", "2026-09-12", new BigDecimal("200000"),
                "1409 Cedar Hills Ave.", 2, 1800, 6000);

        System.out.println(house.getValue());
    }
}
