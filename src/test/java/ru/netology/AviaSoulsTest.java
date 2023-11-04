package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

public class AviaSoulsTest {
    @Test
    public void searchTicket() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket(
                "Москва",
                "Тайланд",
                20_000,
                14,
                18);
        Ticket ticket2 = new Ticket(
                "Тайланд",
                "Бали",
                50_000,
                19,
                21
        );
        Ticket ticket3 = new Ticket(
                "Бали",
                "Мальдивы",
                35_000,
                10,
                11
        );
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);

        Ticket[] tickets = {ticket1, ticket2, ticket3};

        Ticket[] expected = {ticket1};
        Ticket[] actual = manager.search("Москва", "Тайланд");
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void searchNegativeTicket() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket(
                "Москва",
                "Тайланд",
                20_000,
                14,
                18);
        Ticket ticket2 = new Ticket(
                "Тайланд",
                "Бали",
                50_000,
                19,
                21
        );
        Ticket ticket3 = new Ticket(
                "Бали",
                "Мальдивы",
                35_000,
                10,
                11
        );
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);

        Ticket[] tickets = {ticket1, ticket2, ticket3};

        Ticket[] expected = {};
        Ticket[] actual = manager.search("Казань", "Волгоград");
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void searchManyTicket() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket(
                "Москва",
                "Тайланд",
                20_000,
                14,
                18);
        Ticket ticket2 = new Ticket(
                "Тайланд",
                "Бали",
                50_000,
                19,
                21
        );
        Ticket ticket3 = new Ticket(
                "Бали",
                "Мальдивы",
                35_000,
                10,
                11
        );
        Ticket ticket4 = new Ticket(
                "Москва",
                "Тайланд",
                44_000,
                9,
                12
        );
        Ticket ticket5 = new Ticket(
                "Москва",
                "Тайланд",
                27_000,
                17,
                22
        );
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);

        Ticket[] tickets = {ticket1, ticket2, ticket3, ticket4, ticket5};

        Ticket[] expected = {ticket1, ticket5, ticket4};
        Ticket[] actual = manager.search("Москва", "Тайланд");
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void searchTimeTicket() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket(
                "Москва",
                "Тайланд",
                20_000,
                14,
                18);
        Ticket ticket2 = new Ticket(
                "Тайланд",
                "Бали",
                50_000,
                19,
                21
        );
        Ticket ticket3 = new Ticket(
                "Бали",
                "Мальдивы",
                35_000,
                10,
                11
        );
        Ticket ticket4 = new Ticket(
                "Москва",
                "Тайланд",
                44_000,
                9,
                12
        );
        Ticket ticket5 = new Ticket(
                "Москва",
                "Тайланд",
                27_000,
                17,
                22
        );
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] tickets = {ticket1, ticket2, ticket3, ticket4, ticket5};

        Ticket[] expected = {ticket4, ticket1, ticket5};
        Ticket[] actual = manager.search("Москва", "Тайланд", comparator);
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void searchNegativeTimeTicket() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket(
                "Москва",
                "Тайланд",
                20_000,
                14,
                18);
        Ticket ticket2 = new Ticket(
                "Тайланд",
                "Бали",
                50_000,
                19,
                21
        );
        Ticket ticket3 = new Ticket(
                "Бали",
                "Мальдивы",
                35_000,
                10,
                11
        );
        Ticket ticket4 = new Ticket(
                "Москва",
                "Тайланд",
                44_000,
                9,
                12
        );
        Ticket ticket5 = new Ticket(
                "Москва",
                "Тайланд",
                27_000,
                17,
                22
        );
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] tickets = {ticket1, ticket2, ticket3, ticket4, ticket5};

        Ticket[] expected = {};
        Ticket[] actual = manager.search("Волгоград", "Казань", comparator);
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void searchTimeOneTicket() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket(
                "Москва",
                "Тайланд",
                20_000,
                14,
                18);
        Ticket ticket2 = new Ticket(
                "Тайланд",
                "Бали",
                50_000,
                19,
                21
        );
        Ticket ticket3 = new Ticket(
                "Бали",
                "Мальдивы",
                35_000,
                10,
                11
        );
        Ticket ticket4 = new Ticket(
                "Москва",
                "Тайланд",
                44_000,
                9,
                12
        );
        Ticket ticket5 = new Ticket(
                "Москва",
                "Тайланд",
                27_000,
                17,
                22
        );
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] tickets = {ticket1, ticket2, ticket3, ticket4, ticket5};

        Ticket[] expected = {ticket3};
        Ticket[] actual = manager.search("Бали", "Мальдивы", comparator);
        Assertions.assertArrayEquals(expected, actual);
    }
}
