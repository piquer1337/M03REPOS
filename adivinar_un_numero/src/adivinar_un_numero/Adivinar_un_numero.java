/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adivinar_un_numero;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author semo3415
 */
public class Adivinar_un_numero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        int aleatorio;
       
        int numero;
        
        Random rd = new Random();
        for (int i = 0; i < 1; i++) {
            
            aleatorio = rd.nextInt(10);
            
        }
            
            do{
            System.out.println("Escribe el numero");
            numero=sc.nextInt();
            
            if(numero<aleatorio){
                
                System.out.println("El numero es mas grande");}
                
                
            if(numero>aleatorio){
                
                System.out.println("El numero es mas pequeño");}
                
                
               
            if(numero==aleatorio){
                System.out.println("Acertaste");
            }
            


            }
                
                
            
            
            


            
            
            
            
            
            
            
                    
                   
            
            
                 
            
        
        
        
        
        
        
        
        
        
        
        
    
    

