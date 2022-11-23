/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej7;

import java.util.Scanner;



/**
 *
 * @author semo3415
 */
public class Ej7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc= new Scanner(System.in);
        double num1;
        double num2;
        System.out.println("Escoge el primer número");
        num1=sc.nextDouble();
        System.out.println("Escoge el segundo");
        num2=sc.nextInt();
        double suma= num1+num2;
        double mult=num1*num2;
        double div=num1/num2;
        double dif=num1-num2;
        
        System.out.println("el resultado de la suma es" + suma);
        System.out.println("el resultado de la multi" + mult);
        if (num2!=0){
            
            div =num1/num2;
            System.out.println("división" + div);
        }
        else {
            System.out.println("El segundo numero no se puede dividir");
        }
    }

    
    }
    

