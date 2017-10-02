package com.gsu.assigments;

/**
 *
 * @author Alexandre
 */
public class DemoPoems {
    
    public static void main (String args[]) {

        System.out.println ("Example of using Poem class\n");
        Poem p = new Poem("Poem 1", 100);
        Couplet c = new Couplet("Couplet 1");
        Limerick l = new Limerick("Limerick 1");
        Haiku h = new Haiku("Haiku 1");
        
        
        
        System.out.println ("Poem Name....: " + p.getName());
        System.out.println ("Lines........: " + p.getNumberOfLines());
        System.out.println ("");
        
        System.out.println ("Poem Name....: " + c.getName());
        System.out.println ("Lines........: " + c.getNumberOfLines());
        System.out.println ("");

        System.out.println ("Poem Name....: " + l.getName());
        System.out.println ("Lines........: " + l.getNumberOfLines());
        System.out.println ("");

        System.out.println ("Poem Name....: " + h.getName());
        System.out.println ("Lines........: " + h.getNumberOfLines());
        System.out.println ("");
        
        
    }
    
}
