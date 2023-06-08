/*
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


/**
 *
 * @author owen0
 */
public class Baraja {
    Scanner leer = new Scanner(System.in);
    private ArrayList<Carta> cartas;
    private ArrayList<Carta> monton;

    public Baraja() {
        cartas = new ArrayList();
        monton = new ArrayList();
        for (Palo aux : Palo.values()) {
            for (int i = 1; i <= 12; i++) {
                if ( i!=8 && i!=9 ) {
                    cartas.add(new Carta(i, aux));
                }
            }
        }
        
    }
    
    public void barajear(){
        Collections.shuffle(cartas);
    }
    
    public Carta siguienteCarta(){
        Carta carta = null;
        if (monton.size()>=40) {
            System.out.println("No hay mas Cartas en la Baraja :(");
            return null;
        }
        
        for (int i = 0; i < cartas.size() ; i++) {
            if( i > monton.size() ){
                carta = cartas.get(i);
                i = cartas.size();
            }
        }
        return carta;
    }
    
    public void cartasDisponibles(){
        System.out.println("Quedan " + (cartas.size()-monton.size()) + " cartas disponibles en la baraja");
    }
    
    public ArrayList<Carta> darCartas(){
        ArrayList<Carta> c = new ArrayList();
        int m = monton.size();
        System.out.println("ingrese la cantidad de cartas que decea:");
        int cant = leer.nextInt();
        
        if (cant>(40-m)) {
            System.out.println("no hay suficientes cartas disponibles en la baraja");
        }else{
            for (int i = 0; i < m+cant ; i++) {
            c.add(cartas.get(i));
            monton.add(cartas.get(i));
        }
        }
        
        
        
        return c;
    }
    
    public void cartasMonton(){
        
        if (monton.size()==0) {
            System.out.println("todavia no se a sacado ninguna carta");
        }else {
            for (Carta carta : monton) {
                System.out.println(carta);
            }
        }
        
    }
    
    public void mostrarBaraja(){
        int cont=0;
        for (int i = monton.size() ; i < cartas.size() ; i++) {
            cont++;
            System.out.println(cartas.get(i)+" "+cont);
        
        }
    }
    
    
}
