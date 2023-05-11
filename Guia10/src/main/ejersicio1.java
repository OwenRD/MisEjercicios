/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import clases.Perro;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
 * @author owen0
 */
public class ejersicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Perro> razas = new ArrayList();
        Scanner leer = new Scanner(System.in);
        boolean flag=true;
        String rz,res;
        
        do{
            System.out.println("ingrese una raza");
            rz = leer.next();
            
            razas.add(new Perro(rz));
            
            System.out.println("decea agragar mas? y/n");
            res=leer.next();
            if(res.equals("n")){
                flag=false;
            }
            
        }while(flag);
        
        for (Perro raza : razas) {
            System.out.println(raza);
        }
        
    }
    
}
