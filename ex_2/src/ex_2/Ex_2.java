/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_2;

import java.util.Scanner;

/**
 *
 * @author semo3415
 */
public class Ex_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        int num;
        
        System.out.println("Introduce un numero");
        num=sc.nextInt();
        
        if(num%2==0){
            
            if(num%3==0){
                System.out.println("Numero par y divisible entre 3");
            }
            if(num%3!=0){
                System.out.println("Numero par y no divisible entre 3");
            }
        
        }
        else{
            System.out.println("El numero "+num+ " es impar");
        }
        
    }
    
}
