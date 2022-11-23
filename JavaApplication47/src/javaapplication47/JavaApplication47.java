/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication47;

import java.util.Scanner;

/**
 *
 * @author semo3415
 */
public class JavaApplication47 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char dia;
        int tipo;
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Escoge el dia");
        
        System.out.println("L : LABORABLE,  F : FESTIVO,   S : SABADO");
        dia=sc.next().charAt(0);
        if(dia=='L'){
            System.out.println("Ha escogido laborable");
            
                System.out.println("Ingresa el tipo de desayuno 1 / 2");
                tipo=sc.nextInt();
                if(tipo==1){
                    System.out.println("Precio 2,00  EUROS");
                
                
                }
                if(tipo==2){
                    System.out.println("Precio 2,50  EUROS");
                }
                if(tipo!=1 && tipo!=2){
                    System.out.println("Opcion incorrecta, no se puede calcular el precio");
                
                }
           
        }
        
        if(dia=='S'){
            System.out.println("Has escogido sabado");
            
            System.out.println("Ingresa el tipo de desayuno 1/2");
            
            tipo=sc.nextInt();
                if(tipo==1){
                    System.out.println("Precio 2,20  EUROS");
                
                
                }
                if(tipo==2){
                    System.out.println("Precio 2,70  EUROS");
                }
                if(tipo!=1 && tipo!=2){
                    System.out.println("Opcion incorrecta, no se puede calcular el precio");
                
                }
        
        }
        if(dia=='F'){
            System.out.println("Has escogido festivo");
            
            System.out.println("Ingresa el tipo de desayuno 1/2");
            
            tipo=sc.nextInt();
                if(tipo==1){
                    System.out.println("Precio 2,30  EUROS");
                
                
                }
                if(tipo==2){
                    System.out.println("Precio 2,80  EUROS");
                }
                if(tipo!=1 && tipo!=2){
                    System.out.println("Opcion incorrecta, no se puede calcular el precio");
                
                }
        
        }
        
        if(dia!='L' && dia!='S' && dia!='F'){
            System.out.println("Opcion incorrecta, no se puede calcular el precio");
        }
        
        
        
        
    }
    
}
