/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cas_altura_ancho;

import java.util.Scanner;

/**
 *
 * @author semo3415
 */
public class Cas_altura_ancho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        int anchura;
        int altura;
        int area_casa=0;
        int areah;
        char seguir;
        
        do{
        System.out.println("Ingresa el ancho");
        anchura=sc.nextInt();
        System.out.println("Ingresa la altura");
        altura=sc.nextInt();
        areah= anchura*altura;
        area_casa= area_casa+areah;
        
        System.out.println("La casa mide"+areah);
        
        System.out.println("Tienes mas habitaciones(S/N)");
        seguir=sc.next().charAt(0);}
        while(seguir=='s' || seguir=='S');
        System.out.println("La casa mide "+ area_casa);
        
        
    }
    
}
