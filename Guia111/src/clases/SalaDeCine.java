/*
 Nos piden hacer un programa sobre un Cine, que tiene una sala con un conjunto de asientos
(8 filas por 6 columnas). De Cine nos interesa conocer la película que se está reproduciendo, la
sala con los espectadores y el precio de la entrada. Luego, de las películas nos interesa saber
el título, duración, edad mínima y director. Por último, del espectador, nos interesa saber su
nombre, edad y el dinero que tiene disponible.
Para representar la sala con los espectadores vamos a utilizar una matriz. Los asientos son
etiquetados por una letra y un número la fila A1 empieza al final del mapa como se muestra en
la tabla. También deberemos saber si el asiento está ocupado por un espectador o no, si esta
ocupado se muestra una X, sino un espacio vacío.
8 A X | 8 B X | 8 C X | 8 D   | 8 E X | 8 F X
7 A X | 7 B X | 7 C X | 7 D X | 7 E   | 7 F X
6 A X | 6 B X | 6 C   | 6 D X | 6 E X | 6 F
5 A X | 5 B X | 5 C X | 5 D X | 5 E X | 5 F X
4 A X | 4 B X | 4 C X | 4 D X | 4 E X | 4 F X
3 A X | 3 B X | 3 C X | 3 D   | 3 E X | 3 F X
2 A X | 2 B   | 2 C X | 2 D X | 2 E X | 2 F
1 A X | 1 B X | 1 C X | 1 D X | 1 E X | 1 F X
Se debe realizar una pequeña simulación, en la que se generen muchos espectadores y se los
ubique en los asientos aleatoriamente (no se puede ubicar un espectador donde ya este
ocupado el asiento).
Los espectadores serán ubicados de uno en uno y para ubicarlos tener en cuenta que sólo se
podrá sentar a un espectador si tiene el dinero suficiente para pagar la entrada, si hay espacio
libre en la sala y si tiene la edad requerida para ver la película. En caso de que el asiento este
ocupado se le debe buscar uno libre.
Al final del programa deberemos mostrar la tabla, podemos mostrarla con la letra y numero de
cada asiento o solo las X y espacios vacíos.
 */
package clases;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author owen0
 */
public class SalaDeCine {

    Scanner leer = new Scanner(System.in);
    private String[][] sala = new String[8][6];
    private double precio;
    private Pelicula pelicula;

    public SalaDeCine() {
        this.precio = 1200;
    }

    public void llenarSala() {
        char l;
        String le;
        int cont = 8;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                l = (char) (65 + j);
                sala[i][j] = String.valueOf(cont).concat(String.valueOf(l));

            }
            cont--;
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(sala[i][j]);
            }
            System.out.println("");
        }
    }

    public ArrayList<Cliente> espectadores() {
        ArrayList<Cliente> list = new ArrayList();
        String nombre, res;
        int edad;
        double dinero;

        System.out.println("===Agrege los clientes que decea===");
        do {

            System.out.println("ingrese su nombre:");
            System.out.print(">");
            nombre = leer.next();
            System.out.println("ingrese su edad:");
            System.out.print(">");
            edad = leer.nextInt();
            System.out.println("ingrese la cantidad de dinero que tenga:");
            System.out.print(">");
            dinero = leer.nextDouble();

            list.add(new Cliente(nombre, edad, dinero));

            System.out.println("¿decea agregar mas? y/n");
            res = leer.next();

        } while (!res.equalsIgnoreCase("n"));
        return list;
    }

    public void elegirPelicula() {
        List<Pelicula> pelis = new ArrayList();
        Pelicula p1 = new Pelicula("Pelicula1", "Pablito1", 12, 130);
        Pelicula p2 = new Pelicula("Pelicula2", "pablito2", 16, 150);
        Pelicula p3 = new Pelicula("Pelicula3", "pablito3", 18, 180);
        Pelicula p4 = new Pelicula("Pelicula4", "pablito4", 18, 150);
        pelis.add(p1);
        pelis.add(p2);
        pelis.add(p3);
        pelis.add(p4);

        this.pelicula = pelis.get((int) (Math.random() * 4));
    }

    public boolean validarEntrada(Cliente c) {
        int cont = 0;
        if (c.getEdad() > pelicula.getEdadMin()) {
            cont++;
        }
        if (c.getDinero() >= precio) {
            cont++;
        }

        return cont == 2;
    }

    public void entrarSala() {
        
        elegirPelicula();
        System.out.println("Se vera La pelicula");
        System.out.println(pelicula);
        llenarSala();
        ArrayList<Cliente> cliente = espectadores();
        boolean flag;
        int i, j;

        for (Cliente cliente1 : cliente) {
            flag = true;
            i = (int) (Math.random() * 8);
            j = (int) (Math.random() * 6);

            if (validarEntrada(cliente1)) {
                do {

                    if (sala[i][j].length() == 2) {
                        sala[i][j] = sala[i][j] + "X";
                        flag = false;
                    } else {
                        System.out.println("Este asiento esta ocupado. se lo reasignara");

                    }

                } while (flag);
            } else {
                System.out.println("El cliente " + cliente1.getNombre() + " no cumple los requisitos para ver la Pelicula");
            }

        }

        for (int k = 0; k < 8; k++) {

            for (int l = 0; l < 6; l++) {
                if (sala[k][l].length() == 2 ) {
                    System.out.print("| "+sala[k][l]+" |");
                }else{
                    System.out.print("| "+sala[k][l]+"|");
                }
                
            }
            System.out.println("");
        }

    }

}
