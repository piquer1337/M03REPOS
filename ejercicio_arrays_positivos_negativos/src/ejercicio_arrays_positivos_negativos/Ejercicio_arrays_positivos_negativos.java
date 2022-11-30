/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_arrays_positivos_negativos;

import java.util.Scanner;

/**
 *
 * @author semo3415
 */
public class Ejercicio_arrays_positivos_negativos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int MAX=6;
        int valor;
        int[]nums= new int[MAX];
        Scanner sc= new Scanner(System.in);
        System.out.println("Pon valores");
        for (int i = 0; i < nums.length; i++) {
            
            System.out.print("Introduce valor");
            nums[i]=sc.nextInt();
            nums[i]=valor;
            
            
        }
        System.out.println("Muestro array");
       
        
    }
    
}
