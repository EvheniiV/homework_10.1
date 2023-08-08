package ru.netology.poster;

public class PosterManager {
    private int quantyti;
    private String[] poster = new String[quantyti];

    public PosterManager() {
        quantyti = 5;
    }

    public PosterManager(int quantyti) {
        this.quantyti = quantyti;
    }

    public void setPoster(String[] poster) {
        this.poster = poster;
    }

    public String[] getPoster() {
        return poster;
    }

    public void addFilm(String filmName) {
        String[] tmp = new String[poster.length + 1];
        for (int i = 0; i < poster.length; i++) {
            tmp[i] = poster[i];
        }
        tmp[tmp.length - 1] = filmName;
        poster = tmp;
    }

    public void findAll() {
        String[] tmp = new String[quantyti];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = poster[i];
        }
        poster = tmp;
    }

    public void findLast() {
        String[] tmp = new String[quantyti];
        for (int i = tmp.length - 1; i >= 0; i--) {
            tmp[i] = poster[poster.length - 1 - i];
        }
        poster = tmp;
    }
}
