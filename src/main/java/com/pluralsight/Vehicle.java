package com.pluralsight;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.Year;
import java.util.Locale;

public class Vehicle extends Asset {
    private String makeModel;
    private int year, odometer;

    public Vehicle(String description, String dateAcquired, BigDecimal originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public BigDecimal getValue() {
        int age = Year.now().getValue() - year;
        BigDecimal value;

        if (age > 10) {
            value = new BigDecimal("1000.00");
        } else {
            BigDecimal ratePerYear;
            if (age > 3) {
                ratePerYear = new BigDecimal("0.03");
            } else if (age > 6) {
                ratePerYear = new BigDecimal("0.06");
            } else {
                ratePerYear = new BigDecimal("0.08");
            }

            BigDecimal depreciation = getOriginalCost().multiply(ratePerYear).multiply(BigDecimal.valueOf(age));

            value = getOriginalCost().subtract(depreciation);
        }
        boolean isHondaOrToyota = makeModel.toLowerCase().contains("Honda") || makeModel.toLowerCase().contains("Toyota");
        if (odometer > 100000 && !isHondaOrToyota) {
            value = value.multiply(new BigDecimal("0.75"));
        }
        return value;
    }
}
