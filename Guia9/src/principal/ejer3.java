/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import servicios.ArreglosServicio;

/**
 *
 * @author owen0
 */
public class ejer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArreglosServicio sv = new ArreglosServicio();
        double[] A = new double[50];
        double[] B = new double[20];
        
        sv.inicializarA(A);
        
        sv.mostrar(A);
        
        sv.ordenar(A);
        
        sv.mostrar(A);
        
        sv.inicializarB(A, B);
        
        sv.mostrar(A);
        sv.mostrar(B);
    }
    
}
