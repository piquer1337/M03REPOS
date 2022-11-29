/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenrecursividad;

import java.util.Scanner;

/**
 *
 * @author kefl0483
 */
public class Ejercicio2ExRecursividad {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce numero de filas que tiene el arbol: ");
        int filas = sc.nextInt();
        int numbombetesfila = calculaBombetes(filas);
        System.out.println("Numero de bombetes que contiene: " + numbombetesfila);

    }

    public static int calculaBombetes(int fila) {
        
        int bombafila= 0;
        int totalbombetes = 0;
        

        if (fila == 1) {
            return 1;
        } else if (fila > 1) {
            bombafila = 2 + calculaBombetes(fila-1);
            
            totalbombetes =  (fila + 2) + (calculaBombetes(fila - 1));
            //totalbombetes =  bombafila + calculaBombetes(fila - 1);
          
            
        }
        return totalbombetes;
    }

}