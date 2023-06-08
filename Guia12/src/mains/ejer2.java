/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mains;

import clases.Lavadora;
import clases.Televisor;

/**
 *
 * @author owen0
 */
public class ejer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Lavadora obj1 = new Lavadora();
        Televisor obj2 = new Televisor();
        
        obj1.crearLavadora();
        obj1.precioFinal();
        System.out.println(obj1);
        
        obj2.crearTelevisor();
        obj2.precioFinal();
        System.out.println(obj2);
        
    }
    
}
