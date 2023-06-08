/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author owen0
 */
public class Voto {

private Alumno votador;
private ArrayList<Alumno> votados;

    public Voto() {
        votados = new ArrayList();
    }

    public Voto(Alumno votador, ArrayList<Alumno> votados) {
        this.votador = votador;
        this.votados = votados;
    }

    
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.votador);
        hash = 23 * hash + Objects.hashCode(this.votados);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Voto other = (Voto) obj;
        if (!Objects.equals(this.votador, other.votador)) {
            return false;
        }
        if (!Objects.equals(this.votados, other.votados)) {
            return false;
        }
        return true;
    }
    


}
