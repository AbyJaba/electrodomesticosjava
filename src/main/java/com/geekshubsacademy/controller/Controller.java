package com.geekshubsacademy.controller;

import com.geekshubsacademy.models.Appliance;
import com.geekshubsacademy.models.Television;
import com.geekshubsacademy.models.WashingMachine;

public class Controller {

    public static Appliance[] createAppliancesArray()
    {
        Appliance[] appliances = new Appliance[10];

        return appliances;
    }

    public static Appliance[] asignAppliances(Appliance [] appliances)
    {
        appliances[0] = new Appliance();
        appliances[1] = new Appliance(100, "rojo", 'A',20);
        appliances[2] = new Appliance(200, "blanco", 'B',10);
        appliances[3] = new Appliance(50, "metal", 'D',5);
        appliances[4] = new Appliance(10, "rojo", 'F',2);
        appliances[5] = new WashingMachine(270, "blanco", 'E',35, 45);
        appliances[6] = new WashingMachine(570, "blanco", 'E',30, 40);
        appliances[7] = new Appliance(100, "rojo", 'A',20);
        appliances[8] = new Television(50, "metal", 'D',5,30,false);
        appliances[9] = new Television(1200, "metal", 'E',7,60,true);

        return appliances;
    }

    public static double[] appliancesPrices(Appliance[] appliances)
    {
        double appliancesPrices = 0;
        double tvPrices = 0;
        double washMachinesPrices = 0;
        double[] prices = new double[3];

        for (int i=0; i<10; i++)
        {
            if (appliances[i] instanceof Television)
            {
                tvPrices += Appliance.finalPrice(appliances[i]);
            }

            if (appliances[i] instanceof WashingMachine)
            {
                washMachinesPrices += Appliance.finalPrice(appliances[i]);
            }

            if (!(appliances[i] instanceof Television) && !(appliances[i] instanceof WashingMachine))
            {
                appliancesPrices += Appliance.finalPrice(appliances[i]);
            }
        }

        prices[0] = appliancesPrices;
        prices[1] = washMachinesPrices;
        prices[2] = tvPrices;

        return prices;
    }
}


