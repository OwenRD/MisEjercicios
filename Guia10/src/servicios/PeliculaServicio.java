/*
 * • Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package servicios;

import clases.Comparadores;
import clases.Pelicula;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author owen0
 */
public class PeliculaServicio {

    Scanner leer = new Scanner(System.in);
    ArrayList<Pelicula> pelis = new ArrayList();

    public void crearPelicula() {
        String res;
        boolean flag = true;
        do {
            System.out.println("ingrese el nombre de la pelicula:");
            String nombre = leer.next();

            System.out.println("ingrese el nombre del Director:");
            String director = leer.next();

            System.out.println("ingrese la duracion de la pelicula:");
            Integer duracion = leer.nextInt();

            pelis.add(new Pelicula(nombre, director, duracion));

            System.out.println("¿decea ingresar otra Pelicula? y/n");
            res = leer.next();
            if (res.equalsIgnoreCase("n")) {
                flag = false;
            } else if (!res.equalsIgnoreCase("y")) {
                System.out.println("su respuesta no es valida, se tomara como negativa");
                flag = false;
            }

        } while (flag);

    }

    public void mostrarPelicula() {

        for (Pelicula peli : pelis) {
            System.out.println(peli);
        }
    }

    public void mostrarUnaHora() {

        for (Pelicula peli : pelis) {
            if (peli.getDuracion() > 1) {
                System.out.println(peli);
            }
        }
    }

    public void ordenarDec() {
        Collections.sort(pelis, Comparadores.ordenarDurDec);
    }

    public void ordenarA() {
        Collections.sort(pelis, Comparadores.ordenarDurA);
    }

    public void ordenarTitulo() {
        Collections.sort(pelis, Comparadores.ordenarNom);
    }

    public void ordenarDirector() {
        Collections.sort(pelis, Comparadores.ordenaDire);
    }

    public void cargarClase() {
        crearPelicula();

        char res;
        boolean flag = true;
        do {
            System.out.println("eliga una que decea");
            System.out.println("A. mostrar peliculas mayor de una hora");
            System.out.println("B. ordenar por duracion(decendente)");
            System.out.println("C. ordenar por duracion(ascendente)");
            System.out.println("D. ordenar por titulo");
            System.out.println("E. ordenar por director");
            System.out.println("F. mostrar peliculas");
            System.out.println("G. salir");
            res = leer.next().toLowerCase().charAt(0);

            switch (res) {
                case 'a':
                    mostrarUnaHora();
                    break;
                case 'b':
                    ordenarDec();
                    break;
                case 'c':
                    ordenarA();
                    break;
                case 'd':
                    ordenarTitulo();
                    break;
                case 'e':
                    ordenarDirector();
                    break;
                case 'f':
                    mostrarPelicula();
                    break;
                case 'g':
                    flag = false;
                    break;
                default:
                    System.out.println("la respuesta no es valida");
            }

        } while (flag);
        System.out.println("PROGRAMA FINALIZADO");
    }
}
