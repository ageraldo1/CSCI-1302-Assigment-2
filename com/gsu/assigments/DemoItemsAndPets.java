package com.gsu.assigments;

/**
 *
 * @author Alexandre
 */
public class DemoItemsAndPets {
    
    public static void main (String args[]) {
        /* ItemSold  */
        System.out.println ("Example of using ItemSold class\n");
        ItemSold is1 = new ItemSold();
        
        // product #1
        is1.setDescription("Dogs Toy ABC");
        is1.setInvoiceNumber (1);
        is1.setPrice(3.50);

        System.out.println ("Product......: " + is1.getDescription());
        System.out.println ("Invoice......: " + is1.getInvoiceNumber());
        System.out.println ("Price........: " + is1.getPrice());
        System.out.println ("");

        
        // product #2
        ItemSold is2 = new ItemSold(2, "Dogs Feed", 5.50);

        System.out.println ("Product......: " + is2.getDescription());
        System.out.println ("Invoice......: " + is2.getInvoiceNumber());
        System.out.println ("Price........: " + is2.getPrice());
        System.out.println ("");


        System.out.println ("Example of using PetSold class\n");
        PetSold ps1 = new PetSold();
        
        // PetSold #1
        ps1.setDescription("Good Dog1");
        ps1.setInvoiceNumber (3);
        ps1.setPrice(100.00);
        ps1.setCastrate(true);
        ps1.setDomesticate(true);
        ps1.setVaccination(true);
        
        System.out.println ("Product........: " + ps1.getDescription());
        System.out.println ("Invoice........: " + ps1.getInvoiceNumber());
        System.out.println ("Price..........: " + ps1.getPrice());
        System.out.println ("Castrated......: " + ps1.getCastrate());
        System.out.println ("Domesticated...: " + ps1.getDomesticate());
        System.out.println ("Vaccinated.....: " + ps1.getVaccination());
        System.out.println ("");
        

        // PetSold #2
        PetSold ps2 = new PetSold(4, "Bad Dog1",1.99, false,false,false );

        System.out.println ("Product........: " + ps2.getDescription());
        System.out.println ("Invoice........: " + ps2.getInvoiceNumber());
        System.out.println ("Price..........: " + ps2.getPrice());
        System.out.println ("Castrated......: " + ps2.getCastrate());
        System.out.println ("Domesticated...: " + ps2.getDomesticate());
        System.out.println ("Vaccinated.....: " + ps2.getVaccination());
        System.out.println ("");

    }
    
}
