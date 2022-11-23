/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication52;

import java.util.Scanner;

/**
 *
 * @author semo3415
 */
public class JavaApplication52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        int numero1;
        int numero2;
        int numero3;
        int mayor;
        System.out.println("Escribe el primer numero");
        numero1=sc.nextInt();
        System.out.println("Escribe el segundo numero");
        numero2=sc.nextInt();
        System.out.println("Escribe el tecero numero");
        numero3=sc.nextInt();
        mayor=numeromayor(numero1,numero2);
        System.out.println("El numero mayor es "+mayor);
        mayor=numeromayor(mayor,numero3);
        System.out.println("El numero mas grande es"+mayor);
        
        
        
        
    }
    
    
    public static int numeromayor(int numero1,int numero2){
    int mayor;
    if(numero1>numero2){
       
       
        mayor=numero1;
        
    }
    
    
    else{
    mayor=numero2;
    
    }
        return mayor;
    }
    
}
