/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package farenheit;

import java.util.Scanner;

/**
 *
 * @author semo3415
 */
public class FARENHEIT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        
        double temp1,temp2,farenheit,i;
        System.out.println("Ingresa una temperatura");
        temp1=sc.nextInt();
        System.out.println("Ingresa una temperatura");
        temp2=sc.nextInt();
        
        if(temp1>temp2){
            System.out.println("Temperatura 2 es menor");
        }
        
        
        for(i=temp1;temp1<=temp2;temp1++){
        
            
            farenheit=1.8*temp1+32;
            System.out.println("La temperatura de "+temp1+"celsius equivale a "+farenheit);
        
    }
    
   }
}