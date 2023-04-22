/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.Date;
import servicios.FechaServicio;

/**
 *
 * @author owen0
 */
public class ejer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FechaServicio sv = new FechaServicio();
        Date fecha = sv.fechaNacimiento();
        Date fechaActual = sv.fechaActual();
        
        sv.diferencia(fecha, fechaActual);
        
    }
    
}
