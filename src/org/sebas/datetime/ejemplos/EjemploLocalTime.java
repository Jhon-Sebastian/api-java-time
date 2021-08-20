package org.sebas.datetime.ejemplos;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class EjemploLocalTime {
    public static void main(String[] args) {

        /*
            TODO: LocalTime [Hora actual]
            Podemos obtener la hora actual o una hora futura, o convertir un String
            a un LocalTime,

            - El formato siempre debe ser {Hora,Minuto,Segundo,NanoSegundo}
         */

        LocalTime ahora = LocalTime.now();
        System.out.println("ahora = " + ahora);
        System.out.println("Hora = " + ahora.getHour());
        System.out.println("Minuto = " + ahora.getMinute());
        System.out.println("Segundo = " + ahora.getSecond());

        LocalTime seisConTreinta = LocalTime.of(6,30);
        System.out.println("seisConTreinta = " + seisConTreinta);

        //Desde un String crear la hora, esta hora es la mañana
        seisConTreinta = LocalTime.parse("06:30");
        System.out.println("seisConTreinta = " + seisConTreinta);

        //Tambien funciona el plus
        LocalTime sieteConTreinta = LocalTime.of(6,30).plus(1, ChronoUnit.HOURS);
        System.out.println("sieteConTreinta = " + sieteConTreinta);

        boolean esAnterior = LocalTime.of(6,30).isBefore(LocalTime.parse("07:30"));
        System.out.println("esAnterior = " + esAnterior);



        /*
            TODO: Formatear Fechas y Horas con [DateTimeFormatter]
            Se aplica a LocalDate y LocalTime

            HH: Formato 24 horas
            hh: Formato a.m, p.m
            MM: Mes
            mm: Minutos
            ss: Segundos

            a -> AM o PM

         */
        DateTimeFormatter df = DateTimeFormatter.ofPattern("hh:mm:ss a");
        
        //(1) Forma de formatear
        String ahoraFormateado = ahora.format(df);
        System.out.println("\nahoraFormateado = " + ahoraFormateado);
        String seisTreintaFormateado = seisConTreinta.format(df);
        System.out.println("seisTreintaFormateado = " + seisTreintaFormateado);

        //(2) Forma de formatear
        seisTreintaFormateado = df.format(seisConTreinta);
        System.out.println("seisTreintaFormateado = " + seisTreintaFormateado);



        /*
            TODO: Hora max y minima de un dia
         */
        LocalTime horaMax = LocalTime.MAX;
        LocalTime horaMin = LocalTime.MIN;

        System.out.println("\nhoraMax = " + horaMax);
        System.out.println("horaMin = " + horaMin);


    }
}
