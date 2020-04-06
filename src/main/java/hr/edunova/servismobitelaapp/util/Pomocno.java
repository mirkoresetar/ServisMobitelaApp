/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.servismobitelaapp.util;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import hr.edunova.servismobitelaapp.controller.ObradaKorisnik;
import hr.edunova.servismobitelaapp.model.Korisnik;
import hr.edunova.servismobitelaapp.model.Operater;
import hr.edunova.servismobitelaapp.model.Serviser;
import hr.edunova.servismobitelaapp.view.ViewKorisnik;
import hr.edunova.servismobitelaapp.view.ViewServiser;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.hibernate.type.IntegerType;


/**
 *
 * @author Mirko
 */
public class Pomocno {
    
    public static Operater LOGIRAN;
    
    private final static DecimalFormat df = df();
    
    public static String getNazivAplikacije(){
        return "Servis Mobitela";
    }
    
    public static String getFormatCijelogBroja(long i){
        //https://docs.oracle.com/javase/7/docs/api/java/text/DecimalFormat.html
        DecimalFormat dfCijeliBroj = new DecimalFormat("#");
        return dfCijeliBroj.format(i);
    }
    
  public static int getCijeliBrojIzStringa(String s){
         try {
            return Integer.parseInt(s);
        } catch (Exception e) {
            return 0;
        }
    }
  public static String getStringIzBroja(Integer p){
      try {
          return Integer.toString(p);
          
      } catch (Exception e) {
          return null ;
      }
    }
    
  public static String getFormatDecimalniBroj(BigDecimal b){
       
        return df.format(b);
    }
    
    public static BigDecimal getDecimalniBrojIzStringa(String s){
        try {
            return new BigDecimal(df.parse(s).doubleValue());
        } catch (Exception e) {
            return BigDecimal.ZERO;
        }
           
    }
    
    public static void pocetniInsert(){
    
        Korisnik k = new Korisnik();
        k.setIme("Marko");
        k.setPrezime("Perić");
        k.setEmail("markoperic@gmail.com");
        k.setTelefon(null);
        
        ObradaKorisnik obradaKorisnik = new ObradaKorisnik(k);
        try {
            obradaKorisnik.create();
            
        } catch (EdunovaException ex) {
            System.out.println(ex.getPoruka());
        }
    
    
    
    
    }
    
    
    
    
    
    
    public static boolean isOibValjan(String oib) {
        
        if(oib==null){
            return false;
        }
            
            

        if (oib.length() != 11)
            return false;

        try {
            Long.parseLong(oib);
        } catch (NumberFormatException e) {
            return false;
        }

        int a = 10;
        for (int i = 0; i < 10; i++) {
            a = a + Integer.parseInt(oib.substring(i, i+1));
            a = a % 10;
            if (a == 0)
                a = 10;
            a *= 2;
            a = a % 11;
        }
        int kontrolni = 11 - a;
        if (kontrolni == 10)
            kontrolni = 0;

        return kontrolni == Integer.parseInt(oib.substring(10));
}
    private static DecimalFormat df(){
        NumberFormat nf = NumberFormat.
                getNumberInstance(new Locale("hr","HR"));
         DecimalFormat dfl = (DecimalFormat) nf;
         dfl.applyPattern("#,###.00");
    return dfl;
    }
    public static ViewServiser.Osoba getgenIP() {
        try {
        Gson gson = new Gson(); 
        Type userListType = new TypeToken<ArrayList<ViewServiser.Osoba>>(){}.getType();
        URL url = new URL("https://vit.hr/GIP/API/1/json/prvaSlovaVelika");
        InputStreamReader reader = new InputStreamReader(url.openStream());
        List<ViewServiser.Osoba> lista=gson.fromJson(reader, userListType);;
        return lista.get(0);
         } 
        catch (Exception e) {
            return null;
        }
        
    }
    public static String getGenOIB() {
        
        try{
        URL u = new URL("http://oib.itcentrala.com/oib-generator/");
        InputStream in = u.openStream();
            String s = new String(in.readAllBytes(), 
                    StandardCharsets.UTF_8);
           // System.out.println(s);
            int pocIndex=s.indexOf("<div class=\"oib\"><span>HR</span>")+32;
            
            // Napredniji rad s html je HTMLCleaner (maven) i pojam xpath
            return s.substring(pocIndex,pocIndex+11);
        }catch(Exception e){
            return "";
        }
                
    
        
    }
     public static void dodajKorisnika(int ukupno){
        ObradaKorisnik  ok =new ObradaKorisnik();
        Korisnik k;
        ViewServiser.Osoba o;
        for(int i=0;i<ukupno;i++){
            k= new Korisnik();
            o = getgenIP();
            k.setIme(o.getIme());
            k.setPrezime(o.getPrezime());
            
            try {
                ok.setEntitet(k);
                ok.create();
            } catch (Exception e) {
        }
    }
     
}
}