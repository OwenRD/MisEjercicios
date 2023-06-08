/*
Los alojamientos se identifican por un nombre, una dirección,
una localidad y un gerente encargado del lugar. La compañía trabaja con dos tipos de
alojamientos:
 */
package extra3;

import java.util.Scanner;

/**
 *
 * @author owen0
 */
public class Alojamiento {

protected String nombre, localidad, gerente;

    public Alojamiento() {
    }

    public Alojamiento(String nombre, String localidad, String gerente) {
        this.nombre = nombre;
        this.localidad = localidad;
        this.gerente = gerente;
    }
    
    public void iniciar(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el Nombre del Alojamiento: ");
        this.nombre = leer.next();
        System.out.println("Ingrese la Localidad: ");
        this.localidad = leer.next();
        System.out.println("Ingrese el nombre del Gerente: ");
        this.gerente = leer.next();  
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    @Override
    public String toString() {
        return "Alojamiento{" + "nombre=" + nombre + ", localidad=" + localidad + ", gerente=" + gerente + '}';
    }
    


}
