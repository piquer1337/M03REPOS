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
    minimo=num[0];//si solo leo uno este seguro que es el minimo
    maximo=num[0];//si solo leo uno seguro que es el maximo
        for (int i = 0; i < num.length; i++) {
            
            if(num[i]>maximo){
            
            maximo=num[i];
            
            }
            if(num[i]<minimo){
            
            minimo=num[i];
            
            }
            
        }
        System.out.println("El maximo es "+maximo);
        System.out.println("Y el minimo es "+minimo);
    
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
