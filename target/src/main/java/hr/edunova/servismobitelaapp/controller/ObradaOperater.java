/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.servismobitelaapp.controller;

import hr.edunova.servismobitelaapp.model.Operater;
import hr.edunova.servismobitelaapp.model.Serviser;
import hr.edunova.servismobitelaapp.util.EdunovaException;
import java.util.List;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author Mirko
 */
public class ObradaOperater extends ObradaServiser{

    public ObradaOperater(Serviser entitet) {
        super(entitet);
    }

    public ObradaOperater() {
    }
    
        
    public Operater autoriziraj(String email, String lozinka){
        
        List<Operater> lista = session.createQuery("from Operater o "
                + " where o.email=:email")
                .setParameter("email", email).list();
        if(lista==null || lista.isEmpty()){
            return null;
        }
        Operater o = lista.get(0);
        if(o==null){
            return null;
        }
        
        return BCrypt.checkpw(lozinka, o.getLozinka()) ? o : null;
    }

    @Override
    protected void nakonSpremanja() throws EdunovaException {
    
    }

    @Override
    public List<Serviser> getPodaci() {
        return super.getPodaci();
    }

    @Override
    protected void kontrolaDelete() throws EdunovaException {
     
    }

    @Override
    protected void kontrolaUpdate() throws EdunovaException {
   
    }

    @Override
    protected void kontrolaCreate() throws EdunovaException {
        super.kontrolaCreate();
        
    }
}
            
            
            
    
    
    

