/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import servicios.AlumnoServicio;

/**
 *
 * @author owen0
 */
public class ejer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlumnoServicio sv = new AlumnoServicio();
        
        sv.crearAlumno();
         System.out.println("el promedio del alumno es: "+ sv.notaFinal());
    }
    
}
