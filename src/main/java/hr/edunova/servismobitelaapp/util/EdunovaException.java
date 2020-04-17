package hr.edunova.servismobitelaapp.util;

public class EdunovaException extends Exception {

    private String poruka;

    public EdunovaException(String poruka) {
        this.poruka = poruka;
    }

    public String getPoruka() {
        return poruka;
    }

}
