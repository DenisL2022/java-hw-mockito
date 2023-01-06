package ru.netology.statistic;

public class FilmManager {

    private Film[] films;
    private int filmCount;
    private int currentCount = 0;

    public FilmManager(int filmCount) {
        films = new Film[0];
        this.filmCount = filmCount;
    }

    public FilmManager() {
        films = new Film[0];
        filmCount = 10;
    }

    public void add(Film film) {
        Film[] copy = new Film[++currentCount];
        copy[currentCount - 1] = film;
        for (int i = 0; i < currentCount - 1; i++) {
            copy[i] = films[i];
        }
        films = copy;

    }

    public Film[] findAll() {
        return films;
    }

    public Film[] findLast() {
        int resultLength;
        if (currentCount < filmCount) {
            resultLength = currentCount;
        } else {
            resultLength = filmCount;
        }
        Film[] result = new Film[resultLength];
        int startIndex = currentCount - resultLength - 1;
        int index = 0;
        for (int i = startIndex; i < currentCount - 1; i++) {
            result[index++] = films[i];
        }

        return result;
    }


}
