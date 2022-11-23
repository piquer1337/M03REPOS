/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej5;

import java.util.Scanner;

/**
 *
 * @author semo3415
 */
public class Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        float km=1852;
        System.out.println("Inserta los kilometros que quieras pasar a millas");
        float millas=sc.nextFloat();
        float resul= km*millas;
        System.out.println("El resultado es: " + resul);
        
        // TODO code application logic here
    }
    
}
