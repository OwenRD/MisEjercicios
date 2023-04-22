/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import clases.Curso;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class cursoService {
//   Método cargarAlumnos(): este método le permitirá al usuario 
//   ingresar los alumnos que asisten a las clases. Nosotros nos 
//   encargaremos de almacenar esta información en un arreglo e 
//   iterar con un bucle, solicitando en cada repetición que se 
//   ingrese el nombre de cada alumno. 

    public void cargarAlumnos(String[] alumnos) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese los Alumnos que asisten a Clases");
        System.out.println("---------------------------------------");
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el Alumno: " + "[" + (i + 1) + "]");
            alumnos[i] = input.next();
        }

    }
//      Método crearCurso(): el método crear curso, le pide los
//      valores de los atributos al usuario y después se le asignan 
//      a sus respectivos atributos para llenar el objeto Curso. En 
//      este método invocamos al método cargarAlumnos() para asignarle
//      valor al atributo alumnos

    public Curso crearCurso() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el Nombre del Curso");
        String nombreCurso = input.next();
        System.out.println("Ingrese la Cantidad de Horas Por Dia");
        double cantidadHorasPorDia = input.nextDouble();
        System.out.println("Ingresar la Cantidad de Dias Por Semana");
        int cantidadDiasPorSemana = input.nextInt();
        System.out.println("Ingrese el Turno");
        String Turno = input.next();
        System.out.println("Ingrese el Precio por Hora");
        double precioPorHora = input.nextDouble();
        String[] alumno2 = new String[5];
        cargarAlumnos(alumno2);
        
        return new Curso(nombreCurso,cantidadHorasPorDia,cantidadDiasPorSemana,Turno,precioPorHora);
    }
//    Método calcularGananciaSemanal(): este método se encarga de 
//    calcular la ganancia en una semana por curso. Para ello, se 
//    deben multiplicar la cantidad de horas por día, el precio por 
//    hora, la cantidad de alumnos y la cantidad de días a la semana 
//    que se repite el encuentro.
    
    public double calcularGananciaSemanal(Curso c){
        
        double flag = c.getCantidadHorasPorDia()*c.getPresioPorHora()*5*c.getCantidadDiasPorSemana();
        
        return flag;
    }

   
}
