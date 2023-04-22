/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import clases.Ahorcado;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author owen0
 */
public class AhorcadoServicio {

    Scanner leer = new Scanner(System.in);

    public Ahorcado crearJuego() {

        System.out.println("ingrese la palabra secreta");
        String palabra = leer.next();

        char[] aux = palabra.toCharArray();

        System.out.println("ingrese la cantidad de jugadas maximas");
        int jugadasMax = leer.nextInt();

        return new Ahorcado(aux, jugadasMax, 0);
    }

    public void mostrarLongitud(Ahorcado a) {
        System.out.println("La longitud de la palabra es: " + a.getPalabra().length);
    }

    public int buscar(Ahorcado a, char l) {
        char[] aux = a.getPalabra();
        int cont = 0;

        for (int i = 0; i < a.getPalabra().length; i++) {

            if (aux[i] == l) {
                cont++;
                aux[i]=' ';
            }

        }

        return cont;
    }

    public void encontradas(Ahorcado a, char l) {

        int flag = buscar(a, l);
        if (flag > 0) {
            System.out.println("la letra se encontabra en la palabra");
            a.setLetrasEnc(a.getLetrasEnc() + flag);

        } else {
            a.setJugadasMax(a.getJugadasMax() - 1);
        }
        System.out.println("se a encontrado " + a.getLetrasEnc() + " y faltan " + (a.getPalabra().length - a.getLetrasEnc()) + " letras");

    }

    public int intentos(Ahorcado a) {
        System.out.println("Cantidad de intestos restante: " + a.getJugadasMax());
        return a.getJugadasMax();
    }

    public void juego(Ahorcado a) {
       
        int flag = 0;
        char l;
        
        do {

            System.out.println("-----------------------");

            System.out.println("================");

            System.out.println("ingrese la letra:");
            l = leer.next().charAt(0);
            
            System.out.println("================");
//==============================================================================

            mostrarLongitud(a);

            encontradas(a, l);

            intentos(a);
            System.out.println("-----------------------");
            if (a.getLetrasEnc() == a.getPalabra().length) {
                flag = 1;
            } else if (a.getJugadasMax() == 0) {
                flag = 2;
            }
            
        } while (flag == 0);
//==============================================================================        
        if (flag == 1) {
            System.out.println("¡Has Adivinado!");
        } else if (flag == 2) {
            System.out.println("Se te han acabado los intentos :(");
        }
    }
}
