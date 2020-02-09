package org.ftninformatika.termin20;

import java.util.Date;

public class Glumac {
    private int id;
    private String ime;
    private String prezime;
    private String biografija;
    private String fotografija;
    private float ocena;
    private Date datsmrti;
    private Date datrodjenja;




    public Glumac(int id, String ime, String prezime, String biografija, String fotografija, float ocena, Date datsmrti, Date datrodjenja) {
        this.id = id;
        this.ime = ime;
        this.prezime = prezime;
        this.biografija = biografija;
        this.fotografija = fotografija;
        this.ocena = ocena;
        this.datsmrti = datsmrti;
        this.datrodjenja = datrodjenja;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public String getBiografija() {
        return biografija;
    }

    public void setBiografija(String biografija) {
        this.biografija = biografija;
    }

    public String getFotografija() {
        return fotografija;
    }

    public void setFotografija(String fotografija) {
        this.fotografija = fotografija;
    }

    public float getOcena() {
        return ocena;
    }

    public void setOcena(float ocena) {
        this.ocena = ocena;
    }

    public Date getDatsmrti() {
        return datsmrti;
    }

    public void setDatsmrti(Date datsmrti) {
        this.datsmrti = datsmrti;
    }

    public Date getDatrodjenja() {
        return datrodjenja;
    }

    public void setDatrodjenja(Date datrodjenja) {
        this.datrodjenja = datrodjenja;
    }

}
