package com.geekshubsacademy;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.geekshubsacademy.controller.Controller;
import com.geekshubsacademy.models.Appliance;
import com.geekshubsacademy.models.Television;
import com.geekshubsacademy.models.WashingMachine;

/**
 * Unit test for simple App.
 */
public class Testing
{
    /**
     * Rigorous Test :-)
     */
    @org.junit.Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @org.junit.Test
    public void shouldBeAnAppliance()
    {
        Appliance gadget = new Appliance();
        assertEquals(true, gadget instanceof Appliance);
    }

    @org.junit.Test
    public void shouldBeOfApplianceClassWith2Params()
    {
        Appliance gadget = new Appliance(100,10);
        assertEquals(true, gadget instanceof Appliance);
    }

    @org.junit.Test
    public void shouldBeOfApplianceClassWithAllParams()
    {
        Appliance gadget = new Appliance(200, "azul", 'A', 15);
        assertEquals(true, gadget instanceof Appliance);
    }

    @org.junit.Test
    public void shouldGetADouble()
    {
        Appliance gadget = new Appliance();
        double price = gadget.getbase_price();
        assertEquals(200, price, 0.0000001);
    }

    @org.junit.Test
    public void shouldGetAColor()
    {
        Appliance gadget = new Appliance();
        Appliance.color col = gadget.getCol();
        assertEquals(Appliance.color.blanco, col);
    }

    @org.junit.Test
    public void shouldGetAPowerConsumption()
    {
        Appliance gadget = new Appliance();
        Appliance.power_consumption pow = gadget.getCons();
        assertEquals(Appliance.power_consumption.B, pow);
    }

    @org.junit.Test
    public void shouldGetANumber()
    {
        Appliance gadget = new Appliance();
        int weight = gadget.getweight();
        assertEquals(5, weight);
    }

    @org.junit.Test
    public void shouldSetPrice()
    {
        Appliance gadget = new Appliance();
        gadget.setbase_price(300);
        assertEquals(300, gadget.getbase_price(),0.0000000001);
    }

    @org.junit.Test
    public void shouldSetPriceForTV()
    {
        Television gadget = new Television();
        gadget.setbase_price(300);
        assertEquals(300, gadget.getbase_price(),0.0000000001);
    }

    @org.junit.Test
    public void shouldSetPriceForWashingMachine()
    {
        WashingMachine gadget = new WashingMachine();
        gadget.setbase_price(300);
        assertEquals(300, gadget.getbase_price(),0.0000000001);
    }

    @org.junit.Test
    public void shouldSetColor()
    {
        Appliance gadget = new Appliance();
        gadget.setCol(Appliance.color.metal);
        assertEquals(Appliance.color.metal, gadget.getCol());
    }




    @org.junit.Test
    public void shouldSetPowerConsumption()
    {
        Appliance gadget = new Appliance();
        gadget.setCons(Appliance.power_consumption.C);
        assertEquals(Appliance.power_consumption.C,gadget.getCons());
    }




    @org.junit.Test
    public void shouldSetWeight()
    {
        Appliance gadget = new Appliance();
        gadget.setweight(20);
        assertEquals(20, gadget.getweight());
    }




    @org.junit.Test
    public void shouldCheckPowerConsumption()
    {
        Appliance gadget = new Appliance();
        assertEquals(Appliance.power_consumption.B, gadget.checkPowerConsumption('G'));
    }

    @org.junit.Test
    public void shouldCheckColor()
    {
        Appliance gadget = new Appliance();
        assertEquals(Appliance.color.rojo, gadget.checkColor("rojo"));
    }

    @org.junit.Test
    public void shouldBeAWashingMachine()
    {
        WashingMachine gadget = new WashingMachine();
        assertEquals(true, gadget instanceof WashingMachine);
    }

    @org.junit.Test
    public void shouldCreateAWashingMachineWithPriceAndWeight()
    {
        WashingMachine gadget = new WashingMachine(500, 30);
        assertEquals(true, gadget instanceof WashingMachine);
    }

    @org.junit.Test
    public void shouldCreateAWashingMachineWithAllParams()
    {
        WashingMachine gadget = new WashingMachine(500, "blanco", 'B',40,35);
        assertEquals(true, gadget instanceof WashingMachine);
    }

    @org.junit.Test
    public void shouldGetLoad()
    {
        WashingMachine gadget = new WashingMachine(500, "blanco", 'B',40,35);
        int load = gadget.getload();
        assertEquals(35, gadget.getload());
    }

    @org.junit.Test
    public void shouldBeATV()
    {
        Television gadget = new Television();
        assertEquals(true, gadget instanceof Television);
    }

    @org.junit.Test
    public void shouldCreateATVWithPriceAndWeight()
    {
        Television gadget = new Television(700,20);
        assertEquals(true, gadget instanceof Television);
    }

    @org.junit.Test
    public void shouldCreateATVWithAllParams()
    {
        Television gadget = new Television(700, "rojo", 'C', 20, 45, true);
        assertEquals(true, gadget instanceof Television);
    }

    @org.junit.Test
    public void shouldGetResolution()
    {
        Television gadget = new Television();
        int res = gadget.getResolution();
        assertEquals(20, res);
    }

    @org.junit.Test
    public void shouldNotHaveTDTreceiver()
    {
        Television gadget = new Television();
        boolean tdt = gadget.isTDTreceiver();
        assertEquals(false, tdt);
    }

    @org.junit.Test
    public void shouldGiveFinalPrice()
    {
        Appliance gadget = new Appliance(100.00, "metal", 'E',10);
        double finalprice = Appliance.finalPrice(gadget);
        assertEquals(140.00, finalprice,0.0000001);
    }

    @org.junit.Test
    public void shouldGiveFinalPriceTV()
    {
        Television tv = new Television(700.00,"azul",'A',15,52,true);
        double finalprice = Appliance.finalPrice(tv);
        assertEquals(1070.00, finalprice,0.0000001);
    }

    @org.junit.Test
    public void shouldGiveFinalPriceWash()
    {
        WashingMachine wash = new WashingMachine(500.00,"blanco",'D',25,30);
        double finalprice = Appliance.finalPrice(wash);
        assertEquals(600.00, finalprice,0.0000001);
    }

    @org.junit.Test
    public void shouldCreateAnAppliancesArray()
    {
        Appliance[] appliances = Controller.createAppliancesArray();
        Controller.asignAppliances(appliances);

        for (int i=0;i<10;i++)
        {
            assertEquals(true, appliances[i] instanceof Appliance);
        }
    }

    @org.junit.Test
    public void shouldGivePriceOfAppliancesinArray()
    {
        Appliance[] gadgets = new Appliance[10];

        gadgets[0] = new Appliance(100, "rojo", 'A',20);
        gadgets[1] = new Appliance(100, "rojo", 'A',20);
        gadgets[2] = new Appliance(100, "rojo", 'A',20);
        gadgets[3] = new Appliance(100, "rojo", 'A',20);
        gadgets[4] = new Appliance(100, "rojo", 'A',20);
        gadgets[5] = new WashingMachine(270, "blanco", 'E',30, 45);
        gadgets[6] = new WashingMachine(270, "blanco", 'E',30, 45);
        gadgets[7] = new Appliance(100, "rojo", 'A',20);
        gadgets[8] = new Television(30, "metal", 'F',5,30,true);
        gadgets[9] = new Television(30, "metal", 'F',5,30,true);

        double[] prices = Controller.appliancesPrices(gadgets);
        assertEquals(1500, prices[0], 0.00000001);
    }

}





