package org.ftninformatika.termin20;

import java.util.ArrayList;
import java.util.List;

public class Datap {
    private List<Glumac> glumci;
    private List<Filmovi> filmovi;
    private static Datap _instance;

    public  Datap getInstance() {
        if (_instance == null) {
            _instance = new Datap();
        }
        return _instance;
    }

    public static List<String> getImenaGlumaca() {

        List<String> ime = new ArrayList<>();
        ime.add("Dzoni");
        ime.add("Silverster");
        ime.add("Arnold");
        ime.add("Milos");
        return ime;
    }

    public static List<String> getPrezimenaGlumaca() {
        List<String> prezime = new ArrayList<>();
        prezime.add("Depp");
        prezime.add("Stalone");
        prezime.add("Svancineger");
        prezime.add("Bikovic");
        return prezime;
    }

    public static List<String> getFilmovi() {
        List<String> filmovi = new ArrayList<>();
        filmovi.add("Pirati sa kariba");
        filmovi.add("Rambo");
        filmovi.add("Terminator");
        filmovi.add("Sluga");
        return filmovi;
    }

    public Datap() {
        imenaGlumaca();
        imenaFilmova();
    }

    private void imenaGlumaca(){
        glumci= new ArrayList<>();
        glumci.add(new Glumac(0,"Dzoni","Depp","Glumac u akcionim i komedijama","",3,null,1978));
        glumci.add(new Glumac(1,"Silvester","Stalone","Glumac u akcionim filmovima","",4,null,1960));
        glumci.add(new Glumac(2,"Arnold","Svajcineger","Glumac u akcionim","",5,null,1956));
        glumci.add(new Glumac(3,"Milos","Bikovic","Glumac u akcionim,komedijama i drugim","",4.5,null,1988));


    }

    private void imenaFilmova() {
        filmovi = new ArrayList<>();
        filmovi.add(new Filmovi(0, "Pirati sa kariba"));
        filmovi.add(new Filmovi(1, "Rambo"));
        filmovi.add(new Filmovi(2, "Terminator"));
        filmovi.add(new Filmovi(3, "Sluga"));
    }

    public Filmovi getFilmoviById(int id) {
        switch (id) {
            case 0:
                return filmovi.get(0);
            case 1:
                return filmovi.get(1);
            case 2:
                return filmovi.get(2);
            case 3:
                return filmovi.get(3);
            default:
                return null;
        }
    }
    public Glumac getGlumacById(int id) {

        switch (id) {
            case 0:
                return glumci.get(0);
            case 1:
                return glumci.get(1);
            case 2:
                return glumci.get(2);
            case 3:
                return glumci.get(3);
            default:
                return null;
        }
    }

    public List<Glumac> getGlumci() {
        return glumci;
    }
}
