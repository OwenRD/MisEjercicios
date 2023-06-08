/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author owen0
 */
public class extra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        HotelCuatroEstrellas ht1 = new HotelCuatroEstrellas();
        HotelCincoEstrellas ht2 = new HotelCincoEstrellas();
        Camping ext1 = new Camping();
        Residencias ext2 = new Residencias();

        ArrayList<Alojamiento> alo = new ArrayList();
        alo.add(ht1);
        alo.add(ht2);
        alo.add(ext1);
        alo.add(ext2);
        int cont = 1;

        boolean flag = false;

        do {

            System.out.println("===MENU===");
            System.out.println("1. Ver todos los alojamientos");
            System.out.println("2. Ver hoteles del mas caro al mas barato");
            System.out.println("3. Ver los camping con restaurante");
            System.out.println("4. Ver las residencias con descuento");
            System.out.println("5. Salir");
            System.out.print(">");
            int re = leer.nextInt();

            switch (re) {
                case 1:
                    
                    for (Alojamiento alojamiento : alo) {
                        
                            System.out.println("=============" + cont + "==============");
                        System.out.println(alojamiento);
                        System.out.println("============================");
                        cont++;
                        
                    }
                    break;
                case 2:
                    
                    for (Alojamiento alojamiento : alo) {

                        if (alojamiento.getId()) {
                            System.out.println("=============" + cont + "==============");
                        System.out.println(alojamiento);
                        System.out.println("============================");
                        cont++;
                        }
                    }
                    break;
                case 3:
                    for (Alojamiento alojamiento : alo) {

                        System.out.println("=============" + cont + "==============");
                        System.out.println(alojamiento);
                        System.out.println("============================");
                        cont++;
                    }
                    break;
                case 4:
                    for (Alojamiento alojamiento : alo) {

                        System.out.println("=============" + cont + "==============");
                        System.out.println(alojamiento);
                        System.out.println("============================");
                        cont++;
                    }
                    break;
                case 5:
                    break;
            }

        } while (flag);

    }

}
