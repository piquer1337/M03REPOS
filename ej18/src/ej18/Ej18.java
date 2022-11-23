/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej18;

import java.util.Scanner;

/**
 *
 * @author semo3415
 */
public class Ej18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        int horas,h_extra;
        double precio_horas;
        double salario_bruto,salario_hnormales,salario_extra;
        final int HORAS_NORMALES= 35,salario_sin_impuestos=500;
        Scanner sc= new Scanner(System.in);
        System.out.println("Pon tus horas trabajadas");
        horas=sc.nextInt();
        System.out.println("Pon el precio que te pagan cada hora");
        precio_horas=sc.nextDouble();
        if(horas>35)
        {
           salario_hnormales = HORAS_NORMALES*precio_horas;
           h_extra=horas-HORAS_NORMALES;
           salario_extra = precio_horas*h_extra*1.5;
           salario_bruto=salario_hnormales+salario_extra;
        }
        else
        {
        salario_bruto= horas*precio_horas;
        
        }
      double salario_final;
      double salario_aplicar_impuestos,impuestos;
      if(salario_bruto>salario_sin_impuestos)
    {
        salario_aplicar_impuestos=salario_bruto - salario_sin_impuestos;
        impuestos=salario_aplicar_impuestos *0.25;
        salario_final=salario_bruto-impuestos;
    }
    
    else
    
    {
    salario_final= salario_bruto;
    }  
   
        System.out.println("Te pagaran " +salario_final+ "Euros");
    }
    
    
    
    
        
    
    
    
}
