/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;


import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author santi
 */
public class Meses {
    public String[] mes={"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
    public String MesSecreto;

    public void Meses() {
      
         
    }
    
    public void adivinar(){
           Random rm=new Random();
           this.MesSecreto=mes[rm.nextInt(11)];
        System.out.println(MesSecreto);
        Scanner leer = new Scanner(System.in);
        String mesUsuario;

        do {

            System.out.println("escriba un mes en minusculas");
            mesUsuario = leer.next();

            if (mesUsuario.equals(MesSecreto)==false) {
                System.out.println("fallaste vuelve a intentar");
            }
        } while (mesUsuario.equals(MesSecreto)==false);
        System.out.println("Adivinaste el mes era: " + MesSecreto);

    }

    

}
