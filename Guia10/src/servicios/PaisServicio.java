/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import clases.Pais;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import javax.swing.JOptionPane;

/**
 *
 * @author owen0
 */
public class PaisServicio {

    Scanner leer = new Scanner(System.in);
    LinkedHashSet<Pais> paisHash = new LinkedHashSet();

    public void crearPais() {
        boolean flag = true;
        String pais,res;
        
        do {
            System.out.println("ingrese un el Pais que decea");
            pais = leer.next();
            paisHash.add(new Pais(pais));
            System.out.println("¿decea ingresar otro pais? y/n");
            res = leer.next();
            
            if(res.equalsIgnoreCase("n")){
                flag=false;
            }
        } while (flag);
        paisHash.forEach((e) -> System.out.println(e));
        System.out.println("============================");
    }

    public void ordenarPais() {
    TreeSet<Pais> paisTree = new TreeSet(paisHash);
        for (Pais pais : paisTree) {
            System.out.println(pais);
        }
    }
    
    public void eliminarPais(){
        System.out.println("ingrese el pais que decea eliminar");
        String pais= leer.next();
        Iterator<Pais> it = paisHash.iterator();
        
        while(it.hasNext()){
            Pais p = it.next();
            if(p.getNombre().equals(pais)){
                it.remove();
            }
        }
        paisHash.forEach((e)->System.out.println(e));
    }
    
}
