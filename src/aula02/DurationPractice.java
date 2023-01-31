package aula02;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class DurationPractice {

    public static void main(String[] args) {

        Duration doisDias = Duration.ofDays(2);
        System.out.println(doisDias);
        Duration oitoHoras = Duration.ofHours(8);
        System.out.println(oitoHoras);

        Duration tresMinutos = Duration.ofMinutes(3);
        System.out.println(tresMinutos);
        Duration cincoSegundos = Duration.ofSeconds(5);
        System.out.println(cincoSegundos);

        LocalTime agora = LocalTime.now();
        System.out.println(agora.plus(doisDias));
        System.out.println(agora.plus(tresMinutos));
        System.out.println(agora.plus(cincoSegundos));

        Duration umaHora = Duration.of(1, ChronoUnit.HOURS);



    }
}
