/*
 * Un profesor particular está dando cursos para grupos de cinco alumnos y necesita 
un programa para organizar la información de cada curso. Para ello, crearemos una 
clase entidad llamada Curso, cuyos atributos serán: nombreCurso, cantidadHorasPorDia, 
cantidadDiasPorSemana, turno (mañana o tarde),  precioPorHora y alumnos. Donde 
alumnos es un arreglo de tipo String de dimensión 5 (cinco), donde se alojarán 
los nombres de cada alumno. A continuación, se implementarán los siguientes métodos:
1)Un constructor por defecto.
2)Un constructor con todos los atributos como parámetro.
3)Métodos getters y setters de cada atributo.
4)Método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos 
que asisten a las clases. Nosotros nos encargaremos de almacenar esta información 
en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese 
el nombre de cada alumno.
5)Método crearCurso(): el método crear curso, le pide los valores de los atributos 
al usuario y después se le asignan a sus respectivos atributos para llenar el 
objeto Curso. En este método invocamos al método cargarAlumnos() para asignarle 
valor al atributo alumnos
6)Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia 
en una semana por curso. Para ello, se deben multiplicar la cantidad de horas 
por día, el precio por hora, la cantidad de alumnos y la cantidad de días a la 
semana que se repite el encuentro.

 */
package clases;

import java.util.Scanner;

/**
 *
 * @author owen0
 */
public class Curso {
    Scanner leer = new Scanner(System.in);
    
    public String nombreCurso, turno;
    public int cantidadDiasPorSemana;
    public String[] alumnos = new String[5];
    public double cantidadHorasPorDia, presioPorHora;

    public Curso() {
    }

    public Curso(String nombreCurso,double cantidadHorasPorDia,int cantidadDiasPorSemana,String turno,double presioPorHora) {
        this.nombreCurso = nombreCurso;
        this.turno = turno;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.presioPorHora = presioPorHora;
    }

    @Override
    public String toString() {
        return "Curso{" + "leer=" + leer + ", nombreCurso=" + nombreCurso + ", turno=" + turno + ", cantidadDiasPorSemana=" + cantidadDiasPorSemana + ", alumnos=" + alumnos + ", cantidadHorasPorDia=" + cantidadHorasPorDia + ", presioPorHora=" + presioPorHora + '}';
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }

    public void setCantidadHorasPorDia(int cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

    public int getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }

    public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

    public double getPresioPorHora() {
        return presioPorHora;
    }

    public void setPresioPorHora(int presioPorHora) {
        this.presioPorHora = presioPorHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }
    
    
}
