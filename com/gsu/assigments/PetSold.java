package com.gsu.assigments;

/**
 *
 * @author Alexandre
 */
public class PetSold extends ItemSold {
    
    private boolean vaccinated;
    private boolean neutered;
    private boolean housebroken;
    
    public PetSold ()
    {
        super();
        
        this.vaccinated = false;
        this.neutered = false;
        this.housebroken = false;
    }
    
    public PetSold( boolean v, boolean n, boolean h) 
    {
        super();
        
        this.vaccinated = v;
        this.neutered = n;
        this.housebroken = h;
    }

    public PetSold(int invoice, String description, double price, boolean v, boolean n, boolean h) 
    {
        super(invoice, description, price);
        
        this.vaccinated = v;
        this.neutered = n;
        this.housebroken = h;
    }    
    
    
    
    
    public boolean getVaccination()
    {
        return this.vaccinated;
    }
    
    public void setVaccination(boolean v)
    {
        this.vaccinated = v;
    }
    
    public boolean getCastrate()
    {
        return this.neutered;
    }
    
    public void setCastrate(boolean c)
    {
        this.neutered = c;
    }
    
    public boolean getDomesticate ()
    {
        return this.housebroken;
    }
    
    public void setDomesticate(boolean d)
    {
        this.housebroken = d;
    }
    
    
}
