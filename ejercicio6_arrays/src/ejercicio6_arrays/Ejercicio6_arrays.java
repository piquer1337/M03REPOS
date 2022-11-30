/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6_arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author semo3415
 */
public class Ejercicio6_arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Pon tamaño n");
        int tamny=sc.nextInt();
        System.out.println("Pon valor array");
        int valor=sc.nextInt();
        int[]numeros= new int[tamny];
        
        for (int i = 0; i <numeros.length; i++) {
            numeros[i]=valor;
        }
        
        System.out.println(" Muestro array");
        
    }
    
    
    public class Arrays {
    
    public static void mostrarArray(int[]valores){
    for (int i = 0; i < valores.length; i++) {
            System.out.println("Posicio "+i+" Contiene -> "+valores[i]);
            
        }
    
    }
    }
}
