/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soluciones.examen;


import java.util.*;

/**
 *
 * @author hedo0495
 */
public class Examen_ejericio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int esmorzar;
        char dia;
        Scanner entrada=new Scanner (System.in);
        System.out.println("Indica si el dia es laborable(L), dissabte(S) o Festiu(F)");
        dia=entrada.next().charAt(0);
        System.out.println("Indica el tipus de emorzar 1 o 2");
        esmorzar=entrada.nextInt();
        if (dia=='L'||dia=='l')
        {
            if (esmorzar==1)
            {
                System.out.println("El preu del esmorzar son 2.00 euros");
            }
            else if (esmorzar==2)
            {
                System.out.println("El preu del esmorzar son 2.50 euros");
            }
           
       
        }
        else if (dia=='S'||dia=='s')
        {
             if (esmorzar==1)
            {
                System.out.println("El preu del esmorzar son 2.20 euros");
            }
            else if (esmorzar==2)
            {
                System.out.println("El preu del esmorzar son 2.70 euros");
            }
           
        }
       
        else if (dia=='F'||dia=='f')
        {
             if (esmorzar==1)
            {
                System.out.println("El preu del esmorzar son 2.30 euros");
            }
            else if (esmorzar==2)
            {
                System.out.println("El preu del esmorzar son 2.80 euros");
            }
          
        }
        else 
        {
            System.out.println("Opcio incorrecta");
        }
    }
}


  
    

            
 
 


 


    
    
    
    
    
    
    
    

