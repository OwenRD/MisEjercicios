/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra3;

/**
 En contraste, los Alojamientos Extra hoteleros proveen servicios diferentes a los de los
hoteles, estando más orientados a la vida al aire libre y al turista de bajos recursos. Por cada
Alojamiento Extrahotelero se indica si es privado o no, así como la cantidad de metros
cuadrados que ocupa. Existen dos tipos de alojamientos extrahoteleros: los Camping y las
Residencias. Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños
disponibles y si posee o no un restaurante dentro de las instalaciones. Para las residencias se
indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no
campo deportivo. Realizar un programa en el que se representen todas las relaciones
descriptas.
 * @author owen0
 */
public class Extrahotelero extends Alojamiento{
    
    protected boolean privado;
    protected double mtsCuadrado;

    public Extrahotelero() {
    }

    public Extrahotelero(boolean privado, double mtsCuadrado, String nombre, String localidad, String gerente) {
        super(nombre, localidad, gerente);
        this.privado = privado;
        this.mtsCuadrado = mtsCuadrado;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado() {
        int aux = (int) (Math.random() * 3);
        
        if(aux ==2){
            this.privado = true;
        }else{
            this.privado = false;
        }
    }

    public double getMtsCuadrado() {
        return mtsCuadrado;
    }

    public void setMtsCuadrado() {
        this.mtsCuadrado = (int) (Math.random() * 100 + 50);
    }

    @Override
    public String toString() {
        System.out.print("<INFORMACION> ");
        System.out.println(super.toString());
        return "Extrahotelero{" + "privado=" + privado + ", mtsCuadrado=" + mtsCuadrado + '}';
    }

    
    
    
    
}
