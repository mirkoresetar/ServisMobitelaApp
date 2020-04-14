/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.servismobitelaapp.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Mirko
 */

@Entity
@Table(name="usluga")
public class  Usluga extends Entitet{

    
    
    private String imeUsluge;
    
    
    @ManyToOne
    private Servis servis;
    
    @ManyToOne
    private Poslovnica poslovnica;
    
    @ManyToOne
    private Korisnik korisnik;
    
    @ManyToOne
    private Serviser serviser;
    
    
    @OneToMany(mappedBy = "usluga")
    private List<Clan> clanovi = new ArrayList<>();
    

    public String getImeUsluge() {
        return imeUsluge;
    }

    public void setImeUsluge(String imeUsluge) {
        this.imeUsluge = imeUsluge;
    }

    

    public List<Clan> getClanovi() {
       return clanovi;
    }
    
    public void setClanovi(List<Clan> clanovi) {
        this.clanovi = clanovi;
    }

    public Servis getServis() {
        return servis;
    }

    public void setServis(Servis servis) {
        this.servis = servis;
    }

    public Poslovnica getPoslovnica() {
        return poslovnica;
    }

    public void setPoslovnica(Poslovnica poslovnica) {
        this.poslovnica = poslovnica;
    }

    public Korisnik getKorisnik() {
        return korisnik;
    }

    public void setKorisnik(Korisnik korisnik) {
        this.korisnik = korisnik;
    }

    public Serviser getServiser() {
        return serviser;
    }

    public void setServiser(Serviser serviser) {
        this.serviser = serviser;
    }
    
    

    @Override
    public String toString() {
        return imeUsluge;
    }
    
    
}
