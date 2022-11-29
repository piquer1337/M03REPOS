/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_arrays;

import java.util.Scanner;

/**
 *
 * @author semo3415
 */
public class Ejercicios_arrays{
    
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int[]num;
    //pedir datos
    
    num=new int[6];
    
    
    introducriDatosarray(num);
         
    int positivo=0,negativo=0;
    
        for (int i = 0; i <num.length; i++) {
            if(num[i]>=0){
                
                positivo=num[i]+positivo;
            }
            if(num[i]<0){
                
                negativo=num[i]+negativo;
            
            }
            
        }
        System.out.println("La suma de positivos es de "+positivo);
            System.out.println("La suma de negativos es de "+negativo);
    
    
    
    
    }
    
    
    public static void mostrarArray(int[]valores){
    for (int i = 0; i < valores.length; i++) {
            System.out.println("Posicio "+i+" Contiene -> "+valores[i]);
            
        }
    
    
    
    
    
    //git modificado desde casa
    
    }

    private static void introducriDatosarray(int[] num) {
        Scanner sc= new Scanner(System.in);
        for (int i = 0; i <num.length; i++) {
            System.out.println("Introduce valor"+(i+1)+"=");
            num[i]=sc.nextInt();
        }
        
        
    }
    
    
    
    
    
}
