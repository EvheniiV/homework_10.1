package ru.netology.poster;

public class PosterManager {
    private int quantyti;
    private String[] poster = new String[]{
            "Бладшот",
            "Бэтмен",
            "Багровые реки",
            "Крепкий орешек",
            "Человек невидимка",
            "Чужой",
            "Голодные игры"
    };

    public PosterManager() {
        quantyti = 5;
    }

    public PosterManager(int quantyti) {

        this.quantyti = quantyti;
    }


    public String[] getPoster() {
        return poster;
    }


    public String[] addFilm(String filmName) {
        String[] tmp = new String[poster.length + 1];
        for (int i = 0; i < poster.length; i++) {
            tmp[i] = poster[i];
        }
        tmp[tmp.length - 1] = filmName;
        poster = tmp;
        return poster;
    }

    public String[] findAll() {
        String[] tmp = new String[quantyti];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = poster[i];
        }
        return tmp;
    }

    public String[] findLast() {
        String[] tmp = new String[0];
        if (quantyti > poster.length) {
            tmp = new String[poster.length];
            for (int i = tmp.length - 1; i >= 0; i--) {
                tmp[i] = poster[poster.length - 1 - i];
            }
        } else {
            tmp = new String[quantyti];
            for (int i = tmp.length - 1; i >= 0; i--) {
                tmp[i] = poster[poster.length - 1 - i];
            }


        }
        return tmp;
    }
}
