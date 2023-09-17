package ru.netology.poster;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {

    @Test
    public void addFilmTest() {
        PosterManager poster = new PosterManager();
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
        poster.findAll();

        String[] expected = new String[]{
                "Бладшот",
                "Бэтмен",
                "Багровые реки",
        };
        String[] actual = poster.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findAllWithParameterOverLimitTest() {
        PosterManager poster = new PosterManager(25);
        poster.findAll();

        String[] expected = new String[]{
                "Бладшот",
                "Бэтмен",
                "Багровые реки",
                "Крепкий орешек",
                "Человек невидимка",
                "Чужой",
                "Голодные игры"
        };
        String[] actual = poster.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findAllDefaultQuantytiTest() {
        PosterManager poster = new PosterManager();
        poster.findAll();

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
        String[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastWithParameterOverLimitTest() {
        PosterManager poster = new PosterManager(25);
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
        String[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastDefaultQuantytiTest() {
        PosterManager poster = new PosterManager();
        poster.findLast();

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
