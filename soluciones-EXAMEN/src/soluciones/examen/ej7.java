/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soluciones.examen;

import java.util.Scanner;

/**
 *
 * @author semo3415
 */
public class ej7 {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Escribe el ancho");
        double ancho=sc.nextDouble();
        
        System.out.println("Escribe el alto");
        double alto=sc.nextDouble();
        
        double perimetro=perimetroRectangulo(ancho,alto);
        double area=areaRectangulo(ancho,alto);
        System.out.println("El area es :"  +area+"y el perimetro es :" +perimetro);
        
        
        
        
        
        
    }
    public static double perimetroRectangulo(double ancho, double alto){
    double perimetro =(ancho*2)+(alto*2);
    return perimetro;
    
    
    }
     public static double areaRectangulo(double ancho, double alto){
    double area =ancho*alto;
    return area;
    
    
    }
    
    
    
    }
    
    
    
    
    
    
    

