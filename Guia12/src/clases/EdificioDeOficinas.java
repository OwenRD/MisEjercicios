/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;

/**
 *
 * @author AldiLee
 */
public class EdificioDeOficinas extends Edificio {

    private int numOfi;
    private int cantPersXOfi;
    private int cantPisos;
    private Scanner leer = new Scanner(System.in);

    public EdificioDeOficinas(int numOfi, int cantPersXOfi, int cantPisos, double ancho, double largo, double alto) {
        super(ancho, largo, alto);
        this.numOfi = numOfi;
        this.cantPersXOfi = cantPersXOfi;
        this.cantPisos = cantPisos;
    }

    public EdificioDeOficinas(double ancho, double largo, double alto) {
        super(ancho, largo, alto);
    }

    @Override
    public void calcularSuperficie() {
        System.out.println("superficie oficinas: " + ((ancho * largo) * cantPisos));
    }

    @Override
    public void calcularVolumen() {
        System.out.println("volumen oficinas: " + ((ancho * largo * alto) * cantPisos));
    }

    /**
     * De esta clase nos interesa saber cuántas personas pueden trabajar en todo
     * el edificio, el usuario dirá cuántas personas entran en cada oficina,
     * cuantas oficinas y el número de piso (suponiendo que en cada piso hay una
     * oficina). Crear el método cantPersonas(), que muestre cuantas personas
     * entrarían en un piso y cuantas en todo el edificio.
     */
    public void cantPersonas() {

        System.out.println("Cuantas personas entran en cada oficina?");
        cantPersXOfi = leer.nextInt();
        System.out.println("Cuantas ofis entran en cada piso?");
        numOfi = leer.nextInt();
        System.out.println("Cuantos pisos tiene el edificio?");
        cantPisos = leer.nextInt();
        int pers = cantPersXOfi * numOfi * cantPisos;
        System.out.println("en un piso entran " + pers + " personas.");

    }
}
