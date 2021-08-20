package org.sebas.datetime.ejemplos;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class EjemploZoneDateTime {
    public static void main(String[] args) {

        /*
            TODO: ZoneDateTime
            Permite cambiar la zona horario en la que nos encontramos
            y asi poder acceder a otras horas de otros lugares

            Cada contiene puede tiene una zona horario distinta y la podemos
            obetener  con un id unico, ejemplo: America/Bogota

            mas info:
            https://en.wikipedia.org/wiki/List_of_tz_database_time_zones
         */

        //TODO: NEWYORK

        LocalDateTime fechaLocal = LocalDateTime.now();
        ZoneId newYork = ZoneId.of("America/New_York");
        // A parti de nuestar hora local, y la zona horario antes creada, debemos crear un tiempo con zona
        ZonedDateTime zonaNy = ZonedDateTime.of(fechaLocal,newYork);
        String horaNy = zonaNy.format(DateTimeFormatter.ofPattern("dd MMMM yyyy / HH:mm:ss a"));
        System.out.println("\nHora de partida en NewYork = " + horaNy);



        //TODO: ESPAÑA

        ZoneId madrid = ZoneId.of("Europe/Madrid");
        //Creamos la zona horario a partir de la de New York, porque queremos saber la hora en Madrid a partir de NY
        //Por ello usamos el metodo withZoneSameInstant
        ZonedDateTime zonaMadrid = zonaNy.withZoneSameInstant(madrid).plusHours(8);
        String horaMadrid = zonaMadrid.format(DateTimeFormatter.ofPattern("dd MMMM yyyy / HH:mm:ss a"));
        System.out.println("Hora de llegada a Madrid = " + horaMadrid);


        /*
            TODO: Prueba

            Por alguna razon si se parte de la hora actual con .now() al buscar
            la zona horario de otro contienente marca las misma hora,
            pero si ya se hizo y luego se busca otra zona a partida de la que ya
            se busco, se obtiene la diferenciar de zona del primer resultado
            con la zona del segundo resultado
         */
        LocalDateTime pruebaFecha = LocalDateTime.now();
        ZoneId pruebaId = ZoneId.of("Europe/Madrid");
        ZonedDateTime pruebaZona = ZonedDateTime.of(pruebaFecha,pruebaId);
        String prueba = pruebaZona.format(DateTimeFormatter.ofPattern("dd MMMM yyyy / HH:mm:ss a"));
        System.out.println("\nZona Prueba Madrid = " + prueba);



        /*
             TODO: Segunda Parte
             Con fechas a futuro
         */


        DateTimeFormatter df = DateTimeFormatter.ofPattern("HH:mm, dd MMM yyyy");

        /*
            Si queremos agregar nuestro propio formato al momento de crear la fecha
            sin que genere error, el metodo parse(), acepta un 2 argumento
            en el que podemos pasar el formato que queremos que nos acepte
         */
        LocalDateTime fechaFutura = LocalDateTime.parse("2021/09/21 12:45"
                ,DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm"));
        ZoneId zoneIdNewYork = ZoneId.of("America/New_York");

        ZonedDateTime zonedDateTimeNewYork = ZonedDateTime.of(fechaFutura,zoneIdNewYork);
        String zoneHorarioFormateada = zonedDateTimeNewYork.format(df);


        System.out.println("\n\nHora Futura Formateada = " + zoneHorarioFormateada);




    }
}
