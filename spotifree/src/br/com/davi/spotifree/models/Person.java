package br.com.davi.spotifree.models;

public abstract class Person extends Autor{
    private int age;
    private String bio;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
