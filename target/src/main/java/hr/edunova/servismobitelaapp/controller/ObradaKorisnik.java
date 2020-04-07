
package hr.edunova.servismobitelaapp.controller;

import hr.edunova.servismobitelaapp.model.Korisnik;
import hr.edunova.servismobitelaapp.util.EdunovaException;
import java.util.List;

/**
 *
 * @author Mirko
 */
public class ObradaKorisnik extends Obrada<Korisnik>{

    public ObradaKorisnik(Korisnik entitet) {
        super(entitet);
    }

    public ObradaKorisnik() {
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
    public List<Korisnik> getPodaci() {
        return session.createQuery("from Korisnik").list();
    }
    public List<Korisnik> getPodaci(String uvjet){
        return session.createQuery("from Korisnik p "
                + " where concat(p.ime, ' ', p.prezime) like :uvjet "
                + " or concat(p.prezime, ' ', p.ime) like :uvjet ")
                .setParameter("uvjet", "%" + uvjet + "%")
                .setMaxResults(20).list();
    }
    @Override
    protected void nakonSpremanja() throws EdunovaException {
        
    }
    
}
