package br.com.davi.spotifree.models;

public class Band extends Autor{
    private int creation;
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }

    public int getCreation() {
        return creation;
    }
}
