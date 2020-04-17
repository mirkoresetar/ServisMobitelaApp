/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.servismobitelaapp.controller;

import hr.edunova.servismobitelaapp.model.Serviser;
import hr.edunova.servismobitelaapp.util.EdunovaException;
import java.util.List;

/**
 *
 * @author Mirko
 */
public class ObradaServiser extends Obrada<Serviser> {

    public ObradaServiser(Serviser entitet) {
        super(entitet);
    }

    public ObradaServiser() {
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
    public List<Serviser> getPodaci() {
        return session.createQuery("from Serviser").list();
    }

    @Override
    protected void nakonSpremanja() throws EdunovaException {

    }

}
