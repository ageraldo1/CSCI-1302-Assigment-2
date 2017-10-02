package com.gsu.assigments;

/**
 *
 * @author Alexandre
 */
public class DemoCandles {
    
    public static void main (String args[])
    {
        /* Candle class */
        System.out.println ("Example of using Candle class\n");
        Candle c = new Candle();
        
        c.setColor("white");
        c.setHeight(20);
        
        
        System.out.println ("Color......: " + c.getColor());
        System.out.println ("Height.....: " + c.getHeight());
        System.out.println ("Price......: " + c.getPrice());
        System.out.println ("");
                

        /* ScentedCandle class */
        System.out.println ("Example of using ScentedCandle class\n");
        ScentedCandle sc = new ScentedCandle();
        
        sc.setColor("yellow");
        sc.setScent("vanilla");
        sc.setHeight(30);
        
        System.out.println ("Color......: " + sc.getColor());
        System.out.println ("Height.....: " + sc.getHeight());
        System.out.println ("Scent......: " + sc.getScent());
        System.out.println ("Price......: " + sc.getPrice());
        
    }
        
}
