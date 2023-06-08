/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import clases.Baraja;
import clases.Carta;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author owen0
 */
public class ejer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Baraja baraja = new Baraja();
        Scanner leer = new Scanner(System.in);

        int res;
        do {
            System.out.println("========MENU========\n"
                    + "1-Barajear\n"
                    + "2-Cartas Disponibles\n"
                    + "3-Dar Cartas\n"
                    + "4-Mostrar Monton\n"
                    + "5-Mostrar Baraja\n"
                    + "6-Salir");
            System.out.print(">");
            res = leer.nextInt();

            switch (res) {
                case 1:
                    baraja.barajear();
                    break;
                case 2:
                    baraja.cartasDisponibles();
                    break;
                case 3:
                    ArrayList<Carta> c = baraja.darCartas();
                    System.out.println("Sus cartas son:");
                    for (Carta aux : c) {
                        System.out.println(aux);
                    }
                    break;
                case 4:
                    baraja.cartasMonton();
                    break;
                case 5:
                    baraja.mostrarBaraja();
                    break;
                
            }
        } while (res != 6);
        System.out.println("FINALIZADO");
    }

}
