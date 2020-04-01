/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.servismobitelaapp.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
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
@Table(name = "servis")
public class Servis extends Entitet{
    
    private Date vrijemePocetka;
    private Date vrijemeZavrsetkatka;
    private BigDecimal cijena;
    
  
    
    @ManyToOne
    private Serviser serviser;
    
     @OneToMany(mappedBy = "servis")
    private List<Clan> clanovi = new ArrayList<>();
   
    public Date getVrijemePocetka() {
        return vrijemePocetka;
    }

    public void setVrijemePocetka(Date vrijemePocetka) {
        this.vrijemePocetka = vrijemePocetka;
    }

    public Date getVrijemeZavrsetkatka() {
        return vrijemeZavrsetkatka;
    }

    public void setVrijemeZavrsetkatka(Date vrijemeZavrsetkatka) {
        this.vrijemeZavrsetkatka = vrijemeZavrsetkatka;
    }

    public BigDecimal getCijena() {
        return cijena;
    }

    public void setCijena(BigDecimal cijena) {
        this.cijena = cijena;
    }

    public Serviser getServiser() {
        return serviser;
    }

    public void setServiser(Serviser serviser) {
        this.serviser = serviser;
    }

    public List<Clan> getClanovi() {
        return clanovi;
    }

    public void setClanovi(List<Clan> clanovi) {
        this.clanovi = clanovi;
    }
    

}