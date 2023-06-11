package github.lugom.DateTime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateMain {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalDateTime dateTime = LocalDateTime.now();
        Instant instant = Instant.now();

        System.out.println("LocalDate: " + date);
        System.out.println("LocalDateTime: " + dateTime);
        System.out.println("Instant: " + instant);
    }
}