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
public class Poslovnica extends Entitet {

    private String ime;
    private String adresa;

    @ManyToOne
    private Korisnik korisnik;

    @ManyToOne
    private Serviser serviser;

    public String getIme() {
        return ime;
    }

    public Korisnik getKorisnik() {
        return korisnik;
    }

    public void setKorisnik(Korisnik korisnik) {
        this.korisnik = korisnik;
    }

    public Serviser getServiser() {
        return serviser;
    }

    public void setServiser(Serviser serviser) {
        this.serviser = serviser;
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

    @Override
    public String toString() {
        return ime;
    }

}
