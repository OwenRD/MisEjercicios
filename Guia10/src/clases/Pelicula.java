/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author owen0
 */
public class Pelicula {
    
    private String nombre, director;
    private Integer duracion;

    public Pelicula(String nombre, String director, int duracion) {
        this.nombre = nombre;
        this.director = director;
        this.duracion = duracion;
    }

    public Pelicula() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "nombre=" + nombre + ", director=" + director + ", duracion=" + duracion + '}';
    }
    
    
}
