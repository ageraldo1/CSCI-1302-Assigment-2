package com.gsu.assigments;

/**
 *
 * @author Alexandre
 */
public class Poem {
    private String name;
    private int nrlines;
    
    public Poem (String n, int l) {
        this.name = n;
        this.nrlines = l;
    }
    
    public String getName ()
    { 
       return this.name;
    }
    
    public void setName(String n)
    {
        this.name = n;
    }
    
    public int getNumberOfLines()
    {
        return this.nrlines;
    }
    
    public void setNumberOfLines(int l)
    {
        this.nrlines = l;
    }
    
    
}
