package hr.edunova.servismobitelaapp.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Mirko
 */
@Entity
@Table(name = "servis")
public class Servis extends Entitet {

    private String opisKvara;
    private Date vrijemePocetka;
    private String radnihSati;
    private BigDecimal cijena;

    @ManyToOne
    private Serviser serviser;

    @OneToMany(mappedBy = "servis")
    private List<Usluga> usluge = new ArrayList<>();

    public List<Usluga> getUsluge() {
        return usluge;
    }

    public void setUsluge(List<Usluga> usluge) {
        this.usluge = usluge;
    }

    public Date getVrijemePocetka() {
        return vrijemePocetka;
    }

    public void setVrijemePocetka(Date vrijemePocetka) {
        this.vrijemePocetka = vrijemePocetka;
    }

    public BigDecimal getCijena() {
        return cijena;
    }

    public void setCijena(BigDecimal cijena) {
        this.cijena = cijena;
    }

    public Serviser getServiser() {
        return serviser;
    }

    public void setServiser(Serviser serviser) {
        this.serviser = serviser;
    }

    public String getOpisKvara() {
        return opisKvara;
    }

    public void setOpisKvara(String opisKvara) {
        this.opisKvara = opisKvara;
    }

    public String getRadnihSati() {
        return radnihSati;
    }

    public void setRadnihSati(String radnihSati) {
        this.radnihSati = radnihSati;
    }

    @Override
    public String toString() {
        return opisKvara;
    }

}
