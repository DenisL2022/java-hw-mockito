package ru.netology.statistic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.Assert.assertEquals;

class FilmManagerTest {

    FilmManager manager;

    @BeforeEach
     void setUp(){
        manager = new FilmManager();
        manager.add(new Film("test","test"));
    }

    @Test
     void add() {
        manager.add(new Film("test","test"));
        assertEquals(2,  manager.findAll().length);
    }

    @Test
    public void findAll() {


    }

    @Test
    public void findLast() {
        manager = new FilmManager(5);
        assertEquals(0,  manager.findLast().length);
        for (int i = 0; i < 100; i++){
            manager.add(new Film("test","test"));
        }
        assertEquals(5,  manager.findLast().length);

    }
}