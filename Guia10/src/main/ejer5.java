/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import servicios.PaisServicio;

/**
 *
 * @author owen0
 */
public class ejer5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PaisServicio sv = new PaisServicio();
        
        sv.crearPais();
        
        sv.ordenarPais();
        
        sv.eliminarPais();
    }
    
}
