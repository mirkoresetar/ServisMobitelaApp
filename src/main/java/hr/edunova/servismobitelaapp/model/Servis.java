/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.servismobitelaapp.model;

import java.math.BigDecimal;
import javax.persistence.Entity;

/**
 *
 * @author Mirko
 */
@Entity(name = "servis")
public class Servis extends Serviser{
    
    private Integer vrijemePocetka;
    private Integer vrijemeZavrsetkatka;
    private BigDecimal cijena;

    public Integer getVrijemePocetka() {
        return vrijemePocetka;
    }

    public void setVrijemePocetka(Integer vrijemePocetka) {
        this.vrijemePocetka = vrijemePocetka;
    }

    public Integer getVrijemeZavrsetkatka() {
        return vrijemeZavrsetkatka;
    }

    public void setVrijemeZavrsetkatka(Integer vrijemeZavrsetkatka) {
        this.vrijemeZavrsetkatka = vrijemeZavrsetkatka;
    }

    public BigDecimal getCijena() {
        return cijena;
    }

    public void setCijena(BigDecimal cijena) {
        this.cijena = cijena;
    }
    
}
