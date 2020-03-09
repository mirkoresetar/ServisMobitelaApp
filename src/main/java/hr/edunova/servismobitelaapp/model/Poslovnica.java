
package hr.edunova.servismobitelaapp.model;

import javax.persistence.Entity;

/**
 *
 * @author Mirko
 */
@Entity(name = "poslovnica")
public class Poslovnica extends Entitet{
    
    private String ime;
    private String adresa;

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
