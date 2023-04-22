/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import clases.Cadena;
import java.util.Scanner;
import servicios.CadenaServicio;



/**
 *
 * @author owen0
 */
public class ejer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CadenaServicio cd = new CadenaServicio();
        System.out.println("ingrese una frase");
        String frase= leer.next();
        Cadena fr = new Cadena(frase);
        
        cd.mostrarVocales(fr);
        
        cd.invertirFrase(fr);
        
        System.out.println("ingrese la letra que decea buscar");
        char l = leer.next().charAt(0);
        cd.vecesRepetido(l, fr);
        
        System.out.println("ingrese una frase a comparar");
        String frase1 = leer.next();
        cd.compararLongitud(frase1, fr);
        
        System.out.println("ingrese una frase a unir");
        String frase2 = leer.next();
        cd.unirFrase(frase2, fr);
        
        System.out.println("ingrese una letra a reemplazar");
        frase1 = leer.next();
        cd.reemplazarFrase(frase1 , fr);
        
        System.out.println("ingrese una letra a buscar");
        l = leer.next().charAt(0);
        
        System.out.println("contiene la letra? "+cd.contiene(l, fr));
    }
    
}
