package org.sebas.datetime.ejemplos;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class EjemploZoneDateTimeWithOffSet {
    public static void main(String[] args) {


        /*  TODO: ZoneOffset
            ZoneOffSet es un tiempo universal.
            Cada zona horario tiene unos valores segund si es invierno o verano
            con esto, es solo pasar esos valores como argumento al OffSet para que
            lo reconozca y regresa la fecha y la hora de dicha zona
         */

        LocalDateTime fechaLocal = LocalDateTime.parse("2021/09/21 12:45"
                ,DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm"));

        //Obtenemos la zona horario NY
        ZonedDateTime zonaNy = ZonedDateTime.of(fechaLocal, ZoneOffset.of("-04:00"));
        //A partir de la zona horario NY se obtiene la Madrid, para ver la diferencia
        //Colocamos + 8 horas del viaje de prueba
        ZonedDateTime zonaMadrid = zonaNy.withZoneSameInstant(ZoneOffset.of("+02:00")).plusHours(8);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("HH:mm, dd MMM yyyy");

        System.out.println("Datalles viaje a Madrid desde NY");
        System.out.println("Hora salida NY = " + df.format(zonaNy));
        System.out.println("Hora llegada Madrid = " + df.format(zonaMadrid));
        System.out.println("");


        
        /*
            TODO: ZoneId nos provee todas los valores
         */
        Set<String> allZones = ZoneId.getAvailableZoneIds();
        //allZones.forEach(System.out::println); // Son muchas xd




        /*
            TODO: Tambien podemos crear ZoneDateTime
            A partir de la hora y pasandole el ZoneId como argumento
         */
        LocalDateTime algunaHora = LocalDateTime.now();
        //ZonedDateTime algunaZona = algunaHora.atZone(ZoneId.of("America/Bogota"));
        ZonedDateTime algunaZona = algunaHora.atZone(ZoneOffset.of("+05:00"));
        System.out.println("algunaZona = " + algunaZona);




        /*
            TODO: Prueba
            Bogota +05:00 para hacer prueba de ZoneOffset()
         */
        System.out.println("");
        LocalDateTime horaLocalBogota = LocalDateTime.now();
        ZoneId zoneIdBogota = ZoneId.of("America/Bogota");
        ZonedDateTime zonaHorariaCol = ZonedDateTime.of(horaLocalBogota,zoneIdBogota);
        System.out.println("zonaHorariaBogota = " + zonaHorariaCol);

        ZoneId zoneIdMadrid = ZoneId.of("Europe/Madrid");
        ZonedDateTime zonaHoraria2 = zonaHorariaCol.withZoneSameInstant(zoneIdMadrid);
        System.out.println("zonaHorariaMadrid = " + zonaHoraria2);











    }
}
