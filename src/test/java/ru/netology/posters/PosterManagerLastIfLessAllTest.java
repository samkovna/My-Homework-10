package ru.netology.posters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PosterManagerLastIfLessAllTest {

    ShowPoster movie1 = new ShowPoster(7, "Бладшот", "боевик");
    ShowPoster movie2 = new ShowPoster(102, "Вперёд", "мультфильм");
    ShowPoster movie3 = new ShowPoster(56, "Отель \"Белград\"", "комедия");
    ShowPoster movie4 = new ShowPoster(37, "Джентельмены", "боевик");
    ShowPoster movie5 = new ShowPoster(83, "Человек-невидимка", "ужасы");
    ShowPoster movie6 = new ShowPoster(115, "Тролли. Мировой тур", "мультфильм");
    ShowPoster movie7 = new ShowPoster(33, "Номер один", "комедия");
    ShowPoster movie8 = new ShowPoster(48, "Нюрнберг", "драма");
    ShowPoster movie9 = new ShowPoster(2, "Чебурашка", "комедия");
    ShowPoster movie10 = new ShowPoster(90, "Дети кукурузы", "ужасы");
    ShowPoster movie11 = new ShowPoster(64, "Аватар 2", "научная фантастика");



    @BeforeEach
    public void setup() {

    }
    @Test
    public void shouldShowReversedLastMoviesDefault() {
        PosterManager manager = new PosterManager();

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);
        manager.add(movie10);

        ShowPoster[] expected = {movie10, movie9, movie8, movie7, movie6};
        ShowPoster[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowReversedLastMoviesParam() {
        PosterManager manager = new PosterManager(8);

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);
        manager.add(movie10);

        ShowPoster[] expected = {movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3};
        ShowPoster[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

}
