/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import clases.Alumno;
import clases.Voto;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author owen0
 */
public class Simulador {
    Scanner sc = new Scanner(System.in);
    ArrayList<Alumno> alumnos;
    ArrayList<Integer> dnis;
    ArrayList<String> nombres;

    public Simulador() {
        this.alumnos = new ArrayList();
        this.dnis = new ArrayList();
        this.nombres = new ArrayList();
    }
    
    public void nombres(){
        
        nombres.add("Francisco"); 
        nombres.add("Facundo"); 
        nombres.add("Brandon"); 
        nombres.add("Lucas"); 
        nombres.add("Rodrigo"); 
        nombres.add("Brisa"); 
        nombres.add("Valentina"); 
        nombres.add("Cristina"); 
        nombres.add("Roxana"); 
        nombres.add("Claudia"); 
        
        nombres.add("Salas");
        nombres.add("Vila");
        nombres.add("Calderon");
        nombres.add("Rodrigez");
        nombres.add("Sauzedo");
        nombres.add("Diaz");
        nombres.add("Lobo");
        nombres.add("Torres");
        nombres.add("Barriga");
        nombres.add("Ruiz");
        
    }
  
    public ArrayList<String> crearNombre(int num){
        nombres();
        ArrayList<String> nombre = new ArrayList();
        
        for (int i = 0; i < num; i++) {
        nombre.add(nombres.get((int)(Math.random()*10))+" "+nombres.get((int)(Math.random()*10)+10));    
        }
        
        return nombre;
    }
    
    public ArrayList<Integer> crearDni(int num){
        ArrayList<Integer> dni = new ArrayList();
        
        for (int i = 0; i < num; i++) {
            
            dni.add((int)(Math.random()*100000000));
            
        }
        
        return dni;
    }
    
    public void crearAlumno(){
        System.out.println("Ingree la cantidad de alumnos:");
        int num = sc.nextInt();
        
        ArrayList<String> nom = crearNombre(num);
        
        dnis = crearDni(num);
        
        for (int i = 0; i < num; i++) {
            
            alumnos.add(new Alumno(nom.get(i), dnis.get(i), 0));
            
        }
        System.out.println("Lista de Alumnos:");
        mostrar();
    }
    
    public void mostrar(){
        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }
    }
    
    public void votacion(){
        
        HashSet<Voto> voto = new HashSet();
        
        for (int i = 0; i < alumnos.size() ; i++) {
            voto.add(new Voto(alumnos.get(i), null));
        }
        
    }
    
    
}
