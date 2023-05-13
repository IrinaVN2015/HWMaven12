package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ManagerReversedTest {
    Manager manager = new Manager();
    Manager manager1 = new Manager(3);
    PosterItem item1 = new PosterItem("Бладшот", "боевик");
    PosterItem item2 = new PosterItem("Вперёд", "мультфильм");
    PosterItem item3 = new PosterItem("Отель 'Белград'", "комедия");
    PosterItem item4 = new PosterItem("Джентельмены", "боевик");
    PosterItem item5 = new PosterItem("Человек-невидимка", "ужасы");
    PosterItem item6 = new PosterItem("Тролли. Мировой тур", "мультфильм");
    PosterItem item7 = new PosterItem("Номер один", "комедия");

    /*@BeforeEach
    public void setup() {
        manager.addFilm(item1);
        manager.addFilm(item2);
        manager.addFilm(item3);
        manager.addFilm(item4);
        manager.addFilm(item5);
        manager.addFilm(item6);
        manager.addFilm(item7);
    }*/

    @Test
    public void shouldSetLimitBelowLimit() {
        manager.addFilm(item1);
        manager.addFilm(item2);
        manager.addFilm(item3);
        manager.addFilm(item4);
        manager.addFilm(item5);
        manager.addFilm(item6);
        manager.addFilm(item7);

        manager.setLimit(-1);
        PosterItem[] expected = {item1, item2, item3, item4, item5, item6, item7};
        PosterItem[] actual = manager.getItems();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSetNewLimitAboveLimit() {
        manager.addFilm(item1);
        manager.addFilm(item2);
        manager.addFilm(item3);
        manager.addFilm(item4);
        manager.addFilm(item5);
        manager.addFilm(item6);
        manager.addFilm(item7);

        manager.setLimit(8);
        PosterItem[] expected = {item1, item2, item3, item4, item5, item6, item7};
        PosterItem[] actual = manager.getItems();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSetNewLimitMiddle() {
        manager.addFilm(item1);
        manager.addFilm(item2);
        manager.addFilm(item3);
        manager.addFilm(item4);
        manager.addFilm(item5);
        manager.addFilm(item6);
        manager.addFilm(item7);

        manager.setLimit(6);
        PosterItem[] expected = {item1, item2, item3, item4, item5, item6, item7};
        PosterItem[] actual = manager.getItems();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastArrayAboveLimit() {
        manager.addFilm(item1);
        manager.addFilm(item2);
        manager.addFilm(item3);
        manager.addFilm(item4);
        manager.addFilm(item5);
        manager.addFilm(item6);
        manager.addFilm(item7);

        PosterItem[] expected = {item7, item6, item5, item4, item3};
        PosterItem[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastArrayEqualToLimit() {
        manager.addFilm(item1);
        manager.addFilm(item2);
        manager.addFilm(item3);
        manager.addFilm(item4);
        manager.addFilm(item5);

        PosterItem[] expected = {item5, item4, item3, item2, item1};
        PosterItem[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastArrayBelowLimit() {
        manager.addFilm(item1);
        manager.addFilm(item2);
        manager.addFilm(item3);
        manager.addFilm(item4);

        PosterItem[] expected = {item4, item3, item2, item1};
        PosterItem[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastArrayEqualToLimit3() {

        manager1.addFilm(item1);
        manager1.addFilm(item2);
        manager1.addFilm(item3);
        manager1.addFilm(item4);
        manager1.addFilm(item5);

        manager1.setLimit(3);
        PosterItem[] expected = {item5, item4, item3};
        PosterItem[] actual = manager1.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindLastArrayEqualToLimit1() {

        manager1.addFilm(item1);
        manager1.addFilm(item2);
        manager1.addFilm(item3);
        manager1.addFilm(item4);
        manager1.addFilm(item5);

        manager1.setLimit(-1);
        PosterItem[] expected = {item5, item4, item3};
        PosterItem[] actual = manager1.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastArrayEqualToLimit6() {

        manager1.addFilm(item1);
        manager1.addFilm(item2);
        manager1.addFilm(item3);
        manager1.addFilm(item4);
        manager1.addFilm(item5);

        manager1.setLimit(6);
        PosterItem[] expected = {item5, item4, item3};
        PosterItem[] actual = manager1.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }
}
