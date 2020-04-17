/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.servismobitelaapp.controller;

import hr.edunova.servismobitelaapp.model.Usluga;
import hr.edunova.servismobitelaapp.util.EdunovaException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mirko
 */
public class ObradaUsluga extends Obrada<Usluga>{

    public ObradaUsluga(Usluga entitet) {
        super(entitet);
    }

    public ObradaUsluga() {
        super();
    }

    @Override
    public Usluga create() throws EdunovaException{
        kontrolaCreate();
        save();
        nakonSpremanja();
        return entitet;
    }
    
    @Override
    public Usluga update() throws EdunovaException{
        kontrolaUpdate();
        save();
        nakonSpremanja();
        return entitet;
    }
    
     private void save() {
        session.beginTransaction();
        session.save(entitet);
         entitet.getClanovi().forEach((c)->{
            session.save(c);
        });
        session.getTransaction().commit();
    }
     
     public void ocistiClanove(){
        session.beginTransaction();
        entitet.getClanovi().forEach((c)->{
            session.delete(c);
        });
         session.getTransaction().commit();
        entitet.setClanovi(new ArrayList<>());
    }
    @Override
    protected void kontrolaCreate() throws EdunovaException {
        
    }

    @Override
    protected void kontrolaUpdate() throws EdunovaException {
        
    }

    @Override
    protected void kontrolaDelete() throws EdunovaException {
        ocistiClanove();
    }

    @Override
    public List<Usluga> getPodaci() {
     return session.createQuery("from Usluga").list();   
    }

    @Override
    protected void nakonSpremanja() throws EdunovaException {
        
    }
    
    
}
