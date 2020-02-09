package org.ftninformatika.termin20;

public class Filmovi {
    private int id;
    private String filmovi;

    public Filmovi(int id, String filmovi) {
        this.id = id;
        this.filmovi = filmovi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFilmovi() {
        return filmovi;
    }

    public void setFilmovi(String filmovi) {
        this.filmovi = filmovi;
    }
}
