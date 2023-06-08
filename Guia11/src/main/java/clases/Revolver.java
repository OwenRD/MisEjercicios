/*
Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición
del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.Random;

/**
 *
 * @author owen0
 */
public class Revolver {
    Random r = new Random();
    private int posicionActual;
    private int posicionAgua;

    public Revolver() {
        llenarRevolver();
    }
    
    
    
    public void llenarRevolver(){
        
        posicionActual = ((r.nextInt(6))+1);
        posicionAgua = ((r.nextInt(6))+1);
        
    }
    
    public boolean mojar(){
        return (posicionActual==posicionAgua);
    }
    
    public void siguienteChorro(){
        
        if (posicionActual==6) {
            posicionActual=1;
        }else{
            posicionActual++;
        }
    }

    @Override
    public String toString() {
        return "Revolver{" + "La posicion Actual es:" + posicionActual + ", La posicion del Agua es: " + posicionAgua + '}';
    }
    
    
}
