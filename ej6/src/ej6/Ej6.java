/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej6;

import java.util.Scanner;

/**
 *
 * @author semo3415
 */
public class Ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        int edad;
        System.out.println("Introduce la edad");
        edad=sc.nextInt();
        
        if (edad<18){
            System.out.println("Eres menor de edad");
                    }
        else {
            System.out.println("Eres mayor de edad, adelante");
             }
        
    }
    
}
