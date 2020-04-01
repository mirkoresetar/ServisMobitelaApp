/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.servismobitelaapp.model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Mirko
 */
@Entity
@Table(name="operater")
public class Operater extends Serviser{
    
    private String lozinka;

    public String getLozinka() {
        return lozinka;
    }

    public void setLozinka(String lozinka) {
        this.lozinka = lozinka;
    }
    
    
    
    
    
}
