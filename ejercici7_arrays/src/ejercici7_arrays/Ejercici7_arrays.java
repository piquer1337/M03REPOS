/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercici7_arrays;

import java.util.Arrays;
import java.util.Scanner;

import java.util.Arrays;

/**
 *
 * @author semo3415
 */
public class Ejercici7_arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Pon valor minmo");
        int minimo=sc.nextInt();
        System.out.println("Pon valor maximo");
        int maximo=sc.nextInt();
        final int  TAMANY=maximo-minimo+1;
        int[]valores=new int[TAMANY];
        
        for (int i = 0; i < valores.length; i++) {
            valores[i]=minimo;
            ++minimo;
        }
        
        System.out.println("Muestro array");
        
    }
    
            
}
