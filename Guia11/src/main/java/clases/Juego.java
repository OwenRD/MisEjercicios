/*
Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
Revolver
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.

10
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.ArrayList;

/**
 *
 * @author owen0
 */
public class Juego {
    
    private ArrayList<Jugador> jugadores;
    private Revolver revolver;
    
    public void llenarJuego(ArrayList<Jugador> jugadores, Revolver r){
       this.jugadores = jugadores;
       this.revolver = r;
    }
    
    public void ronda(){
        
        boolean flag=false;
        String nom;
        int id;
        
        for (int i = 0; i < jugadores.size() ; i++) {
            System.out.println(revolver);
            
            flag = jugadores.get(i).disparo(revolver);
            nom = jugadores.get(i).getNombre();
            id = jugadores.get(i).getId();
            System.out.println("================Disparo " + (i+1) + "================");
            if(flag){
                System.out.println("El Jugador " + nom + " " + id + " se a Mojado :(" );
            }else{
                System.out.println("Tambor del revolver vacio :)");
            }
            
            System.out.println("===============================================");
            
        }
        System.out.println(" ");
        System.out.println(revolver);
        
        
        
    }
    
}
