/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejjj;

import java.util.Scanner;

/**
 *
 * @author semo3415
 */
public class Ejjj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int factorial;
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce el numero");
        factorial=sc.nextInt();
        int acum_factorial=1;
        
        for(int contador=1;contador<=factorial;contador++){
            
            acum_factorial=contador*acum_factorial;
            if(contador!=factorial)
                            {
                                System.out.println(contador+"*");
                            
                            
                            }
            else
            
            
                            {
                                System.out.println(contador);
                            
                            
                            }
                
                
                
            System.out.println(contador + "*");
        
        
        }
        System.out.println("lfactorial seria"+acum_factorial);
    }
    
}
