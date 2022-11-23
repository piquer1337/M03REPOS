/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_1;

import java.util.Scanner;

/**
 *
 * @author semo3415
 */
public class Ex_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        int dia,mes,any;
        
        System.out.println("Ingresa el dia");
        dia=sc.nextInt();
        System.out.println("Ingresa un mes");
        mes=sc.nextInt();
        System.out.println("Ingresa el any");
        any=sc.nextInt();
        
        if(dia>=31){
            System.out.println(dia+" Error, DIA tiene que estar entre el 1 y el 30");
        }
        if(dia<=0){
            System.out.println(dia+" Error, DIA tiene que ser un valor entre 1 y 30");
        }
        
        if(mes>12){
            System.out.println(mes+" Error,mes debe poner un valor entre 1 y 12");
        }
        
        if(any<1900){
            System.out.println( any+" Error, el ANY tiene que estar de 1900 para arriba");
        }
        
        if(dia<=30 && dia>=1 && mes<=12 && mes>1 && any>=1900){
            System.out.println("Correcto!,ha puesto "+dia+"/"+mes+"/"+any  );
        }
    }
    
}
