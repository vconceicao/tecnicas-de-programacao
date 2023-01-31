package aula02;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimePractice {

    public static void main(String[] args) {

        //Localdatetime + ZoneId
        ZonedDateTime dataComFusoHorario = ZonedDateTime.now();

        System.out.println(dataComFusoHorario);


        //Criacao de zoneId
        for (String zoneId : ZoneId.getAvailableZoneIds()) {
            System.out.println(zoneId);
        }
        ZoneId zona = ZoneId.of("Africa/Lagos");

        ZonedDateTime zonedDateTimeCombinado = ZonedDateTime.of(LocalDateTime.now(zona), zona);
        System.out.println(zonedDateTimeCombinado);

        System.out.println(dataComFusoHorario.withZoneSameInstant(zona));

        OffsetDateTime now = OffsetDateTime.now();
        System.out.println(now);




    }
}
