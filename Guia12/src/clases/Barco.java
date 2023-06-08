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
public class Barco {
    
    protected String matricula, yearFabricacion;
    protected double eslora;

    public Barco() {
    }

    public Barco(String matricula, String yearFabricacion, double eslora) {
        this.matricula = matricula;
        this.yearFabricacion = yearFabricacion;
        this.eslora = eslora;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getYearFabricacion() {
        return yearFabricacion;
    }

    public void setYearFabricacion(String yearFabricacion) {
        this.yearFabricacion = yearFabricacion;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }
    
    
}
