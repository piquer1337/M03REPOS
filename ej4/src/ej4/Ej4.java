/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej4;

import java.util.Scanner;

/**
 *
 * @author semo3415
 */
public class Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner sc= new Scanner(System.in);
        float radio;
        float pi=(float) 3.14;
        System.out.println("Introduce el radio");
        radio=sc.nextFloat();
        
        float diam = radio+radio;
        float longi = pi*diam;
        float area = pi*radio*radio;
        System.out.println("La longitud es " + longi);
        System.out.println("La area es: " + area);
        
        
    }
    
}
