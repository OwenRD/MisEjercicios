/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mains;

import clases.Animal;
import clases.Caballo;
import clases.Gato;
import clases.Perro;

/**
 *
 * @author owen0
 */
public class ejer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Animal perro = new Perro("chiquito", "carne", 5, "beagle");
        perro.alimentacion();
        Animal gato = new Gato("michi", "alimento", 3, "egipsio");
        gato.alimentacion();
        Animal caballo = new Caballo("pancho", "pasto", 10, "arabe");
        caballo.alimentacion();
        
    }
    
}
