/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import clases.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author owen0
 */
public class PersonaServicio {
    Scanner leer = new Scanner(System.in);
    public Persona crearPersona(){
        
        System.out.print("ingrese su nombre:");
        String nombre = leer.next();
        
        System.out.print("ingrese su año de nacimiento:");
        int anio = leer.nextInt();
        
        System.out.print("ingrese su mes de nacimineto:");
        int mes = leer.nextInt();
        
        System.out.print("ingrese su dia de nacimineto:");
        int dia = leer.nextInt();
        
        Date fechaNacimiento = new Date(anio-1900, mes-1, dia);
        
        
        return new Persona(nombre, fechaNacimiento);
    }
    
    public int calcularEdad(Persona p){
        Date fechaActual = new Date();
        int edad = fechaActual.getYear() - p.getFechaNacimiento().getYear();
        
        System.out.println("Su edad es: "+edad);
       return edad;
    }
    
    public boolean menorQue(Persona p, int edad){
        boolean flag=false;
        int edad1= calcularEdad(p);
        if(edad1<edad){
            flag = true;
        }
        
        return flag;
    }
    
    public void mostrarPersona(Persona p){
        System.out.println("Nombre:"+p.getNombre() );
        System.out.println("Fceha de Nacimineto:"+p.getFechaNacimiento() );
        System.out.println("Edad:"+calcularEdad(p) );
    }

    
    
    
}
