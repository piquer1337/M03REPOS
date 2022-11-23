/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numero_mes_switch;

import java.util.Scanner;

/**
 *
 * @author semo3415
 */
public class Numero_mes_switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        System.out.println("**********Ingresa el numero de mes**********");
        
        System.out.println("1-Enero");
        System.out.println("2-Febrero");
        System.out.println("3-Marzo");
        System.out.println("4-Abril");
        System.out.println("5-Mayo");
        System.out.println("6-Junio");
        System.out.println("7-Julio");
        System.out.println("8-Agosto");
        System.out.println("9-Septiembre");
        System.out.println("10-Octubre");
        System.out.println("11-Noviembre");
        System.out.println("12-Diciembre");
        
        System.out.println("************Escoge un numero");
        
        int numero=sc.nextInt();
        
        switch(numero)
                
                {
            case 1:
                System.out.println(" Has escogido Enero");
              break;  
         case 2:
                System.out.println("Has escogido Febrero");
              break; 
               case 3:
                System.out.println("Has escogido Marzo");
              break;  
               case 4:
                System.out.println("Has escogido Abril");
              break;  
               case 5:
                System.out.println("Has escogido Mayo");
              break;  
               case 6:
                System.out.println("Has escogido Junio");
              break;  
               case 7:
                System.out.println("Has escogido Julio");
              break;  
               case 8:
                System.out.println("Has escogido Agosto");
              break;  
               case 9:
                System.out.println("Has escogido Septiembre");
              break;  
               case 10:
                System.out.println("Has escogido Octubre");
              break;  
               case 11:
                System.out.println("Has escogido Noviembre");
              break;  
               case 12:
                System.out.println("Has escogido Diciembre");
              break;  
               default:
                   System.out.println("Ingresa un numero correcto");
            }
        
        
        
    }
    
}
