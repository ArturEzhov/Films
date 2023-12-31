package ru.netology.Films;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class FilmsManagerTest {
    @Test
    public void FilmsThree() {
        FilmsManager manager = new FilmsManager();
        manager.add("Movie I");
        manager.add("Movie II");
        manager.add("Movie III");

        String[] actual = manager.findAll();
        String[] expected = {"Movie I", "Movie II", "Movie III"};
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void FilmsZero() {
        FilmsManager manager = new FilmsManager();

        String[] actual = manager.findAll();
        String[] expected = {};
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void FilmsOne() {
        FilmsManager manager = new FilmsManager();
        manager.add("Movie I");


        String[] actual = manager.findAll();
        String[] expected = {"Movie I"};
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void FilmsLastThree() {
        FilmsManager manager = new FilmsManager();
        manager.add("Movie I");
        manager.add("Movie II");
        manager.add("Movie III");

        String[] actual = manager.findLast();
        String[] expected = {"Movie III", "Movie II", "Movie I"};
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void FilmsLastFive() {
        FilmsManager manager = new FilmsManager();
        manager.add("Movie I");
        manager.add("Movie II");
        manager.add("Movie III");
        manager.add("Movie IV");
        manager.add("Movie V");

        String[] actual = manager.findLast();
        String[] expected = {"Movie V", "Movie IV", "Movie III", "Movie II", "Movie I"};
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void FilmsLastSix() {
        FilmsManager manager = new FilmsManager();
        manager.add("Movie I");
        manager.add("Movie II");
        manager.add("Movie III");
        manager.add("Movie IV");
        manager.add("Movie V");
        manager.add("Movie VI");

        String[] actual = manager.findLast();
        String[] expected = {"Movie VI", "Movie V", "Movie IV", "Movie III", "Movie II"};
        Assertions.assertArrayEquals(expected, actual);

    }


}