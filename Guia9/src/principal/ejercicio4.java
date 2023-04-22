package _7Poo;

import Servicios.FechaService;

public class ejercicio4 {

    public static void main(String[] args) {
        FechaService f1 = new FechaService();
        //f1.fechaNacimiento(); 
        //f1.fechaActual();
        f1.diferencia(f1.fechaNacimiento(), f1.fechaActual());

    }
}
