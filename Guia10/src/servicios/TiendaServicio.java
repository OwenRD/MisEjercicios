/*
 * Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package servicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author owen0
 */
public class TiendaServicio {

    Scanner leer = new Scanner(System.in);
    HashMap<String, Double> productos = new HashMap();

    public void crearProducto() {
        System.out.println("==================================================");
        System.out.println("Ingrese su Producto");

        System.out.print("Nombre del Producto :");
        String nombre = leer.next();
        System.out.print("Precio :");
        Double precio = leer.nextDouble();

        productos.put(nombre, precio);

    }

    public void modificarPrecio() {
        boolean val = true;

        System.out.println("==================================================");
        System.out.println("Ingrese el nombre del Producto que modificara:");
        System.out.print(">");
        String nombre = leer.next();

        System.out.println("Ahora ingrese su nuevo Precio");
        System.out.print(">");
        Double precio = leer.nextDouble();

        for (Map.Entry<String, Double> entry : productos.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();
            if (key.equalsIgnoreCase(nombre)) {
                productos.replace(key, precio);
                val = false;
            }
        }
        if (val) {
                System.out.println("el Producto no se encontro en la lista :(");
            }
    }
    

    public void eliminarProducto() {
        System.out.println("==================================================");
        System.out.println("Ingrese el nombre del Producto que decea Eliminar:");
        System.out.print(">");
        String nombre = leer.next();
        boolean val = true;

        for (Map.Entry<String, Double> i : productos.entrySet()) {
            
            if (i.getKey().equalsIgnoreCase(nombre)) {
                String key = i.getKey();
                productos.remove(key);
                val = false;
            }
        }
        if (val) {
            System.out.println("el Producto no se encontro en la lista :(");
        }

    }

    public void mostrar() {
        productos.entrySet().forEach((entry) -> {
            String key = entry.getKey();
            Double value = entry.getValue();
            System.out.println("Producto: " + key + " " + value + "$");
        });
    }

    public void menu() {
        char res;
        boolean flag = true;
        System.out.println("===MENU===");
        System.out.println("ingrese que decea hacer");

        do {
            System.out.println("==================================================");
            System.out.println("A. Ingresar un nuevo Producto");
            System.out.println("B. Modificar Precio");
            System.out.println("C. Eliminar un Producto");
            System.out.println("D. Mostrar Productos");
            System.out.println("E. Salir");
            System.out.print(">");
            res = leer.next().toLowerCase().charAt(0);

            switch (res) {
                case 'a':
                    crearProducto();
                    break;
                case 'b':
                    modificarPrecio();
                    break;
                case 'c':
                    eliminarProducto();
                    break;
                case 'd':
                    mostrar();
                    break;
                case 'e':
                    flag = false;
                    break;
                default:
                    System.out.println("su respuesta no es valida :(");
            }
        } while (flag);
        System.out.println("PROGRAMA FINALIZADO :)");
    }
}
