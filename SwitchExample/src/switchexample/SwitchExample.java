/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switchexample;

import java.util.Scanner;

/**
 *
 * @author semo3415
 */
public class SwitchExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        System.out.println("**************Bienvenido FIFA 2022**********************");
        
        System.out.println("a.- Jugar Partido Rapido");
        System.out.println("b.- Multijugador");
        System.out.println("c.- Carrera");
        System.out.println("d.- Ultimate");
        System.out.println("z.- Exit");
        System.out.println("********************************************************");
        System.out.println("Escoge opcion");
        char opcion=sc.nextLine().charAt(0);
        
        switch(opcion){
            
            case 'a':
            case 'A':    
                System.out.println("Vamos a jugar un partido rapido");
                break;
                
            case 'b':
                System.out.println("Opcion Multijugador");
                break;
            case 'c':
                System.out.println("Opcion Carrera");
                break;
                
            case 'd':
                System.out.println("Opcion Ultimate");
                break;
                
            case 'z':
                System.out.println("Salir");
                break;
            default:
                System.out.println("Opcion no valida");
        }
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
    
               
      
        
        
        
        
        
    }
    
}
