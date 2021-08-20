package org.sebas.datetime.ejemplos;

import java.time.Duration;
import java.time.LocalDateTime;

public class EjemploDuration {
    public static void main(String[] args) {

        /*
            TODO: Duration
            Periodo de tiempo en horas-minutos-segundos
            y otra
         */

        LocalDateTime fecha1 = LocalDateTime.now();
        LocalDateTime fecha2 = LocalDateTime.now().plusHours(3).plusMinutes(20).plusDays(1);
        Duration lapsusTiempo = Duration.between(fecha1,fecha2);
        System.out.println("lapsusTiempo = " + lapsusTiempo);
        System.out.println("Lapsus en segundos = " + lapsusTiempo.getSeconds());
        System.out.println("Lapsus en Dias = " + lapsusTiempo.toDays());
        System.out.println("Lapsus en Horas = " + lapsusTiempo.toHours());
        System.out.println("Lapsus en Minutos = " + lapsusTiempo.toMinutes());

    }
}
