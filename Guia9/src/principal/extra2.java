/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import clases.Ahorcado;
import servicios.AhorcadoServicio;

/**
 *
 * @author owen0
 */
public class extra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AhorcadoServicio sv = new AhorcadoServicio();
        Ahorcado juego = sv.crearJuego();
        
        sv.juego(juego);
        
    }
}
