package org.sebas.datetime.ejemplos;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class EjemploLocalDateTime {
    public static void main(String[] args) {
        
        /*
            TODO: LocalDateTime
            Incluye la fecha y la hora

            Formato = año-mes-dia T hora:minuto:segundo.nanosegundo
            
            Cuando se modifica una fecha no modifica la orginal, si no
            regresa una nueva instancia
             
         */

        LocalDateTime fechaTiempo = LocalDateTime.now();
        System.out.println("fechaTiempo = " + fechaTiempo);
        
        fechaTiempo = LocalDateTime.of(2020, Month.DECEMBER,24,20,45,59);
        System.out.println("fechaTiempo = " + fechaTiempo);

        fechaTiempo = LocalDateTime.parse("2020-12-25T20:45:59.533133300");
        System.out.println("fechaTiempo = " + fechaTiempo);
        
        fechaTiempo = fechaTiempo.plusDays(10);
        System.out.println("fechaTiempo = " + fechaTiempo);

        /*
            TODO: LocalDateTime, posee los mismo metodos que = LocalDate, LocalTime
         */


        /*
            TODO: Formatos
            Podemos usar nuestros propios formatos con DateTimeFormatter
            o usar las constantes que nos ofrece DateTimeFormatter
         */
        
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy/MMMM/dd hh:mm:ss a");
          
        
        
        String formato1 = fechaTiempo.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println("formato1 = " + formato1);

        String formato2 = fechaTiempo.format(DateTimeFormatter.ofPattern("yyyy/MMMM/dd hh:mm:ss a"));
        System.out.println("formato2 = " + formato2);
        
        String formato3 = df.format(fechaTiempo);
        System.out.println("formato3 = " + formato3);

        

    }
}
