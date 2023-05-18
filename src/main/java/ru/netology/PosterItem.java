package ru.netology;

public class PosterItem {
    private String nameOfFilm;
    private String genre;

    public PosterItem(String nameOfFilm, String genre) {
        this.nameOfFilm = nameOfFilm;
        this.genre = genre;
    }

    public String getNameOfFilm() {
        return nameOfFilm;
    }

    public void setNameOfFilm(String nameOfFilm) {
        this.nameOfFilm = nameOfFilm;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
