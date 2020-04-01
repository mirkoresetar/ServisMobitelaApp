
package hr.edunova.servismobitelaapp.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Mirko
 */
@Entity
@Table(name = "poslovnica")
public class Poslovnica extends Entitet{
    
    private String ime;
    private String adresa;
    
    @ManyToOne
    private Korisnik korisnik;
    
    @ManyToOne
    private Serviser serviser;
    

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }
    
    
    
    
}
