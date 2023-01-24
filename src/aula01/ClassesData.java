package aula01;

import java.time.*;

    public class ClassesData {

        public static void main(String[] args) {
            //Quando falamos de data no Java, eh importante saber que categoria de informações
            // vamos representar com elas

            //Se quisermos representar a data do aniversário de alguem
            LocalDate hoje = LocalDate.now();

            //O horario de um encontro
            LocalTime agora = LocalTime.now();

            //A data e o horario de um evento dentro do nosso fuso horario
            LocalDateTime dataEHora = LocalDateTime.now();

            System.out.println(hoje);
            System.out.println(agora);
            System.out.println(dataEHora);


            //criando localdate
            LocalDate data = LocalDate.of(2010, Month.JANUARY, 12);
            //Nas datas, os meses podem ser representado a partir de 1 até 12, então 1 representa Janeiro e 12 representa Dezembro
            LocalDate data2 = LocalDate.of(2010, 1, 12);
            //Se colocar 0 vai lancar uma java.time.DateTimeException: Invalid value for MonthOfYear (valid values 1 - 12): 0
            LocalDate data3 = LocalDate.of(2010, 0, 12);

            //Criando LocalTime
            LocalTime timeHorasMinutos = LocalTime.of(5, 3);//horas(0 -24) e minutos(0-59)
            LocalTime timeHorasMinutosSegundos = LocalTime.of(6, 15, 30);////horas(0 -24) e minutos(0-59) e segundos(0-59)
            LocalTime timeNanos = LocalTime.of(6, 13, 34, 3343);

            //Criado LocalDateTime

            //O LocalDateTime é uma combinacao de LocalDate e Time
            LocalDateTime localDateTime = LocalDateTime.of(data, timeNanos);
            //Eh possivel criar o LocalDateTime de forma manual, porem nao e muito pratico.
            LocalDateTime localDateTime1 = LocalDateTime.of(2000, 02, 2, 23, 59, 59);

        }
    }
