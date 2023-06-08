
import extra3.Alojamiento;
import extra3.HotelCincoEstrellas;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author owen0
 */
public class ejem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Alojamiento> alo = new ArrayList();
        HotelCincoEstrellas ht = new HotelCincoEstrellas();
        alo.add(ht);
        for (Alojamiento alojamiento : alo) {
            System.out.println(alojamiento.getClass());
        }
   
        
    }
    
}
