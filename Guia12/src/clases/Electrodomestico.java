package clases;

import ENUM.Color;
import ENUM.Letras;
import java.util.Scanner;

/**
 *
 * @author owen0
 */
public class Electrodomestico {

    Scanner leer = new Scanner(System.in);

    protected int precio;
    protected String color;
    protected char consumoEnergetico;
    protected int peso;

    public Electrodomestico() {
    }

    public Electrodomestico(int precio, String color, char consumoEnergetico, int peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void comprobarConsumoEnergetico(char l) {
        int cont = 0;
        for (Letras aux : Letras.values()) {
            if (String.valueOf(aux).equals(String.valueOf(l))) {
                cont++;
                
            }
        }
        if (cont == 0) {
            this.consumoEnergetico = 'F';
        }
    }

    public void comprobarColor(String c) {
        int cont = 0;
        
        for (Color aux : Color.values()) {
            if (aux.toString().equals(c)) {
                cont++;
            }
        }
        if (cont == 0) {
            this.color = "BLANCO";
        }
    }

    public void crearElectrodomestico() {
        setPrecio(1000);
       
        System.out.println("ingrse el color del electrodomestico: ");
        setColor(leer.next().toUpperCase());
        
        comprobarColor(getColor());
        
        System.out.println("ingrese el consumo energetico: ");
        setConsumoEnergetico(leer.next().toUpperCase().charAt(0));
        
        comprobarConsumoEnergetico(getConsumoEnergetico());
        
        System.out.println("ingrse el peso del electrodomestico: ");
        setPeso(leer.nextInt());
        

    }

    public void precioFinal() {
        int plus = 0;

        switch (getConsumoEnergetico()) {
            case 'A':
                plus+=1000;
                break;
            case 'B':
                plus+=800;
                break;
            case 'C':
                plus+=600;
                break;
            case 'D':
                plus+=500;
                break;
            case 'E':
                plus+=300;
                break;
            case 'F':
                plus+=100;
                break;
        }
//Entre 1 y 19 kg $100
//Entre 20 y 49 kg $500
//Entre 50 y 79 kg $800
//Mayor que 80 kg $1000
        if(getPeso()<=19){
            plus+=100;
        }else if(getPeso()>19 && getPeso()<50 ){
            plus+=500;
        }else if(getPeso()>49 && getPeso()<80){
            plus+=800;
        }else if(getPeso()>79){
            plus+=1000;
        }
        
        setPrecio(this.precio+plus);
    }
}
