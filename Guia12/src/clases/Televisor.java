/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import ENUM.Color;

/**
 *
 * @author owen0
 */
public class Televisor extends Electrodomestico{
    
    private int resolucion;
    private boolean sintonizador;

    public Televisor() {
    }

    public Televisor(int resolucion, boolean sontonizador, int precio, String color, char consumoEnergetico, int peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizador = sontonizador;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sontonizador) {
        this.sintonizador = sontonizador;
    }
    
    public void crearTelevisor(){
        crearElectrodomestico();
        System.out.println("ingrse la resolucion del televisor: ");
        setResolucion(leer.nextInt());
        System.out.println("¿el televisor tiene sintonizador? s/n");
        String res = leer.next();
        setSintonizador(res.equalsIgnoreCase("s"));
    }
    
    public void precioFinal(){
        super.precioFinal();
        
        if(getResolucion()>40){
            this.precio += (int) (this.precio*(0.3));
        }
        if(isSintonizador()){
            this.precio+=500;
        }
    }
    
    @Override
    public String toString() {
        return " resolucion: "+ resolucion +
                " sintonizador: "+ sintonizador +
                " consumoEnergetico: "+ super.consumoEnergetico + 
                " color: "+ super.color +
                " peso: "+ super.peso +
                " precio: "+ super.precio;
    }
    
}
