/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author owen0
 */
public class Ahorcado {
    
    public char[] palabra;
    public int jugadasMax, letrasEnc;

    public char[] getPalabra() {
        return palabra;
    }

    public void setPalabra(char[] palabra) {
        this.palabra = palabra;
    }

    public int getJugadasMax() {
        return jugadasMax;
    }

    public void setJugadasMax(int jugadasMax) {
        this.jugadasMax = jugadasMax;
    }

    public int getLetrasEnc() {
        return letrasEnc;
    }

    public void setLetrasEnc(int letrasEnc) {
        this.letrasEnc = letrasEnc;
    }

    public Ahorcado() {
    }

    public Ahorcado(char[] palabra, int jugadasMax, int letrasEnc) {
        this.palabra = palabra;
        this.jugadasMax = jugadasMax;
        this.letrasEnc = letrasEnc;
    }
    
    
}
