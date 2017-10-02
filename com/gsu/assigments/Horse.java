package com.gsu.assigments;

/**
 *
 * @author Alexandre
 */

public class Horse {
    
    private String name;
    private String color;
    private int birth_year;
    
    public Horse() {
        this.name = "";
        this.color = "";
        this.birth_year = 0;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public void setName(String n)
    {
        this.name = n;
    }
    
    public String getColor()
    {
        return this.color;
    }
    
    public void setColor(String c) 
    {
        this.color = c;
    }
    
    public int getBirthYear() 
    {
        return this.birth_year;
    }
    
    public void setBirthYear(int y)
    {
        this.birth_year = y;
    }
    
}
