/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import clases.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author owen0
 */
public class AlumnoServicio {

    ArrayList<Alumno> alumnos = new ArrayList();
    Scanner leer = new Scanner(System.in);

    public void crearAlumno() {
        Integer nota;
        String nombre, res;
        boolean flag=true;
        do {

            System.out.println("ingrese el nombre del alumno");
            nombre = leer.next();

            ArrayList<Integer> notas = new ArrayList();

            System.out.println("ingrese la primera nota");
            nota = leer.nextInt();
            notas.add(nota);

            System.out.println("ingrese la segunda nota");
            nota = leer.nextInt();
            notas.add(nota);

            System.out.println("ingrese la tercera nota");
            nota = leer.nextInt();
            notas.add(nota);

            alumnos.add(new Alumno(nombre, notas));

            System.out.println("decea ingresar otro alumno? y/n");
            res = leer.next();
            if(res.equals("n")){
                flag=false;
            }
            
        } while (flag);

    }
    
    public double notaFinal(){
        System.out.println("ingrese el alumno para calcular la nota final");
        String alumn = leer.next();
        //double prom;
        
        for (Alumno alumno : alumnos) {
            if(alumno.getNombre().equals(alumn)){
                System.out.println("alumno encontrado");
                ArrayList<Integer> aux = alumno.getNotas();
                
                return((aux.get(0) + aux.get(1) + aux.get(2)) / 3);
                
               // System.out.println("el promedio del alumno "+ alumn +" es: "+ prom);
            }
        }
        return 0;
        
        
    }
}
