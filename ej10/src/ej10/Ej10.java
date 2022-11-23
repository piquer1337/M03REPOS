/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej10;

import java.util.Scanner;

/**
 *
 * @author semo3415
 */
public class Ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Introduce el primer numero");
        num1=sc.nextInt();
        System.out.println("Introduce el segundo");
        num2=sc.nextInt();
        if(num1>num2){
            System.out.println("El primer numero es mayor");
            
            
        }
        else if(num1==num2){
                System.out.println("Los numeros son iguales");
            }
        else{
            System.out.println("El segundo numero es mayor");
        }
    }
    
}
