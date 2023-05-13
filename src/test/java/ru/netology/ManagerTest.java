package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.PosterItem;

public class ManagerTest {
    PosterItem item1 = new PosterItem("Бладшот", "боевик");
    PosterItem item2 = new PosterItem("Вперёд", "мультфильм");
    PosterItem item3 = new PosterItem("Отель 'Белград'", "комедия");
    PosterItem item4 = new PosterItem("Джентельмены", "боевик");
    PosterItem item5 = new PosterItem("Человек-невидимка", "ужасы");
    PosterItem item6 = new PosterItem("Тролли. Мировой тур", "мультфильм");
    PosterItem item7 = new PosterItem("Номер один", "комедия");

    Manager manager = new Manager();

    @Test
    public void test() {
        Manager manager = new Manager();
        manager.addFilm(item1);
        manager.addFilm(item2);
        manager.addFilm(item3);

        PosterItem[] expected = {item1, item2, item3};
        PosterItem[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
}




