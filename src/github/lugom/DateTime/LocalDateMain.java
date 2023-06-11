package github.lugom.DateTime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateMain {
    public static void main(String[] args)
    {

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate date = LocalDate.now();
        LocalDateTime dateTime = LocalDateTime.now();
        Instant instant = Instant.now();

        LocalDate dateParse = LocalDate.parse("2023-06-10");
        LocalDateTime dateTimeParse = LocalDateTime.parse("2023-06-10T23:32:00");
        Instant instantParse = Instant.parse("2023-06-10T23:32:00.00-03:00");

        LocalDate dateParseFormatter = LocalDate.parse("10/06/2023",dateTimeFormatter);
        LocalDateTime dateTimeParseFormatter = LocalDateTime.parse("2023-06-10T23:32:00", dateTimeFormatter);

        LocalDate dateOf = LocalDate.of(2023, 06, 10);

        System.out.println("-=+=-");
        System.out.println("LocalDate: " + date);
        System.out.println("LocalDateTime: " + dateTime);
        System.out.println("Instant: " + instant);
        System.out.println("-=+=-");
        System.out.println("LocalDateParse: " + dateParse);
        System.out.println("LocalDateTimeParse: " + dateTimeParse);
        System.out.println("InstantParse: " + instantParse);
        System.out.println("-=+=-");
        System.out.println("LocalDateParseFormatter: " + dateParseFormatter);
        System.out.println("LocalDateParseFormatter: " + dateTimeParseFormatter);
        System.out.println("-=+=-");
        System.out.println("LocalDateOf: " + dateOf);

    }
}