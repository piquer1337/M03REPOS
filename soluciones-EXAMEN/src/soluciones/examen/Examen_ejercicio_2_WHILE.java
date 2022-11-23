/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author hedo0495
 */
public class Examen_ejercicio_2_WHILE 
{
    public static void main(String[] args) 
    {
         int temperatura_min, temperatura_max;
         double fahrenheit ,graus;
        Scanner entrada=new Scanner (System.in);
        System.out.println("Introdueix una temperatura minima");
        temperatura_min=entrada.nextInt();
        System.out.println("Introdueix una temperatura maxima");
        temperatura_max=entrada.nextInt();
        graus=temperatura_min;
         do
        {
             graus++;
             fahrenheit=(1.8*graus)+32;
            System.out.println(graus + " + " + fahrenheit);   
        }
          while(graus <= temperatura_max);
       System.out.println(graus + " + " + fahrenheit); 
        
    }
    
}
