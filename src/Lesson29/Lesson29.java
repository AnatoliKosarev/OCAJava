package Lesson29;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Lesson29 {
    static DateTimeFormatter f1 = DateTimeFormatter.ofPattern("YYYY, MMMM-dd !! hh:mm");
    static DateTimeFormatter f2 = DateTimeFormatter.ofPattern("hh:mm, dd/MMM/YY");

    public static void smena(LocalDateTime ldt1, LocalDateTime ldt2, Period p, Duration d) {
        while (ldt1.isBefore(ldt2)) {
            System.out.println("Работаем с: " + ldt1.format(f1));

            ldt1 = ldt1.plus(p);
            System.out.println("До: " + ldt1.format(f1));

            System.out.println("Отдыхаем с: " + ldt1.format(f2));

            ldt1 = ldt1.plus(d);
            System.out.println("До: " + ldt1.format(f2));

            System.out.println();
        }
    }

    public static void main(String[] args) {
        LocalDateTime ldt1 = LocalDateTime.of(2016, 01, 01, 9, 0);
        LocalDateTime ldt2 = LocalDateTime.of(2016, 02, 3, 9, 0);
        Period p = Period.ofDays(15);
        Duration d= Duration.ofHours(5);

        smena(ldt1, ldt2, p, d);
    }
}

