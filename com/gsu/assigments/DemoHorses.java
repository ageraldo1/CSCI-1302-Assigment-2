package com.gsu.assigments;

/**
 *
 * @author Alexandre
 */
public class DemoHorses {
    
    public static void main (String args[]) {
        
        /* Horse class*/
        System.out.println ("Example of using Horse class\n");
        Horse h = new Horse();
        
        h.setName("Horse1");
        h.setColor("black");
        h.setBirthYear(2010);

        System.out.println ("Horse name.....:" + h.getName());
        System.out.println ("Color..........:" + h.getColor());
        System.out.println ("Year of birth..:" + h.getBirthYear());
        System.out.println("");
        
        
        /* RaceHorse class*/
        System.out.println ("Example of using RaceHorse class\n");
        RaceHorse rh = new RaceHorse();
        
        rh.setName("Pegasus");
        rh.setColor("white");
        rh.setBirthYear(-750);
        rh.setNumberOfRaces(300);
        
        System.out.println ("Horse name.....:" + rh.getName());
        System.out.println ("Color..........:" + rh.getColor());
        System.out.println ("Year of birth..:" + rh.getBirthYear());
        System.out.println ("Races..........:" + rh.getNumberOfRaces());
        System.out.println("");
        
    }
    
}
