/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import clases.Cadena;
import java.util.Arrays;

/**
 *
 * @author owen0
 */
public class CadenaServicio {

    public void mostrarVocales(Cadena f) {
        int cont = 0;
        for (int i = 0; i < f.getFrase().length(); i++) {
            switch (f.getFrase().toLowerCase().charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    cont++;
                    break;

                default:
                    break;
            }
        }
        System.out.println("la cantidad de vocales es:" + cont);
    }

    public void invertirFrase(Cadena f) {
        for (int i = f.getFrase().length() - 1; i >= 0; i--) {
            System.out.print(f.getFrase().charAt(i));
        }
        System.out.println("");
    }

    public void vecesRepetido(char l, Cadena c) {
        char[] ch = c.getFrase().toCharArray();
        int cont = 0;
        for (int i = 0; i < c.getLongitud(); i++) {

            if (ch[i] == l) {
                cont++;
            }
        }

        System.out.println("contiene " + cont + " " + l);
    }

    public void compararLongitud(String f, Cadena c) {
        if (f.length() > c.getLongitud()) {
            System.out.println("la frase ingresada tiene mayor longitud que: " + c.getFrase());
        } else if (f.length() == c.getLongitud()) {
            System.out.println("Las frases contienen la misma longitud");
        } else {
            System.out.println("la frse ingresada tiene menor longitud que: " + c.getFrase());
        }
    }

    public void unirFrase(String f, Cadena c) {
        System.out.println(c.getFrase() + " " + f);
    }

    public void reemplazarFrase(String l, Cadena c) {
        char[] ch = c.getFrase().toCharArray();
        for (int i = 0; i < c.getLongitud(); i++) {
            if (ch[i] == 'a') {
                System.out.print(l);
            } else {
                System.out.print(ch[i]);
            }
        }
        System.out.println("");
    }

    public boolean contiene(char l, Cadena c) {
        char[] ch = c.getFrase().toCharArray();
        for (int i = 0; i < c.getLongitud(); i++) {
            if (ch[i] == l) {
                return true;
            }
        }
        return false;
    }
}
