/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author semo3415
 */
public class ej_8_arrays {
    
    
    public static void main(String[] args) {
        
        Random rd = new Random();
        int aleatori;
        final int tamany=10;
        
        int []valores=new int [tamany];
        int num;
        int cont=0;
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < valores.length; i++) {
            aleatori=rd.nextInt(1, 51);
            valores[i]=aleatori;
            
            
            
            
            
        }
        
        System.out.println("Muestro array");
        Arrays.mostrarArray(valores);
        
        System.out.println("Pon el valor R");
        int r=sc.nextInt();
        
        for (int i = 0; i < valores.length; i++) {
            if(valores[i]>=r){
            
            
            cont++;
            
            }
        }
        System.out.println("Hay "+cont+" valores superiores a "+r);
        
        
        
        
        
        
        
    }
    
    
    
    
}
