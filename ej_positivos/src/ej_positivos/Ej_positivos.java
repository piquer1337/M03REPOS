/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej_positivos;

import java.util.Scanner;

/**
 *
 * @author semo3415
 */
public class Ej_positivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numeros;
        Scanner sc= new Scanner(System.in);
        int count_positive=0;
        do  {
        System.out.println("Pon numeros, escribe 0 para terminar");
        numeros=sc.nextInt();
        if(numeros>0)
        
                        {   
                        count_positive++;
                        
                        }
            }while(numeros!=0);
        System.out.println("Escribiste 0 termino...");
        System.out.println("positivos"+count_positive);
        
        
        
        
    }
    
}
