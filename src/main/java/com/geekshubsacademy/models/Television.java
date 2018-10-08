package com.geekshubsacademy.models;

public class Television extends Appliance {
    int resolution = 20;
    boolean TDTreceiver = false;

    public Television() {
        super();
    }

    public Television(double base_price, int weight) {
        super();
        this.base_price = base_price;
        this.weight = weight;
    }

    public Television(double base_price, String col, char cons, int weight, int resolution, boolean TDTreceiver) {
        super();
        this.base_price = base_price;
        this.col = checkColor(col);
        this.cons = checkPowerConsumption(cons);
        this.weight = weight;
        this.resolution = resolution;
        this.TDTreceiver = TDTreceiver;
    }

    public int getResolution() {
        return resolution;
    }

    public boolean isTDTreceiver() {
        return TDTreceiver;
    }

    public static double finalPriceTV (Television appliance)
    {
        if (appliance.resolution > 40)
            appliance.base_price *= 1.30;

        if (appliance.TDTreceiver)
            appliance.base_price += 50.00;

        return appliance.base_price;
    }
}
