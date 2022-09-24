package io.codelex.classesandobjects.practice.movie;

public class MovieTest {
    public static void main(String[] args) {
        Movie film = new Movie("Casino Royale", "Eon Productions", "PG13");
        Movie film2 = new Movie("Glass", "Buena Vista International", "PG13");
        Movie film3 = new Movie("pider-Man: Into the Spider-Verse", "Columbia Pictures", "PG");

        Movie[] array = {film, film2, film3};

        System.out.println(film.getPG(array));


    }
}
