package org.ftninformatika.termin14.model;

public class Fruit {

    public static Fruit[] fruits = {
            new Fruit(0, "limun","kiseo je", "lemon.jpg",1),
            new Fruit(1,"pomorandza", "ukusna je", "orange.jpg", 3),
            new Fruit(2, "grejpfrut","gorak je", "grapefruit.jpg",2)
    };



    private int id;
    private String name;
    private String description;
    private String ImageFilename;
    private float rating;

    public Fruit(int id, String name, String description, String imageFilename,float rating) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.rating = rating;
        ImageFilename = imageFilename;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageFilename() {
        return ImageFilename;
    }

    public void setImageFilename(String imageFilename) {
        ImageFilename = imageFilename;
    }
}
