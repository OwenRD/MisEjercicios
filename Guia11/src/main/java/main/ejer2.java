/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import clases.Juego;
import clases.Jugador;
import clases.Revolver;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author owen0
 */
public class ejer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Juego j1 = new Juego();
        ArrayList<Jugador> jugadores = new ArrayList();
        int cont=0, id;
        String nom;
        
        do {
            System.out.print("ingrese su nombre:");
            nom = leer.next();
            System.out.print("ingrese el numero de jugador:");
            id = leer.nextInt();
            
            jugadores.add(new Jugador(nom, id));
            
            cont++;
        } while (cont<6);
        
        j1.llenarJuego(jugadores, new Revolver());
        
        j1.ronda();
    }
    
}
