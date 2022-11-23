/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author hedo0495
 */
public class Examen_ejercicio_2_FOR 
{
    public static void main(String[] args) 
    {
        
        
        double temperatura_min,temperatura_max,fahrenheit,graus;
        Scanner entrada=new Scanner (System.in);
        System.out.println("Introdueix una temperatura minima");
        temperatura_min=entrada.nextDouble();
        System.out.println("Introdueix una temperatura maxima");
        temperatura_max=entrada.nextDouble();
        for (graus = temperatura_min; graus <= temperatura_max; graus++) 
        {
             fahrenheit=(1.8*graus)+32;
            System.out.println(graus + " + " + fahrenheit);   
        }
        
    }
    
}
