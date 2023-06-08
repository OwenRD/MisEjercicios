/*
 • Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de
Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones.
Los gimnasios pueden ser clasificados por la empresa como de tipo “A” o de tipo “B”, de
acuerdo a las prestaciones observadas. Las limosinas están disponibles para cualquier
cliente, pero sujeto a disponibilidad, por lo que cuanto más limosinas tenga el hotel, más caro
será.
 */
package extra3;

import java.util.Scanner;

/**
 *
 * @author owen0
 */
public class HotelCincoEstrellas extends HotelCuatroEstrellas{
    
    protected int  cantSalConf, cantSuit, cantLimo;
    protected String id="ht"; 
    
    public HotelCincoEstrellas() {
//        iniciar();
//        Scanner leer = new Scanner(System.in);
//        System.out.println("Ingrese el Nombre del Alojamiento: ");
//        this.nombre = leer.next();
//        System.out.println("Ingrese la Localidad: ");
//        this.localidad = leer.next();
//        System.out.println("Ingrese el nombre del Gerente: ");
//        this.gerente = leer.next();
//============================================================================================        
        setCantPisos();
        setCantHabitaciones();
        setCapRestaurante();
        int rest = 0;
        if(this.capRestaurante<30){
            rest = 10;
        }else if(this.capRestaurante>29 && this.capRestaurante<51){
            rest = 30;
        }else if(this.capRestaurante>50){
            rest = 50;
        }
        setGimnasio();
        int gim = 0;
        if (this.gimnasio.equalsIgnoreCase("A")) {
            gim = 50;
        }else if(this.gimnasio.equalsIgnoreCase("B")){
            gim = 30;
        }
        setCantLimo();
        
        setPrecioHabitaciones((1*this.cantHabitaciones), rest, gim, (15 * this.cantLimo));
//============================================================================================
    }

    public HotelCincoEstrellas(int cantSalConf, int cantSuit, int cantLimo, int capRestaurante, String gimnasio, int cantHabitaciones, int numCamas, int cantPisos, double precioHabitaciones, String nombre, String localidad, String gerente) {
        super(capRestaurante, gimnasio, cantHabitaciones, numCamas, cantPisos, precioHabitaciones, nombre, localidad, gerente);
        this.cantSalConf = cantSalConf;
        this.cantSuit = cantSuit;
        this.cantLimo = cantLimo;
    }

    public int getCantSalConf() {
        return cantSalConf;
    }

    public void setCantSalConf(int cantSalConf) {
        this.cantSalConf = cantSalConf;
    }

    public int getCantSuit() {
        return cantSuit;
    }

    public void setCantSuit(int cantSuit) {
        this.cantSuit = cantSuit;
    }

    public int getCantLimo() {
        return cantLimo;
    }

    public void setCantLimo() {
        int aux = (int) (Math.random() * 10 + 5);
        
        this.cantLimo = aux;
    }

    public String getId() {
        return id;
    }

    
    
    @Override
    public String toString() {
        System.out.println(super.toString());
        return "HotelCincoEstrellas{" + "cantSalConf=" + cantSalConf + ", cantSuit=" + cantSuit + ", cantLimo=" + cantLimo + '}';
    }
    
    
    
}
