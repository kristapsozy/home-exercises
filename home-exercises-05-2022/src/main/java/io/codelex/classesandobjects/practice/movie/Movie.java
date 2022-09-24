package io.codelex.classesandobjects.practice.movie;

import java.util.ArrayList;

public class Movie {
    String title;
    String studio;
    String rating = "PG";

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", studio='" + studio + '\'' +
                ", rating='" + rating + '\'' +
                '}';
    }

    public ArrayList getPG(Movie[] array) {
        ArrayList<Movie> newArray = new ArrayList<>();
        for (Movie film : array) {
            if (film.rating.equals("PG")) {
                newArray.add(film);
            }
        }
        return newArray;

    }
}
