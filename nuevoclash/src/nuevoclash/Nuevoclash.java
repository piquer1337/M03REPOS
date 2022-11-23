/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nuevoclash;

import java.util.Scanner;

/**
 *
 * @author semo3415
 */
public class Nuevoclash {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cups;
        Scanner sc= new Scanner(System.in);
        System.out.println("Cuantas copas tienes");
        cups = sc.nextInt();
        System.out.println("Escoge una carta");
        char carta;
        sc.nextLine();//limpio bugger scanner del nextInt
        if(cups<2000)
                {
                    System.out.println("M-Mago electrico");
                    System.out.println("E-Esbirro mega");
                    System.out.println("Escoge carta");
                    carta=sc.nextLine().charAt(0);
                    switch(carta)
                    {
                        case 'a':
                        case 'A':    
                            System.out.println("Has escogido el mago electrico");
                            break;
                        case 'e':
                        case 'E':    
                            System.out.println("Has escogido el Esbirro mega");
                            break;
                    
                    }
                
                }
        else if(cups>=2000 && cups <=3000)
                            
                                    { System.out.println("c-Cavallero");
                    System.out.println("b-Bandida");
                    System.out.println("Escoge carta");
                    carta=sc.nextLine().charAt(0);
                    switch(carta)
                    {
                        case 'c':
                        case 'C':    
                            System.out.println("Has escogido el mago electrico");
                            break;
                        case 'b':
                        case 'B':    
                            System.out.println("Has escogido el Esbirro mega");
                            break;
                    
                    }
                                    }
        else if(cups>=3000)
                 {
                 System.out.println("G-Gigante");
                    System.out.println("E-Esqueleto");
                    System.out.println("Escoge carta");
                    carta=sc.nextLine().charAt(0);
                    switch(carta)
                    {
                        case 'g':
                        case 'G':    
                            System.out.println("Has escogido el mago electrico");
                            break;
                        case 'e':
                        case 'E':    
                            System.out.println("Has escogido el Esbirro mega");
                            break;
                 
                 
                 }
        
        
        
    }
    } 
}

    
    

