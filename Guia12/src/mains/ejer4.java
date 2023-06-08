/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mains;

import clases.Circulo;
import clases.Rectangulo;

/**
 *
 * @author owen0
 */
public class ejer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Circulo c = new Circulo();
        Rectangulo r = new Rectangulo();
        
        c.calcularArea();
        c.calcularPerimetro();
        System.out.println(c);
        
        r.calcularArea();
        r.calcularPerimetro();
        System.out.println(r);
        
    }
    
}
