/*
 • Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Precio de las Habitaciones.
 */
package extra3;

/**
 *
 * @author owen0
 */
public class HotelCuatroEstrellas extends Hotel{
    
    protected int capRestaurante;
    protected String gimnasio, id="ht";
    

    public HotelCuatroEstrellas() {
        iniciar();
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
        
        
        setPrecioHabitaciones((1*this.cantHabitaciones), rest, gim, 0);
        
    }

    public HotelCuatroEstrellas(int capRestaurante, String gimnasio, int cantHabitaciones, int numCamas, int cantPisos, double precioHabitaciones, String nombre, String localidad, String gerente) {
        super(cantHabitaciones, numCamas, cantPisos, precioHabitaciones, nombre, localidad, gerente);
        this.capRestaurante = capRestaurante;
        this.gimnasio = gimnasio;
    }

    public int getCapRestaurante() {
        return capRestaurante;
    }

    public void setCapRestaurante() {
        int aux = (int) (Math.random() * 60);
        
        this.capRestaurante = aux;
    }

    public String getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio() {
        int aux = (int) (Math.random() * 3);
        
        if (aux==2) {
            this.gimnasio = "A";
        }else{
            this.gimnasio = "B";
        }
    }

    public String getId() {
        return id;
    }
    
    

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "HotelCuatroEstrellas{" + "capRestaurante=" + capRestaurante + ", gimnasio=" + gimnasio + '}';
    }

    

    
    
    
    
}
