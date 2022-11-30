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
    
<<<<<<< HEAD:UF1/src/uf1/ejercicios_arrays.java
        
    
        
    int minimo,maximo;
    minimo=num[0];//si solo leo uno este seguro que es el minimo
    maximo=num[0];//si solo leo uno seguro que es el maximo
        for (int i = 0; i < num.length; i++) {
            
            if(num[i]>maximo){
            
            maximo=num[i];
            
            }
            if(num[i]<minimo){
            
            minimo=num[i];
=======
        for (int i = 0; i <num.length; i++) {
            if(num[i]>=0){
                
                positivo=num[i]+positivo;
            }
            if(num[i]<0){
                
                negativo=num[i]+negativo;
>>>>>>> 12042a2f68581f1e72988fe80e5e595e84f40f88:UF1/src/uf1/Ejercicios_arrays.java
            
            }
            
        }
<<<<<<< HEAD:UF1/src/uf1/ejercicios_arrays.java
        System.out.println("El maximo es "+maximo);
        System.out.println("Y el minimo es "+minimo);
=======
        System.out.println("La suma de positivos es de "+positivo);
            System.out.println("La suma de negativos es de "+negativo);
    
    
    
>>>>>>> 12042a2f68581f1e72988fe80e5e595e84f40f88:UF1/src/uf1/Ejercicios_arrays.java
    
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
