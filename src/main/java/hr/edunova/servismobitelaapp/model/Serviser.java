
package hr.edunova.servismobitelaapp.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
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
    
   @OneToMany(mappedBy = "serviser")
    private List<Usluga> grupe=new ArrayList<>();
   

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

    public List<Usluga> getGrupe() {
        return grupe;
    }

    public void setGrupe(List<Usluga> grupe) {
        this.grupe = grupe;
    }
    
    
    
    @Override
    public String toString() {
        return prezime + " " + ime;
    }
    
}
