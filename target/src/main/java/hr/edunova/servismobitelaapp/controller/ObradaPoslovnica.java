/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.servismobitelaapp.controller;

import hr.edunova.servismobitelaapp.model.Poslovnica;
import hr.edunova.servismobitelaapp.util.EdunovaException;
import java.util.List;

/**
 *
 * @author Mirko
 */
public class ObradaPoslovnica extends Obrada<Poslovnica>{

    public ObradaPoslovnica(Poslovnica poslovnica) {
        super(poslovnica);
    }

    public ObradaPoslovnica() {
        super();
    }
    
    public List<Poslovnica> getPodaci() {
        return session.createQuery("from Poslovnica").list();
    }
    
    @Override
    protected void kontrolaCreate() throws EdunovaException {
       
    }

    @Override
    protected void kontrolaUpdate() throws EdunovaException {
        
    }

    @Override
    protected void kontrolaDelete() throws EdunovaException {
        
    }

    

    @Override
    protected void nakonSpremanja() throws EdunovaException {
        
    }
    
}
