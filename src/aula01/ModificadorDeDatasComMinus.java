package aula01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class ModificadorDeDatasComMinus {

    public static void main(String[] args) {
        LocalDate data = LocalDate.of(2014, Month.JANUARY, 20);
        System.out.println(data);

        data = data.minusDays(1);

        System.out.println(data);

        LocalTime hora = LocalTime.of(20, 24);

        hora = hora.minusHours(2);
        System.out.println(hora);

        LocalDateTime dataHora = LocalDateTime.of(data, hora);
        dataHora = dataHora.minusHours(22);
        System.out.println(dataHora);


    }
}

