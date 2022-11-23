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
public class striprueba {
    
     public static void main(String[] args) {
         String frase;
         Scanner sc= new Scanner(System.in);
         
         frase=sc.next();
         System.out.println("La palabra "+frase+" tiene  "+frase.length()+" caracteres");
         
        
        String f1="hola que tal";
        String f2="Yo estoy bien";
        
        String f3=f1.concat(f2);
         System.out.println("f1 concatenar"+f3);
         int unicode=f1.codePointAt(0);
         System.out.println("Codigo unicode"+unicode);
         
         
         if(f1.startsWith("hola")){
         
             System.out.println("Empieza por hola");
         }
         else {
         
             System.out.println("No empieza");
         
         }
         
         System.out.println(f1.replace('a', 'e'));
         
         System.out.println(f1.repeat(4));
         f1.compareTo(f2);
     }
     }
    
    
    

