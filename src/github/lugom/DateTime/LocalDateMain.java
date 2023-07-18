package github.lugom.DateTime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.function.Supplier;

public class LocalDateMain {
    public static void main(String[] args) throws InterruptedException {
        //Formatação da data/hora
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:ss:mm");
        DateTimeFormatter dateTimeFormatZone = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());
        DateTimeFormatter dateTimeFormatZone2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.of("GMT+10"));
        DateTimeFormatter dateTimeFormatZoneISO = DateTimeFormatter.ISO_DATE_TIME;

        //Pega a data/hora atual do computador
        LocalDate date = LocalDate.now();
        LocalDateTime dateTime = LocalDateTime.now();
        Instant instant = Instant.now();
        Supplier<LocalDateTime> lambdaTime = LocalDateTime::now; //atualiza o tempo usando Threads

        //O Parse serve para adicionar uma data/hora customizada
        LocalDate dateParse = LocalDate.parse("2023-07-18");
        LocalDateTime dateTimeParse = LocalDateTime.parse("2023-07-18T00:15:00");
        Instant instantParse = Instant.parse("2023-07-18T23:32:00.00-03:00");
        Instant instantParse2 = Instant.parse("2023-07-18T00:15:00Z");

        //Formata a hora para ISO reconhecendo o formato pelo DateTimeFormatter
        LocalDate dateParseFormatter = LocalDate.parse("10/06/2023",dateFormatter);
        LocalDateTime dateTimeParseFormatter = LocalDateTime.parse("10/06/2023 23:32", dateTimeFormatter);

        //Maneira simples de declarar a data
        LocalDate dateOf = LocalDate.of(2023, 6, 10);
        LocalDateTime Data = LocalDateTime.ofInstant(instantParse2, ZoneId.of("US/Pacific"));

        //Adiciona ou subtrai LocalDateTime
        LocalDateTime pastWeekLocalDateTime = dateTime.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = dateTime.plusDays(7);

        //Adiciona ou subtrai Instant
        Instant pastWeekInstant = instant.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = instant.plus(7, ChronoUnit.DAYS);

        //Diferença de duração entre data/hora
        Duration durationLocalDateTime = Duration.between(pastWeekLocalDateTime, nextWeekLocalDateTime);
        Duration durationInstant = Duration.between(pastWeekInstant, nextWeekInstant);

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
        System.out.println("-=+=-");
        System.out.println("DateTimeFormatter Atual: " + dateTimeFormat.format(dateTimeParse));
        System.out.println("DateTimeFormatter Londres: " + dateTimeFormatZone.format(instantParse2));
        System.out.println("DateTimeFormatter +10 horas: " + dateTimeFormatZone2.format(instantParse2));
        System.out.println("Convert Instant + US/Pacific: " + dateTimeFormatZone.format(Data));
        System.out.println("-=+=-");
        System.out.println("Minus: " + pastWeekLocalDateTime);
        System.out.println("Plus: " + nextWeekLocalDateTime);
        System.out.println("-=+=-");
        System.out.println("Duration LocalDateTime: " + durationLocalDateTime.toDays());
        System.out.println("Duration Instant: " + durationInstant.toDays());
        System.out.println("-=+=-");
        System.out.println("Lambda: " + lambdaTime.get());
        Thread.sleep(2000);
        System.out.println("Lambda: " + lambdaTime.get());

        //NamesZoneId();
    }

    private static void NamesZoneId()
    {
        for(String s : ZoneId.getAvailableZoneIds())
        {
            System.out.println(s);
        }
    }
}