/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici3;

import java.util.Scanner;

/**
 *
 * @author semo3415
 */
public class Exercici3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double lado;
        
        System.out.println("Pon la longitud del lado");
        lado = sc.nextDouble(); //esto lee desde el teclado un entero y asigna la variable lado
        double area = lado*lado;
        System.out.println("El lado mide " + lado);
        System.out.println("El area mide" + area);
        
    }
    
}
