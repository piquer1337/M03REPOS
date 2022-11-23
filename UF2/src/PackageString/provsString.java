/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PackageString;

import java.util.Scanner;

/**
 *
 * @author semo3415
 */
public class provsString {
     public static void main(String[] args) {
         int x=3;
         String frase="Hola que tal";
         System.out.println(frase);
         Scanner sc= new Scanner(System.in);
         System.out.println("Escribe una frase");
         frase=sc.next();
         System.out.println("frase con next "+frase);
         frase=sc.nextLine();
         System.out.println("frase con nextline "+frase);
         if(frase.isEmpty())
             
         {
             System.out.println("String vacio");   
         }
         else{
         
             System.out.println("String no vacio");
         
         
         }
         
        
        
         System.out.println("La frase tienen "+frase.length());
         for (int i = 0; i < frase.length(); i++) {
             System.out.println("-"+frase.charAt(i));
         }
         String f1="Hola que tal";
         String f2="Hola que tal.";
         if(f1.equals(f2))
             
         {
             System.out.println("Frase igual");
             
             
         }
         else
         {
             System.out.println("Frase diferente");
         }
         
         
         }
     }
         
     
    
    
    
    
    
    

