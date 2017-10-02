package com.gsu.assigments;

/**
 *
 * @author Alexandre
 */
public class ScentedCandle extends Candle {
    private String scent;
    private final double PER_INCH = 3;
    
    public ScentedCandle() {
        super();
        this.scent = "";
    }
    
    public String getScent()
    {
        return this.scent;
        
    }
    
    public void setScent(String s)
    {
        this.scent = s;
    }
    
    public void setHeight(double h)
    {
        super.setHeight(h);
        this.price = h * PER_INCH;
        
    }
    
}
