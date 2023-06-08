/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra3;

/**
 *
 * @author owen0
 */
public class Residencias extends Extrahotelero{
    
    protected int cantHabitaciones;
    protected boolean desc, campoDepo;
    protected String id="re";
    
    public Residencias() {
        iniciar();
        
        setMtsCuadrado();
        setPrivado();
        setCantHabitaciones();
        setDesc();
        setCampoDepo();
    }

    public Residencias(int cantHabitaciones, boolean desc, boolean campoDepo, boolean privado, double mtsCuadrado, String nombre, String localidad, String gerente) {
        super(privado, mtsCuadrado, nombre, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.desc = desc;
        this.campoDepo = campoDepo;
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public boolean isDesc() {
        return desc;
    }

    public boolean isCampoDepo() {
        return campoDepo;
    }

    public void setCantHabitaciones() {
        this.cantHabitaciones = (int) (Math.random() * 20 + 10);
    }

    public void setDesc() {
        int aux = (int) (Math.random() * 3);
        
        if (aux==2) {
            this.desc = true;
        }else{
            this.desc = false;
        }
    }

    public void setCampoDepo() {
        int aux = (int) (Math.random() * 3);
        
        if (aux==2) {
            this.campoDepo = true;
        }else{
            this.campoDepo = false;
        }
    }

    public String getId() {
        return id;
    }
    
    

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Residencias{" + "cantHabitaciones=" + cantHabitaciones + ", desc=" + desc + ", campoDepo=" + campoDepo + '}';
    }

    
    
}
