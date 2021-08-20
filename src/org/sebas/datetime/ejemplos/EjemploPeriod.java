package org.sebas.datetime.ejemplos;

import java.time.LocalDate;
import java.time.Period;

public class EjemploPeriod {
    public static void main(String[] args) {
        /*
            TODO: Period
            Se debe usar las fechas con LocalDate, ya que el periodo
            no incluye el tiempo
         */
        LocalDate f1 = LocalDate.of(2011, 9 ,23);
        LocalDate f2 = LocalDate.of(2020, 11, 25);
        LocalDate f3 = f2.withMonth(12);

        Period period = Period.between(f1, f3);
        System.out.println("period = " + period);
        System.out.println("Periodo en años = " + period.getYears());
        System.out.println("Periodo en meses = " + period.getMonths());
        System.out.println("Periodo en dias = " + period.getDays());
        // %s -> String, %d -> Number
        System.out.printf("Periodo entre %s y %s hay %d años, %d meses, %d dias"
        , f1, f3, period.getYears(), period.getMonths(), period.getDays());

        /*
            TODO: Modificar una fecha ya creada [With]
            En realidad no la modifica, solo regresa una nueva
            instancia a partir de la ya creada, con los metodos
            que inician con withYear...
            No basta solo con llamar el metodo, toca asignarla
         */
    }
}
