package ru.netology.poster;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {

    public String[] testArray = new String[]{
            "Бладшот",
            "Бэтмен",
            "Багровые реки",
            "Крепкий орешек",
            "Человек невидимка",
            "Чужой",
            "Голодные игры"
    };

    @Test
    public void setPosterTest() {
        PosterManager poster = new PosterManager();
        poster.setPoster(testArray);

        String[] expected = testArray;
        String[] actual = poster.getPoster();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addFilmTest() {
        PosterManager poster = new PosterManager();
        poster.setPoster(testArray);
        poster.addFilm("Карамора");

        String[] expected = new String[]{
                "Бладшот",
                "Бэтмен",
                "Багровые реки",
                "Крепкий орешек",
                "Человек невидимка",
                "Чужой",
                "Голодные игры",
                "Карамора"
        };
        String[] actual = poster.getPoster();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void findAllWithParameterTest() {
        PosterManager poster = new PosterManager(3);
        poster.setPoster(testArray);
        poster.findAll();

        String[] expected = new String[]{
                "Бладшот",
                "Бэтмен",
                "Багровые реки",
        };
        String[] actual = poster.getPoster();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findAllDefaultQuantytiTest() {
        PosterManager poster = new PosterManager();
        poster.setPoster(testArray);
        poster.findAll();

        String[] expected = new String[]{
                "Бладшот",
                "Бэтмен",
                "Багровые реки",
                "Крепкий орешек",
                "Человек невидимка"
        };
        String[] actual = poster.getPoster();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastWithParameterTest() {
        PosterManager poster = new PosterManager(7);
        poster.setPoster(testArray);
        poster.findLast();

        String[] expected = new String[]{
                "Голодные игры",
                "Чужой",
                "Человек невидимка",
                "Крепкий орешек",
                "Багровые реки",
                "Бэтмен",
                "Бладшот"
        };
        String[] actual = poster.getPoster();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastDefaultQuantytiTest() {
        PosterManager poster = new PosterManager();
        poster.setPoster(testArray);
        poster.findLast();

        String[] expected = new String[]{
                "Голодные игры",
                "Чужой",
                "Человек невидимка",
                "Крепкий орешек",
                "Багровые реки"
        };
        String[] actual = poster.getPoster();

        Assertions.assertArrayEquals(expected, actual);
    }

}
