package ru.netology.poster;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {

    String[] testArray = new String[]{
            "Бладшот",
            "Бэтмен",
            "Багровые реки",
            "Крепкий орешек",
            "Человек невидимка",
            "Чужой",
            "Голодные игры"
    };

    @Test
    public void addFilmTest() {
        PosterManager poster = new PosterManager();
        poster.addFilm(testArray);

        String[] expected = new String[]{
                "Бладшот",
                "Бэтмен",
                "Багровые реки",
                "Крепкий орешек",
                "Человек невидимка",
                "Чужой",
                "Голодные игры"
        };
        String[] actual = poster.getPoster();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void findAllWithParameterTest() {
        PosterManager poster = new PosterManager(3);
        poster.addFilm(testArray);

        String[] expected = new String[]{
                "Бладшот",
                "Бэтмен",
                "Багровые реки",
        };
        String[] actual = poster.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void findAllDefaultQuantytiTest() {
        PosterManager poster = new PosterManager();
        poster.addFilm(testArray);

        String[] expected = new String[]{
                "Бладшот",
                "Бэтмен",
                "Багровые реки",
                "Крепкий орешек",
                "Человек невидимка"
        };
        String[] actual = poster.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastWithParameterTest() {
        PosterManager poster = new PosterManager(7);
        poster.addFilm(testArray);

        String[] expected = new String[]{
                "Голодные игры",
                "Чужой",
                "Человек невидимка",
                "Крепкий орешек",
                "Багровые реки",
                "Бэтмен",
                "Бладшот"
        };
        String[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastWithParameterOverLimitTest() {
        PosterManager poster = new PosterManager(25);
        poster.addFilm(testArray);

        String[] expected = new String[]{
                "Голодные игры",
                "Чужой",
                "Человек невидимка",
                "Крепкий орешек",
                "Багровые реки",
                "Бэтмен",
                "Бладшот"
        };
        String[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastDefaultQuantytiTest() {
        PosterManager poster = new PosterManager();
        poster.addFilm(testArray);

        String[] expected = new String[]{
                "Голодные игры",
                "Чужой",
                "Человек невидимка",
                "Крепкий орешек",
                "Багровые реки"
        };
        String[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

}
