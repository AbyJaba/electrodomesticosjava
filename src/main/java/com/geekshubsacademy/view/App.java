package com.geekshubsacademy.view;

import com.geekshubsacademy.controller.Controller;
import com.geekshubsacademy.models.Appliance;

public class App
{
    public static void main( String[] args )
    {
        Appliance[] appliances = Controller.createAppliancesArray();
        appliances = Controller.asignAppliances(appliances);
        double finalprice[] = Controller.appliancesPrices(appliances);
        System.out.println("Televisores: " + finalprice[2]);
        System.out.println("Lavadoras: " + finalprice[1]);
        System.out.println("Resto de electrodomésticos: " + finalprice[0]);
        System.out.println("Total: "+finalprice[0]+" + "+finalprice[1] + " + " +finalprice[2] + " = " + (finalprice[0]+finalprice[1]+finalprice[2]) );
    }
}
