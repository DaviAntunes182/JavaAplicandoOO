package br.com.davi.spotifree.models;

public abstract class Audio {
    private String title;
    private int duration;
    public int year;
    private int likes;
    private int views;
    private double rating;
    private Autor autor;

    public void like(){
        likes++;
    }
    public void view(){
        views++;
    }

    public int getLikes() {
        return likes;
    }

    public int getViews() {
        return views;
    }

    public double rating(){
        return 0;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void setRating() {
        this.rating = rating();
    }

    public double getRating() {
        return rating;
    }
}
