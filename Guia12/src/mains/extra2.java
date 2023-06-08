/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mains;

/**
 *
 * @author owen0
 */
public class extra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Por último, en el main vamos a crear un ArrayList de tipo Edificio.
         * El ArrayList debe contener dos polideportivos y dos edificios de
         * oficinas. Luego, recorrer este array y ejecutar los métodos
         * calcularSuperficie y calcularVolumen en cada Edificio. Se deberá
         * mostrar la superficie y el volumen de cada edificio.
         */
        int cont = 0, conf = 0;
        List<Edificio> edi = new ArrayList();
        Polideportivo poli1 = new Polideportivo("Poli1", true, 20, 30, 20);
        Polideportivo poli2 = new Polideportivo("Poli2", false, 30, 40, 15);
        EdificioDeOficinas edif1 = new EdificioDeOficinas(50, 60, 3);
        EdificioDeOficinas edif2 = new EdificioDeOficinas(40, 70, 3);
        edi.add(poli1);
        edi.add(poli2);
        edi.add(edif1);
        edi.add(edif2);
        
    }
}
