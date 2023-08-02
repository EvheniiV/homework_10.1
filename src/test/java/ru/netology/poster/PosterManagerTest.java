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
    public String[] testArrayAdd = new String[]{
            "Бладшот",
            "Бэтмен",
            "Багровые реки",
            "Крепкий орешек",
            "Человек невидимка",
            "Чужой",
            "Голодные игры",
            "Карамора"
    };

    public String[] testArrayFindAllThree = new String[]{
            "Бладшот",
            "Бэтмен",
            "Багровые реки",
    };

    public String[] testArrayFindLastSeven = new String[]{
            "Голодные игры",
            "Чужой",
            "Человек невидимка",
            "Крепкий орешек",
            "Багровые реки",
            "Бэтмен",
            "Бладшот"
    };
    public String[] testArrayFindLastDefault = new String[]{
            "Голодные игры",
            "Чужой",
            "Человек невидимка",
            "Крепкий орешек",
            "Багровые реки"
    };

    @Test
    public void SetPosterTest() {
        PosterManager poster = new PosterManager();
        poster.setPoster(testArray);

        String[] expected = testArray;
        String[] actual = poster.getPoster();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void AddFilmTest() {
        PosterManager poster = new PosterManager();
        poster.setPoster(testArray);
        poster.AddFilm("Карамора");

        String[] expected = testArrayAdd;
        String[] actual = poster.getPoster();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void FindAllTest() {
        PosterManager poster = new PosterManager(3);
        poster.setPoster(testArray);
        poster.FindAll();

        String[] expected = testArrayFindAllThree;
        String[] actual = poster.getPoster();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void FindLastTest() {
        PosterManager poster = new PosterManager(7);
        poster.setPoster(testArray);
        poster.FindLast();

        String[] expected = testArrayFindLastSeven;
        String[] actual = poster.getPoster();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void FindLastDefaultQuantytiTest() {
        PosterManager poster = new PosterManager();
        poster.setPoster(testArray);
        poster.FindLast();

        String[] expected = testArrayFindLastDefault;
        String[] actual = poster.getPoster();

        Assertions.assertArrayEquals(expected, actual);
    }
}
