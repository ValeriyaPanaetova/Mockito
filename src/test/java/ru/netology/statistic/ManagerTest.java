package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {
    @Test
    public void testFindAll() {
        Manager manager = new Manager();
        String movie1 = "Властелин колец 1";
        String movie2 = "Властелин колец 2";
        String movie3 = "Властелин колец 3";
        String movie4 = "Властелин колец 4";
        String movie5 = "Властелин колец 5";
        String movie6 = "Властелин колец 6";


        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        ;
        String[] actual = manager.findAll();
        String[] expected = {movie1, movie2, movie3, movie4, movie5, movie6};
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testFindLastWhenLimitSize() {
        Manager manager = new Manager();
        String movie1 = "Властелин колец 1";
        String movie2 = "Властелин колец 2";
        String movie3 = "Властелин колец 3";
        String movie4 = "Властелин колец 4";
        String movie5 = "Властелин колец 5";


        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);

        String[] actual = manager.findLast();
        String[] expected = {movie5, movie4, movie3, movie2, movie1};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testFindLastWhenLimitLessSize() {
        Manager manager = new Manager();
        String movie1 = "Властелин колец 1";
        String movie2 = "Властелин колец 2";
        String movie3 = "Властелин колец 3";
        String movie4 = "Властелин колец 4";
        String movie5 = "Властелин колец 5";
        String movie6 = "Властелин колец 6";


        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);

        String[] actual = manager.findLast();
        String[] expected = {movie6, movie5, movie4, movie3, movie2};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testFindLastWhenLimitMoreSize() {
        Manager manager = new Manager();
        String movie1 = "Властелин колец 1";
        String movie2 = "Властелин колец 2";
        String movie3 = "Властелин колец 3";


        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);

        String[] actual = manager.findLast();
        String[] expected = {movie3, movie2, movie1};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testFindLastWhenLimitSizeCustomLimit() {
        Manager manager = new Manager(3);
        String movie1 = "Властелин колец 1";
        String movie2 = "Властелин колец 2";
        String movie3 = "Властелин колец 3";
        String movie4 = "Властелин колец 4";
        String movie5 = "Властелин колец 5";


        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);

        String[] actual = manager.findLast();
        String[] expected = {movie3, movie2, movie1};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testFindLastWhenLimitLessSizeCustomLimit() {
        Manager manager = new Manager(3);
        String movie1 = "Властелин колец 1";
        String movie2 = "Властелин колец 2";
        String movie3 = "Властелин колец 3";
        String movie4 = "Властелин колец 4";
        String movie5 = "Властелин колец 5";
        String movie6 = "Властелин колец 6";



        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);


        String[] actual = manager.findLast();
        String[] expected = {movie6, movie5, movie4};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testFindLastWhenLimitMoreSizeCustomLimit() {
        Manager manager = new Manager(7);
        String movie1 = "Властелин колец 1";
        String movie2 = "Властелин колец 2";
        String movie3 = "Властелин колец 3";
        String movie4 = "Властелин колец 4";
        String movie5 = "Властелин колец 5";
        String movie6 = "Властелин колец 6";



        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);

        String[] actual = manager.findLast();
        String[] expected = {movie5, movie4, movie3, movie2, movie1};

        Assertions.assertArrayEquals(expected, actual);

    }
}