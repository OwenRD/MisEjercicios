package Servicios;

import java.util.Date;
import java.util.Scanner;

public class FechaService {

    Scanner leer = new Scanner(System.in);

    public Date fechaNacimiento() {

        System.out.println("Fecha de nacimiento");
        int dia, mes, anio;
        System.out.println("Ingrese el dia");
        dia = leer.nextInt();
        System.out.println("Ingrese el mes");
        mes = leer.nextInt();
        System.out.println("Ingrese el año");
        anio = leer.nextInt();

        Date fecha = new Date(anio - 1900, mes - 1, dia);
        System.out.println(fecha);
        System.out.println("-----------------------------");

        return fecha;

    }

    public Date fechaActual() {
        Date fechaActual = new Date();
        System.out.println(fechaActual);
        System.out.println("-----------------------------");

        return fechaActual;
    }

    public void diferencia(Date fecha, Date fechaActual) {

        int diferencia = fecha.getYear() - fechaActual.getYear();
        System.out.println("La diferencia de años es --> " + (-diferencia) + " años" );

    }
}
