
package hr.edunova.servismobitelaapp.model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Mirko
 */
@Entity
@Table(name = "korisnik")
public class Korisnik extends Entitet {

    private String ime;
    private String prezime;
    private String telefon;
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

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
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
