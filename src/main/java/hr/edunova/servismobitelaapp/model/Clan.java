/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.servismobitelaapp.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Clan extends Entitet{
    
    @ManyToOne
    private Servis servis;
    
    @ManyToOne
    private Usluga usluga;
    
    @ManyToOne
    private Serviser serviser;
    
    private Date datumZavršetka;

    public Servis getServis() {
        return servis;
    }

    public void setServis(Servis servis) {
        this.servis = servis;
    }

    public Usluga getUsluga() {
        return usluga;
    }

    public void setUsluga(Usluga usluga) {
        this.usluga = usluga;
    }

    public Serviser getServiser() {
        return serviser;
    }

    public void setServiser(Serviser serviser) {
        this.serviser = serviser;
    }

    public Date getDatumZavršetka() {
        return datumZavršetka;
    }

    public void setDatumZavršetka(Date datumZavršetka) {
        this.datumZavršetka = datumZavršetka;
    }
    
    

    @Override
    public String toString() {
        return getServis().toString();
    }

    public void setServis(Clan p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void set(Clan p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
