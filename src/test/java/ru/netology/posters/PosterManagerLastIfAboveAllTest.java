package ru.netology.posters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PosterManagerLastIfAboveAllTest {

    ShowPoster movie1 = new ShowPoster(7, "Бладшот", "боевик");
    ShowPoster movie2 = new ShowPoster(102, "Вперёд", "мультфильм");
    ShowPoster movie3 = new ShowPoster(56, "Отель \"Белград\"", "комедия");

    @Test
    public void shouldShowReversedLastMoviesDefault() {

        PosterManager manager = new PosterManager();

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);

        ShowPoster[] expected = {movie3, movie2, movie1};
        ShowPoster[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldShowReversedLastMoviesParam() {

        PosterManager manager = new PosterManager(8);

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);

        ShowPoster[] expected = {movie3, movie2, movie1};
        ShowPoster[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }
}
