/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gsu.assigments;

/**
 *
 * @author Alexandre
 */
public class RaceHorse  extends Horse {
    private int number_races;
    
    public RaceHorse() {
        super();
        this.number_races = 0;
    }
    
    public void setNumberOfRaces(int r)
    {
        this.number_races = r;
    }
    
    public int getNumberOfRaces()
    {
        return this.number_races;
    }
    
}
