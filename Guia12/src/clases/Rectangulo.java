/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**

rea rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
 */
public class Rectangulo implements calculosFormas{
    
    private double area, perimetro;
    private double base=3, altura=6;

    public Rectangulo() {
    }

    
    
    @Override
    public void calcularArea() {
       this.area = this.base * this.altura;
    }

    @Override
    public void calcularPerimetro() {
        this.perimetro = (this.base + this.altura) * 2;
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

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "area=" + area + ", perimetro=" + perimetro + ", base=" + base + ", altura=" + altura + '}';
    }
    
    
}
