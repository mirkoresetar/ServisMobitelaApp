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
    private BigDecimal cijena;
    
    
    @OneToMany(mappedBy = "usluga")
    private List<Clan> clanovi = new ArrayList<>();
    

    public String getImeUsluge() {
        return imeUsluge;
    }

    public void setImeUsluge(String imeUsluge) {
        this.imeUsluge = imeUsluge;
    }

    public BigDecimal getCijena() {
        return cijena;
    }

    public void setCijena(BigDecimal cijena) {
        this.cijena = cijena;
    }

    public List<Clan> getClanovi() {
       return clanovi;
    }
    
    public void setClanovi(List<Clan> clanovi) {
        this.clanovi = clanovi;
    }
    
    
}
