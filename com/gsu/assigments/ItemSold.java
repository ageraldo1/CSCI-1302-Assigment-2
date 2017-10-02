package com.gsu.assigments;
/**
 *
 * @author Alexandre
 */
public class ItemSold {
    
    private int invoice;
    private String description;
    private double price;
    
    public ItemSold ()
    {
        this.invoice = 0;
        this.description = "";
        this.price = 0;
    }
    
    public ItemSold(int invoiceNumber, String description, double price)
    {
        this.invoice = invoiceNumber;
        this.description = description;
        this.price = price;
    }
        
    public int getInvoiceNumber()
    {
        return this.invoice;
    }
    
    public void setInvoiceNumber(int i)
    {
        this.invoice = i;
    }
    
    public String getDescription()
    {
        return this.description;
    }
    
    public void setDescription(String s)
    {
        this.description = s;
    }
    
    public double getPrice()
    {
        return this.price;
    }
    
    public void setPrice(double p)
    {
        this.price = p;
    }
    
}
