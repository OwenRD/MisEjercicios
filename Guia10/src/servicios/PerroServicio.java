/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import clases.Comparadores;
import clases.Perro;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author owen0
 */
public class PerroServicio {

    ArrayList<Perro> rz = new ArrayList();
    Scanner leer = new Scanner(System.in);

    public void cargarRaza() {

        String raza, res;
        boolean flag = true;
        do {
            System.out.println("ingrese la raza del perro");
            raza = leer.next();
            rz.add(new Perro(raza));

            System.out.println("decea agregar otra raza? y/n");
            res = leer.next();
            if (res.equalsIgnoreCase("n")) {
                flag = false;
            }

        } while (flag);
        mostrarPerros();
    }

    public void mostrarPerros() {

        for (Perro perro : rz) {
            System.out.println(perro);
        }

    }

    public void eliminarPerro() {
        Iterator<Perro> it = rz.iterator();

        System.out.println("ingrese la raza de perro que decea eliminar ");
        String raza = leer.next();
        boolean flag=false;
//        Perro aux = new Perro(raza);

        while (it.hasNext()) {
            if (it.next().getRaza().equals(raza)) {
                it.remove();
                flag=true; 
            }
        }
        if(flag){
            System.out.println("se elimino el elemento");
        }else{
            System.out.println("la raza ingresada no se encuentra en la lista");
        }
        
        Collections.sort(rz, Comparadores.ordenarPerros);
        
        mostrarPerros();

    }
}
