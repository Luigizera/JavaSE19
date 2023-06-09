package github.lugom.DateTime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main
{
    public static void main(String[] args)
    {
        LocalDate date = LocalDate.now();
        LocalDateTime dateTime = LocalDateTime.now();
        Instant instant = Instant.now();

        System.out.println(date);
        System.out.println(dateTime);
        System.out.println(instant);
    }
}