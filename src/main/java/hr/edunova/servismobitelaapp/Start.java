
package hr.edunova.servismobitelaapp;

import hr.edunova.servismobitelaapp.util.HibernateUtil;
import hr.edunova.servismobitelaapp.util.Pomocno;
import hr.edunova.servismobitelaapp.view.SplashScreen;

/**
 *
 * @author Mirko
 */
public class Start {

    public Start() {
        new SplashScreen().setVisible(true);
        //Pomocno.pocetniInsert();
        //Pomocno.dodajKorisnika(1000);

    }

    public static void main(String[] args) {
        new Start();
    }

}
