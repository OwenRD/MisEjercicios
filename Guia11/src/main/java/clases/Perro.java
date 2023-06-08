/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author owen0
 */
public class Perro {
    
    private int edad;
    private String nombre, raza, tamano;
    private boolean adoptado;

    public Perro(int edad, String nombre, String raza, String tamano) {
        this.edad = edad;
        this.nombre = nombre;
        this.raza = raza;
        this.tamano = tamano;
        this.adoptado = false;
    }

    public Perro() {
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public boolean isAdoptado() {
        return adoptado;
    }

    public void setAdoptado(boolean adoptado) {
        this.adoptado = adoptado;
    }
    

    @Override
    public String toString() {
        return "Perro{" + "edad=" + edad + ", nombre=" + nombre + ", raza=" + raza + ", tamano=" + tamano + '}';
    }
    
    
}
