package ru.netology.posters;

public class ShowPoster {
        private int id;
        private String movieName;
        private String genreMovie;

        public ShowPoster(int id, String movieName, String genreMovie) {
            this.id = id;
            this.movieName = movieName;
            this.genreMovie = genreMovie;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getMovieName() {
            return movieName;
        }

        public void setMovieName(String movieName) {
            this.movieName = movieName;
        }

        public String getGenreMovie() {
            return genreMovie;
        }

        public void setGenreMovie(String genreMovie) {
            this.genreMovie = genreMovie;
        }
}
