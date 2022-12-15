package ru.netology.statistic;

import java.util.ArrayList;

public class FilmManager {

    private ArrayList<Film> films = new ArrayList<>();

    private int filmCount;

    public FilmManager(int filmCount) {
        this.filmCount = filmCount;
    }

    public FilmManager() {
        filmCount = 10;
    }

    public void add(Film film){
        films.add(0,film);

    }

    public Film[] findAll(){
        int resultLength = films.size();
        Film[] result = new Film[resultLength];
        for (int i = 0; i < films.size(); i++){
            result[i] = films.get(i);
        }
        return result;
    }

    public Film[] findLast(){
        int resultLength;
        Film[] result;
        if (films.size() < filmCount) {
            resultLength = films.size();
        }
        else{
            resultLength = filmCount;
        }
        result = new Film[resultLength];
        for (int i = 0; i < resultLength; i++){
            result[i] = films.get(i);
        }

        return result;
    }


}
