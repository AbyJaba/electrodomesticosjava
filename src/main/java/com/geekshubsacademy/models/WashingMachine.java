package com.geekshubsacademy.models;

public class WashingMachine extends Appliance {
    protected int load=5;

    public WashingMachine() {
        super();
    }

    public WashingMachine(double base_price, int weight) {
        super();
        this.base_price = base_price;
        this.weight = weight;
    }

    public WashingMachine(double base_price, String col, char cons, int weight, int load) {
        this.base_price = base_price;
        this.col = checkColor(col);
        this.cons = checkPowerConsumption(cons);
        this.weight = weight;
        this.load = load;
    }


    public int getload() {
        return load;
    }

    public static double finalPriceWash (WashingMachine appliance)
    {
        if (appliance.load > 30)
        {
            appliance.base_price += 50.00;
        }
        return appliance.base_price;
    }
}