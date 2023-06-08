/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import clases.Perro;
import clases.Persona;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

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
        ArrayList<Perro> pr = new ArrayList();
        Perro pr1 = new Perro(5, "chiquito", "beagle", "mediano");
        Perro pr2 = new Perro(5, "lola", "beagle", "mediano");
        Perro pr3 = new Perro(5, "max", "beagle", "mediano");
        pr.add(pr1);
        pr.add(pr2);
        pr.add(pr3);

        ArrayList<Persona> p = new ArrayList();
        Persona p1 = new Persona("pablito", "clavito", 49123123, 45, null);
        Persona p2 = new Persona("pablo", "smith", 49123123, 45, null);
        Persona p3 = new Persona("pablin", "clavo", 49123123, 45, null);
        p.add(p1);
        p.add(p2);
        p.add(p3);

        String res;
        Iterator it = p.iterator();

        for (int i = 0; i < p.size(); i++) {
            
            System.out.println("¿decea adoptar algun perro? y/n");
            System.out.print(">");  res = leer.next();
            
            if (res.equalsIgnoreCase("y")) {
                System.out.println("¿cual decea adoptar?");
                String nom = leer.next();
                for (int j = 0; j < pr.size(); i++) {
                    if (nom.equalsIgnoreCase(pr.get(j).getNombre())) {
                        if (pr.get(j).isAdoptado()) {
                            System.out.println("este perro ya a sido adoptado");
                        } else {
                            System.out.println("Felicidades por su nuevo perro");
                            p.get(i).setPerro(pr.get(i));
                        }
                    }
                }
            } else if (res.equalsIgnoreCase("n")) {
                System.out.println("Hasta luego");
            } else {
                System.out.println("su respuesta no es valida");
            }
            
        }

        for (Persona persona : p) {
            System.out.println(persona);
        }

    }

}
