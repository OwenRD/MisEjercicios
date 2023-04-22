/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import clases.Persona;
import java.util.Scanner;
import servicios.PersonaServicio;

/**
 *
 * @author owen0
 */
public class ejer5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        PersonaServicio sv = new PersonaServicio();
        Persona p1 = sv.crearPersona();
        
        sv.calcularEdad(p1);
        
        System.out.println("ingrese la edad a comparar");
        int edad = leer.nextInt();
        boolean flag = sv.menorQue(p1, edad);
        if(flag == true){
            System.out.println("eres menor de "+edad);
        }else{
            System.out.println("eres mayor de "+edad);
        }
        
        sv.mostrarPersona(p1);
        
    }
    
}
