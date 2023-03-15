package ru.netology.posters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerAddTest {

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

    @Test
    public void shouldAddAllMovies() {

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
        manager.add(movie11);

        ShowPoster[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9, movie10, movie11};
        ShowPoster[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

}
