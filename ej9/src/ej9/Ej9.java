/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej9;

import java.util.Scanner;

/**
 *
 * @author semo3415
 */
public class Ej9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        int num1;
        
        System.out.println("Pon un numero");
        num1=sc.nextInt();
        
        if(num1>=0){
            
            System.out.println("El resultado es positivo");
        }
        
        else {
            System.out.println("El resultado es negativo");
        }
        
        
    }
    
}
