package ru.netology.posters;

public class PosterManager {
    private ShowPoster[] movies = new ShowPoster[0];

    public void add(ShowPoster movie) {
        ShowPoster[] tmp = new ShowPoster[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public ShowPoster[] findAll() {
        return movies;
    }

    public int lastMoviesLength;

    public PosterManager() {
        this.lastMoviesLength = 5;
    }

    public PosterManager(int size) {
        this.lastMoviesLength = size;
    }

    public ShowPoster[] findLast() {

        int resultLength;
        if (lastMoviesLength <= movies.length) {
            resultLength = lastMoviesLength;
        } else {
            resultLength = movies.length;
        }

        ShowPoster[] reversedLastMovies = new ShowPoster[resultLength];
        for (int i = 0; i < reversedLastMovies.length; i++) {
            reversedLastMovies[i] = movies[movies.length - 1 - i];
        }
        return reversedLastMovies;
    }

}
