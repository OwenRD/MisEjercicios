/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import clases.Curso;
import java.util.Scanner;
import servicios.cursoService;

/**
 *
 * @author owen0
 */
public class ejer6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        cursoService sv = new cursoService();
        Curso c1 = sv.crearCurso();
        
        System.out.println(sv.calcularGananciaSemanal(c1));
    }
    
}
