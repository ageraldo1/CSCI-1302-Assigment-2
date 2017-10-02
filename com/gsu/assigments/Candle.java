package com.gsu.assigments;

/**
 *
 * @author Alexandre
 */
public class Candle {
    
    private String color;
    private double height;
    protected double price;
    private final double PER_INCH = 2;
    
    public Candle()
    {
        this.color = "";
        this.height = 0;
        this.price = 0;
    }
    
    
    public String getColor()
    {
        return this.color;
    }
    
    public void setColor(String c)
    {
        this.color = c;
    }
    
    public double getHeight()
    {
        return this.height;
    }
    
    public void setHeight(double h)
    {
        this.height = h;
        this.price = this.PER_INCH * this.height;
    }
    
    public double getPrice()
    {
        return this.price;
    }
}
