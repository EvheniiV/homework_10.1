package ru.netology.poster;

public class PosterManager {
    private int quantity;
    private String[] poster = new String[quantity];

    public PosterManager() {
        quantity = 5;
    }

    public PosterManager(int quantity) {

        this.quantity = quantity;
    }


    public String[] getPoster() {
        return poster;
    }


    public void addFilm(String[] tmp) {
        poster = tmp;
    }

    public String[] findAll() {
        String[] tmp = new String[quantity];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = poster[i];
        }
        return tmp;
    }

    public String[] findLast() {
        String[] tmp;
        if (quantity > poster.length) {
            tmp = new String[poster.length];
        } else {
            tmp = new String[quantity];
        }
        for (int i = tmp.length - 1; i >= 0; i--) {
            tmp[i] = poster[poster.length - 1 - i];
        }
        return tmp;
    }
}
