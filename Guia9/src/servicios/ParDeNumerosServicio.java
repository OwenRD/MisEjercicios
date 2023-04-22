/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import clases.ParDeNumeros;

/**
 *
 * @author owen0
 */
public class ParDeNumerosServicio {
    public void mostrarValores(ParDeNumeros n1) {
        System.out.println("El primer numero es: " + n1.getNum1());
        System.out.println("El segundo numero es: " + n1.getNum2());
    }

    public int devolverMayor(ParDeNumeros n1) {
        if (n1.getNum1() >= n1.getNum2()) {
            return (int) n1.getNum1();

        } else {
            return (int) n1.getNum2();
        }
    }

    public void calcularPotencia(ParDeNumeros n1) {
        System.out.println("La potencia del n° mayor por el menor seria: ");
        int numA = (int) n1.getNum1();
        int numB = (int) n1.getNum2();
        if (n1.getNum1() >= n1.getNum2()) {
            System.out.println(numA + "^" + numB + "=" + Math.pow(numA, numB));
        } else {
            System.out.println(numB + "^" + numA + "=" + Math.pow(numB, numA));
        }
    }

    public void calculaRaiz(ParDeNumeros n1) {
        System.out.println("La raiz cuadrada del menor n° seria: ");
        double numA = Math.abs(n1.getNum1());
        double numB = Math.abs(n1.getNum2());
        if (n1.getNum1() <= n1.getNum2()) {
            System.out.println("√" + numA + "=" + Math.sqrt(numA));
        } else {
            System.out.println("√" + numB + "=" + Math.sqrt(numB));
        }
    }
}
