/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import ENUM.Color;

/**
 *
 * @author owen0
 */
public class Lavadora extends Electrodomestico{
    
    private int carga;

    public Lavadora() {
    }

    public Lavadora(int carga, int precio, String color, char consumoEnergetico, int peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

   public void crearLavadora(){
       crearElectrodomestico();
       System.out.println("ingrese la carga de la lavadora: ");
       setCarga(leer.nextInt());
   }
   
   public void precioFinal(){
       super.precioFinal();
       
       if(getCarga()>30){
           setPrecio(super.precio+=500);
       }
   }

    @Override
    public String toString() {
        return " carga: "+ carga +
                " consumoEnergetico: "+ super.consumoEnergetico + 
                " color: "+ super.color +
                " peso: "+ super.peso +
                " precio: "+ super.precio;
    }
   
   
    
   
    
}
