/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package petado;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author semo3415
 */
public class Petado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        int el_petardo;
        int el_petardo1;
        int el_petardo2;
        int el_petardo3;
        Random rd = new Random();
        el_petardo1= rd.nextInt(10)+1;
        el_petardo2= rd.nextInt(10)+1;
        el_petardo3= rd.nextInt(10)+1;
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Que petardo quieres?");
        Thread.sleep(500);
        el_petardo=sc.nextInt();
        
        Thread.sleep(500);
        
        switch(el_petardo){
            case 1:
                System.out.println("Has escogido el 1");
                if(el_petardo1>el_petardo2 && el_petardo1>el_petardo3 ){
            
            System.out.println("Has ganado");
        
        }
                else{
            System.out.println("Has perdido");}
                break;
                
            case 2:
                System.out.println("Has escogido 2");
                if(el_petardo2>el_petardo1 && el_petardo2>el_petardo3){
            System.out.println("Has ganado");
        
        }
         else{
            System.out.println("Has perdido");}
                break;
                
            case 3:
                System.out.println("Has escogido 3");
                if(el_petardo3>el_petardo1 && el_petardo3>el_petardo2){
                    System.out.println("Has ganado");
        
        }
        else{
            System.out.println("Has perdido");}
                break;
                
        }
        
        //pintar asteriscos o espacios
        
        for (int contador = 1; contador <= 10; contador++) {
            
            if(contador<=el_petardo1){
            
                System.out.print("*");
            }
            else{
                System.out.print("");
            }
            
            if(contador<=2){
            
                System.out.print("*");
                
            }
            else{
                System.out.print("");
            }
            if(contador<=3){
            
                System.out.print("*");
                
            }
            else{
                System.out.print("");
            }
            
            
            
            System.out.println("");
            
            
            
            
        }
            
        
        
        
        Thread.sleep(500);
        
        System.out.println("Los resultados fueron: "+el_petardo1+" y "+el_petardo2+" y "+el_petardo3);
        
    }
    
}
