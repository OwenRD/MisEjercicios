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
public class Camping extends Extrahotelero{
    
    protected int capCarp, cantBan;
    protected boolean restaurante;
    protected String id="ca";
    
    public Camping() {
        iniciar();
        
        setMtsCuadrado();
        setPrivado();
        setCapCarp();
        setCantBan();
        setRestaurante();
    }

    public Camping(int capCarp, int cantBan, boolean restaurante, boolean privado, double mtsCuadrado, String nombre, String localidad, String gerente) {
        super(privado, mtsCuadrado, nombre, localidad, gerente);
        this.capCarp = capCarp;
        this.cantBan = cantBan;
        this.restaurante = restaurante;
    }

    public int getCapCarp() {
        return capCarp;
    }

    public int getCantBan() {
        return cantBan;
    }

    public boolean isRestaurante() {
        return restaurante;
    }

    public void setCapCarp() {
        this.capCarp = (int) (Math.random() * 40 + 20);
    }

    public void setCantBan() {
        this.cantBan = (int) (Math.random() * 10 + 5);
    }

    public void setRestaurante() {
        int aux = (int) (Math.random() * 3);
        
        if (aux==2) {
            this.restaurante = true;
        }else{
            this.restaurante = false;
        }
    }

    public String getId() {
        return id;
    }
    
    

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Camping{" + "capCarp=" + capCarp + ", cantBan=" + cantBan + ", restaurante=" + restaurante + '}';
    }
    
    
    
}
