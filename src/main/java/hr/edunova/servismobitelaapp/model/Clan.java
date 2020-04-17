
package hr.edunova.servismobitelaapp.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Clan extends Entitet {

    @ManyToOne
    private Servis servis;

    @ManyToOne
    private Usluga usluga;

    @ManyToOne
    private Serviser serviser;

    private Date datumZavršetka;

    public Servis getServis() {
        return servis;
    }

    public void setServis(Servis servis) {
        this.servis = servis;
    }

    public Usluga getUsluga() {
        return usluga;
    }

    public void setUsluga(Usluga usluga) {
        this.usluga = usluga;
    }

    public Serviser getServiser() {
        return serviser;
    }

    public void setServiser(Serviser serviser) {
        this.serviser = serviser;
    }

    public Date getDatumZavršetka() {
        return datumZavršetka;
    }

    public void setDatumZavršetka(Date datumZavršetka) {
        this.datumZavršetka = datumZavršetka;
    }

    @Override
    public String toString() {
        return getServis().toString();
    }

    public void setServis(Clan p) {

    }

    public void set(Clan p) {

    }

}
