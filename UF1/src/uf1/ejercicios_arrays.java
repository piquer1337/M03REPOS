/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf1;

import java.util.Scanner;

/**
 *
 * @author semo3415
 */
public class ejercicios_arrays {
    
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int[]num;
    //pedir datos
    
    num=new int[6];
    
    
        introducriDatosarray(num);
        
    
        
    
        
    int minimo,maximo;
    
    
    
    
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
