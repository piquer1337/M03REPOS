/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej17;

import java.util.Scanner;

/**
 *
 * @author semo3415
 */
public class Ej17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        int horas;
        int minutos;
        int segundos;
        System.out.println("Introduce la hora");
        horas=sc.nextInt();
        System.out.println("Introduce los minutos");
        minutos=sc.nextInt();
        System.out.println("Introduce los segundos");
        segundos=sc.nextInt();
        segundos=segundos+1;
        
        if(segundos==60)
                {
                    segundos=0;
                    minutos=minutos+1;
                
                 if(minutos==60)
                        {
                            horas=horas+1;
                            minutos=0;
                        }   
                 
                 if(horas==24)
                        {
                            horas=0;
                        }
                }
        
        
            
          System.out.println("Ahora la hora es " + horas + ":" + minutos + ":" + segundos);
            
            
    }
    
}
