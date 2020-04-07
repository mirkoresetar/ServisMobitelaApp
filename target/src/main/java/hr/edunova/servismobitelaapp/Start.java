/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.servismobitelaapp;

import hr.edunova.servismobitelaapp.util.HibernateUtil;
import hr.edunova.servismobitelaapp.util.Pomocno;
import hr.edunova.servismobitelaapp.view.Izbornik;
import hr.edunova.servismobitelaapp.view.SplashScreen;

/**
 *
 * @author Mirko
 */
public class Start {
    public Start(){
        new SplashScreen().setVisible(true);
        //Pomocno.pocetniInsert();
        //Pomocno.dodajKorisnika(1000);
       //new Izbornik().setVisible(true);
       
    }
    
    
    
    public static void main(String[] args) {
        new Start();
    }
    
}
