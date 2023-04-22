/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import clases.ParDeNumeros;
import servicios.ParDeNumerosServicio;

/**
 *
 * @author owen0
 */
public class ejer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ParDeNumeros numeritos = new ParDeNumeros();
        ParDeNumerosServicio servi = new ParDeNumerosServicio();
        
        servi.mostrarValores(numeritos);
        System.out.println("El Numero mas grande seria: " + servi.devolverMayor(numeritos));
        servi.calcularPotencia(numeritos);
        servi.calculaRaiz(numeritos);
    }
    
}
