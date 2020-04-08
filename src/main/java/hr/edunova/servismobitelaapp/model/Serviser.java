
package hr.edunova.servismobitelaapp.model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Mirko
 */

@Entity
@Table(name = "serviser")
public class Serviser extends Entitet{
    
    private String ime;
    private String prezime;
    private String iban;
    private String Oib;
    private String lozinka;
    private String email;
    
   
   

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }
    
    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getOib() {
        return Oib;
    }

    public void setOib(String Oib) {
        this.Oib = Oib;
    }

    public String getLozinka() {
        return lozinka;
    }

    public void setLozinka(String lozinka) {
        this.lozinka = lozinka;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    @Override
    public String toString() {
        return prezime + " " + ime;
    }
    
}
