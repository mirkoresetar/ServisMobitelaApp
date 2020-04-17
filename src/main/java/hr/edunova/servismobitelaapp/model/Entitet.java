package hr.edunova.servismobitelaapp.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author Mirko
 */
@MappedSuperclass
public abstract class Entitet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer sifra;

    public Integer getSifra() {
        return sifra;
    }

    public void setSifra(Integer sifra) {
        this.sifra = sifra;
    }

}
