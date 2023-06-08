/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mains;

import clases.Electrodomestico;
import clases.Lavadora;
import clases.Televisor;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author owen0
 */
public class ejer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Electrodomestico> electros = new ArrayList();
        
        Lavadora obj1 = new Lavadora();
        obj1.crearLavadora();
        Lavadora obj2 = new Lavadora();
        obj2.crearLavadora();
        Televisor obj3 = new Televisor();
        obj3.crearTelevisor();
        Televisor obj4 = new Televisor();
        obj4.crearTelevisor();
        
        electros.add(obj1);
        electros.add(obj2);
        electros.add(obj3);
        electros.add(obj4);
        int suma=0;
        for (Electrodomestico aux : electros) {
            aux.precioFinal();
            suma+= aux.getPrecio();
            System.out.println(aux);
        }
        
        System.out.println("el precio total es de "+ suma +"$");
        
    }
    
}
