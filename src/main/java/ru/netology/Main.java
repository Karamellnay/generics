package ru.netology;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Ticket ticket1 = new Ticket(
                "Москва",
                "Тайланд",
                20_000,
                14,
                18
        );
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

        System.out.println(ticket1.compareTo(ticket2));
        System.out.println(ticket2.compareTo(ticket1));
        System.out.println(ticket3.compareTo(ticket1));
        System.out.println(ticket3.compareTo(ticket2));
        Ticket[] tickets = {ticket1, ticket2, ticket3};
        Arrays.sort(tickets);
    }
}
