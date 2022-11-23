/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multiplicar;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author semo3415
 */
public class Multiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        Random rd= new Random();
        int num;
        int respuesta;
        int calc;
        int errores=0;
        num=rd.nextInt(9)+1;
        
        for (int i = 1; i <= 10; i++) {
            
//            calc=i*num;
//            
//            System.out.println("Cuanto es "+num+" * "+i+"???");
            respuesta=sc.nextInt();
            if(calc!=respuesta){
                errores++;
                System.out.println("Respuesta incorrecta, "+num+" * "+i+ " = "+calc);
            }
            if(calc==respuesta){
                System.out.println("Respuesta correcta");
            }
            
            
        }
        System.out.println("Has cometido  "+errores+"  errores ");
        
        
    }
    
}
