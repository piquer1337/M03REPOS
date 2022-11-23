/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soluciones.examen;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author hedo0495
 */
public class Examen_ejercicio_3 
{
    public static void main(String[] args) 
    {
        int aleatori,tabla,resposta,error = 0;
        
         Scanner entrada=new Scanner (System.in);
         Random rd= new Random ();
         aleatori=rd.nextInt(9)+1;
         for (tabla = 0; tabla <= 10; tabla++) 
         {
            System.out.print(aleatori + " * " + tabla + " = ");
            resposta=entrada.nextInt();
            if (resposta!=aleatori*tabla)
            {
                error++;
                resposta=aleatori*tabla;
                System.out.println("Inconrrecte! el resultat es " + resposta );
         }
        }
         System.out.println("Has tingut " + error + "errades");
        }
    }
    

