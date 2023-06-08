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

public class Polideportivo extends Edificio {

    private String nombre;
    private boolean tipo;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, boolean tipo, double ancho, double largo, double alto) {
        super(ancho, largo, alto);
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public boolean isTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }
    

    @Override
    public void calcularSuperficie() {
        System.out.println("superficie Polideportivo: "+(ancho * largo)); 
    }

    @Override
    public void calcularVolumen() {
        System.out.println("volumen Polideportivo: "+(ancho * largo * alto));
    }

}
