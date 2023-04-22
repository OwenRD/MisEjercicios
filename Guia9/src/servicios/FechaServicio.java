/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author owen0
 */
public class FechaServicio {

    Scanner leer = new Scanner(System.in);

    public Date fechaNacimiento() {
        System.out.print("ingrese su año de nacimiento:");
        int anio = leer.nextInt();

        System.out.print("ingrese su mes de nacimiento:");
        int mes = leer.nextInt();

        System.out.print("ingrese su dia de nacimiento:");
        int dia = leer.nextInt();

        return new Date(anio-1900 , mes-1, dia);
    }
    
    public Date fechaActual(){
        Date fechaActual = new Date();
        System.out.println(fechaActual);
        return fechaActual;
    }
    
    public void diferencia(Date fecha, Date fechaActual){
        int diferencia = fechaActual.getYear() - fecha.getYear();
        System.out.println("Tu edad es: "+diferencia);
    }

}
