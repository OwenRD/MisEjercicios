/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import java.util.Scanner;
import servicios.PerroServicio;

/**
 *
 * @author owen0
 */
public class ejer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       PerroServicio sv = new PerroServicio();
       
       sv.cargarRaza();
       sv.eliminarPerro();
        
    }
}