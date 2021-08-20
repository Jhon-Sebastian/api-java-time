package org.sebas.datetime.ejemplos;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class EjemploLocalDate {
    public static void main(String[] args) {

        /*
            TODO: LocalDate [Fecha actual]
            Podemos obtener la fecha actual o una fecha futura, o convertir un String
            a un LocalDate, E

            - El formato siempre debe ser {año,mes,dia}
         */

        //Fecha actual
        LocalDate fechaActual = LocalDate.now();
        System.out.println("fechaActual = " + fechaActual);
        System.out.println("Dia: " + fechaActual.getDayOfMonth());

        Month mes = fechaActual.getMonth();

        System.out.println("Mes: " + mes);
        System.out.println("Numero del mes: " + mes.getValue());
        System.out.println("Mes en español: " + mes.getDisplayName(TextStyle.FULL
                ,new Locale("es","ES")));

        DayOfWeek diaSemana = fechaActual.getDayOfWeek();

        System.out.println("Dia de la semana: " + diaSemana.getDisplayName(TextStyle.FULL
                , new Locale("es","ES")));
        System.out.println("Año: " + fechaActual.getYear());
        System.out.println("Dia del año: " + fechaActual.getDayOfYear());
        System.out.println("Era: " + fechaActual.getEra());

        //Fecha en especifico
        fechaActual = LocalDate.of(2021,12,24);
        System.out.println("fechaActual = " + fechaActual);

        //Fecha en especifico usando enums
        fechaActual = LocalDate.of(2020, Month.AUGUST,14);
        System.out.println("fechaActual = " + fechaActual);

        //Fecha en especifico atraves de un String
        fechaActual = LocalDate.parse("2018-02-18");
        System.out.println("fechaActual = " + fechaActual);



        /*
            TODO: Flexibilidad y nueva funcionalidades de fechas con now().
            plus -> Agrega
            minus -> Resta
            plusUnidadDeTiempo -> Agrega
            minusUnidadDeTiempo -> Resta

            Con esto es mucho mas facil acceder a una fecha con mayor
            facilidad
         */

        // plusDays() -> sumar dias
        LocalDate diaDeManiana = LocalDate.now().plusDays(1);
        System.out.println("\nDia de mañana = " + diaDeManiana);

        diaDeManiana = LocalDate.now().minusYears(1);
        System.out.println("Año anterior = " + diaDeManiana);

        //Se puede llamar el metodo minus o plus, y luego indicando la unidad de tiempo
        diaDeManiana = LocalDate.now().minus(1, ChronoUnit.MONTHS);
        System.out.println("Mes anterior = " + diaDeManiana);

        diaDeManiana = LocalDate.now().minusMonths(2);
        System.out.println("2 meses atras = " + diaDeManiana);

        diaDeManiana = LocalDate.now().plusDays(10).plusWeeks(1).plusMonths(10).plusYears(10);
        System.out.println("Mas 10 dias + 1 semana + 10 meses + 10 años = " + diaDeManiana);




        /*
            TODO: Obtener el dia del semana,mes,año
            DayOfWeek -> Dia de la semana
            int -> Dia del mes
         */

        DayOfWeek dayOfWeek = LocalDate.parse("2017-08-11").getDayOfWeek();
        System.out.println("\ndayOfWeek = " + dayOfWeek);

        int dayOfMonth = LocalDate.of(2017, 8, 11).getDayOfMonth();
        System.out.println("dayOfMonth = " + dayOfMonth);
        
        int dayOfYear = LocalDate.of(2017, Month.AUGUST, 11).getDayOfYear();
        System.out.println("dayOfYear = " + dayOfYear);

        //Saber si el año es biciesto o no
        boolean esBiciesto = LocalDate.now().isLeapYear();
        System.out.println("esBiciesto = " + esBiciesto);



        /*
            TODO: Comparar fechas
         */
        boolean esAntes = LocalDate.of(2021,8,15).isBefore(LocalDate.parse("2021-08-14"));
        System.out.println("\nesAntes = " + esAntes);

        boolean esDespues = LocalDate.of(2020,11,11).isAfter(LocalDate.parse("2020-11-10"));
        System.out.println("esDespues = " + esDespues);

    }
}
