/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucle_ejemplo2;

import java.util.Scanner;

/**
 *
 * @author semo3415
 */
public class Bucle_ejemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        Scanner sc= new Scanner(System.in);
        
        do{
        System.out.println("Pon numeros,para terminar escribe 0");
        num=sc.nextInt();
        if(num<0)
                {   
                    System.out.println("El numero no puede ser negativo");
                }
        System.out.println("Has escrito->"+num);
        }while(!(num==0));//condición para que continue
        System.out.println("Programa terminado");
        //negando la condición de salida
        
        
    }
    
}
