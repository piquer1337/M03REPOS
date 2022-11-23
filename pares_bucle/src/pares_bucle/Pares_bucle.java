/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pares_bucle;

import java.util.Scanner;

/**
 *
 * @author semo3415
 */
public class Pares_bucle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        int minimo;
        int maximo;
        System.out.println("Pon el minimo");
        minimo=sc.nextInt();
        System.out.println("Pon el maximo");
        maximo=sc.nextInt();
        
        for (int i = minimo; i ==maximo; i++) {
            
            if(i%2==0){
                System.out.println(i+"El numero es par");
            
            }
            
        }
        
        
    }
    
}
