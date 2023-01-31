package aula02;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;

public class PeriodPractice {

    public static void main(String[] args) {
        Period doisAnos = Period.ofYears(2);
        Period umDia = Period.ofDays(1);
        Period tresMeses = Period.ofMonths(3);
        Period duasSemanas = Period.ofWeeks(2);
        System.out.println(doisAnos);
        System.out.println(umDia);
        System.out.println(tresMeses);
        System.out.println(duasSemanas);

        LocalDate hoje = LocalDate.now();
        System.out.println(hoje.plus(doisAnos));
        System.out.println(hoje.plus(umDia));
        System.out.println(hoje.plus(tresMeses));
        System.out.println(hoje.plus(duasSemanas));

        LocalDate now = LocalDate.now(ZoneId.of(ZoneId.SHORT_IDS.get("BET")));

        System.out.println(now.getDayOfWeek());


    }
}
