/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.servismobitelaapp.controller;

import hr.edunova.servismobitelaapp.model.Servis;
import hr.edunova.servismobitelaapp.util.EdunovaException;
import java.util.List;

/**
 *
 * @author Mirko
 */
public class ObradaServis extends Obrada<Servis>{

    public ObradaServis(Servis entitet) {
        super(entitet);
    }

    public ObradaServis() {
        super();
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
    public List<Servis> getPodaci() {
       return session.createQuery("from Servis").list();
    }

    @Override
    protected void nakonSpremanja() throws EdunovaException {
        
    }
    
}
