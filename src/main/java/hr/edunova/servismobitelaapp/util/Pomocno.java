/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.servismobitelaapp.util;

import hr.edunova.servismobitelaapp.controller.ObradaKorisnik;
import hr.edunova.servismobitelaapp.model.Korisnik;


/**
 *
 * @author Mirko
 */
public class Pomocno {
  
    
    
    public static void pocetniInsert(){
    
        Korisnik k = new Korisnik();
        k.setIme("Marko");
        k.setPrezime("Perić");
        k.setEmail("markoperic@gmail.com");
        k.setTelefon(null);
        
        ObradaKorisnik obradaKorisnik = new ObradaKorisnik(k);
        try {
            obradaKorisnik.create();
            
        } catch (EdunovaException ex) {
            System.out.println(ex.getPoruka());
        }
    
    
    
    
    }
    
    
    
    
    
    
    public static boolean isOibValjan(String oib) {
        
        if(oib==null){
            return false;
        }
            
            

        if (oib.length() != 11)
            return false;

        try {
            Long.parseLong(oib);
        } catch (NumberFormatException e) {
            return false;
        }

        int a = 10;
        for (int i = 0; i < 10; i++) {
            a = a + Integer.parseInt(oib.substring(i, i+1));
            a = a % 10;
            if (a == 0)
                a = 10;
            a *= 2;
            a = a % 11;
        }
        int kontrolni = 11 - a;
        if (kontrolni == 10)
            kontrolni = 0;

        return kontrolni == Integer.parseInt(oib.substring(10));
}
}