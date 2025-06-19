package Aprendizado;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {
        DateTimeFormatter ftm1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter ftm2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter ftm3 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm").withZone(ZoneId.systemDefault());

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2025-06-18");
        LocalDateTime d05 = LocalDateTime.parse("2025-06-18T09:44:50");
        Instant d06 = Instant.parse("2025-06-18T09:44:50Z");

        LocalDate d07 = LocalDate.parse("18/06/2025", ftm1);
        LocalDateTime d08 = LocalDateTime.parse("18/06/2025 10:23", ftm2);
        LocalDate d09 = LocalDate.of(2025, 6, 18);
        LocalDateTime d10 = LocalDateTime.of(2025, 6, 18, 1, 30);
        Instant d11 = Instant.parse("2025-06-18T01:30:00Z");  // O formato ISO padrão de um Instant precisa conter hora, minutos e segundos obrigatoriamente.

        System.out.println("D01: " + d01.format(ftm1));
        System.out.println("D02: " + d02.format(ftm2));
        System.out.println("D03: " + d03);
        System.out.println("D04: " + d04.format(ftm1));
        System.out.println("D05: " + d05.format(ftm2));
        System.out.println("D06: " + d06);
        System.out.println("D07: " + d07.format(ftm1));
        System.out.println("D08: " + d08.format(ftm2));
        System.out.println("D09: " + d09.format(ftm1));
        System.out.println("D10: " + d10.format(ftm2));
        System.out.println("D11: " + ftm3.format(d11));
    }
}

