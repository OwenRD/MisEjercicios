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
public class Circulo implements calculosFormas{

private double area, perimetro;
private double radio=3, diametro=6;

    public Circulo() {
    }



    @Override
    public void calcularArea() {
       this.area = pi * Math.pow(this.radio, 2); 
    }

    @Override
    public void calcularPerimetro() {
       this.perimetro = pi * this.diametro;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    @Override
    public String toString() {
        return "Circulo{" + "area=" + area + ", perimetro=" + perimetro + ", radio=" + radio + ", diametro=" + diametro + '}';
    }

    
}
