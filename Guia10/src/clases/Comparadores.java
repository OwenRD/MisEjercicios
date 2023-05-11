/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Comparator;

/**
 *
 * @author owen0
 */
public class Comparadores {
    
    public static Comparator<Perro> ordenarPerros = new Comparator<Perro>() {
        @Override
        public int compare(Perro o1, Perro o2) {
            return o1.getRaza().compareTo(o2.getRaza());
        }
        
    }; 
    
     public static Comparator<Pelicula> ordenarDurDec = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o2.getDuracion().compareTo(o1.getDuracion());
        }
        
    };  
     
     public static Comparator<Pelicula> ordenarDurA = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o1.getDuracion().compareTo(o2.getDuracion());
        }
        
    }; 
     
     public static Comparator<Pelicula> ordenarNom = new Comparator<Pelicula>() {
         @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o1.getNombre().compareTo(o2.getNombre());
        }
        
    }; 
     
    public static Comparator<Pelicula> ordenaDire = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o1.getDirector().compareTo(o2.getDirector());
        }
        
    };   
}
