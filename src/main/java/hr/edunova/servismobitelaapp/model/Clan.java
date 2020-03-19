/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.servismobitelaapp.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Clan extends Entitet{
    
    @ManyToOne
    private Servis servis;
    
    @ManyToOne
    private Usluga usluga;

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
    
}
