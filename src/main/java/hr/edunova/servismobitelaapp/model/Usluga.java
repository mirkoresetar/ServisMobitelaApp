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

@Entity(name="usluga")
public class  Usluga extends Servis{

    
    
    private String imeUsluge;
    private BigDecimal cijena;

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
    
    
    
    
}
