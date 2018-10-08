package com.geekshubsacademy.models;

import java.util.Arrays;
import java.util.List;

public class Appliance {
    protected double base_price = 200;
    protected color col = color.blanco;

    protected power_consumption cons = power_consumption.B;
    protected int weight = 5;

    public enum color {
        blanco,
        rojo,
        metal,
        azul,
        verde;
    }

    public enum power_consumption {
        A,
        B,
        C,
        D,
        E,
        F;
    }

    public color getCol() {
        return col;
    }

    public void setCol(color col) {
        this.col = col;
    }

    public power_consumption getCons() {
        return cons;
    }

    public void setCons(power_consumption cons) {
        this.cons = cons;
    }

    public double getbase_price() {
        return base_price;
    }

    public void setbase_price(double base_price) {
        this.base_price = base_price;
    }

    public int getweight() {
        return weight;
    }

    public void setweight(int weight) {
        this.weight = weight;
    }

    public Appliance() {
    }

    public Appliance(double base_price, int weight) {
        this.base_price = base_price;
        this.weight = weight;
    }

    public Appliance(double base_price, String col, char cons, int weight) {
        this.base_price = base_price;
        this.col = checkColor(col);
        this.cons = checkPowerConsumption(cons);
        this.weight = weight;
    }

    public static power_consumption checkPowerConsumption(char letra) {
        String consumptionValores = "ABCDEF";
        if (!(consumptionValores).contains(String.valueOf(letra))) {
            return power_consumption.B;
        }
        return power_consumption.valueOf(Character.toString(letra));
    }

    public static color checkColor(String col) {
        List<String> colors = Arrays.asList("blanco", "azul", "verde", "rojo", "metal");
        if (!(colors.contains(col))) {
            return color.blanco;
        }
        return color.valueOf(col);
    }

    public static double finalPrice(Appliance appliance) {
        switch (appliance.getCons()) {
            case A:
                appliance.base_price += 100.00;
                break;
            case B:
                appliance.base_price += 85.00;
                break;
            case C:
                appliance.base_price += 60.00;
                break;
            case D:
                appliance.base_price += 50.00;
                break;
            case E:
                appliance.base_price += 30.00;
                break;
            case F:
                appliance.base_price += 10.00;
                break;
            default:
                break;
        }
        if (0 <= appliance.weight && appliance.weight <= 19) {
            appliance.base_price += 10.00;
        }
        if (20 <= appliance.weight && appliance.weight <= 49) {
            appliance.base_price += 50.00;
        }
        if (50 <= appliance.weight && appliance.weight <= 79) {
            appliance.base_price += 80.00;
        }
        if (appliance.weight >= 80) {
            appliance.base_price += 100.00;
        }

        if (appliance instanceof WashingMachine)
            appliance.base_price = WashingMachine.finalPriceWash((WashingMachine) appliance);
        if (appliance instanceof Television)
            appliance.base_price = Television.finalPriceTV((Television) appliance);

        return appliance.base_price;
    }
}

