/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.Arrays;

/**
 *
 * @author owen0
 */
public class ArreglosServicio {
    public void inicializarA(double[] a){
        for (int i = 0; i < a.length ; i++) {
            a[i]= (Math.random()*10);
        }
        
    }
    public void mostrar(double[] a){
        System.out.println("=================");
        for (int i = 0; i < a.length ; i++) {
            System.out.println(a[i]);
        }
        System.out.println("=================");
    }
    
    public void ordenar(double[] a){
        double[] b=new double[50];
       
        Arrays.sort(a);
        for (int i = 0; i < a.length ; i++) {
         b[i] = a[a.length-1-i];
         
        }
        
        for (int i = 0; i < a.length; i++) {
            a[i]=b[i];
        }
        
        
    }
    
    public void inicializarB(double[] a,double[] b){
        for (int i = 0; i < b.length; i++) {
            
            if(i<10){
                b[i]=a[i];
            }else{
                b[i]=0.5;
            }
            
        }
        
    }
}
