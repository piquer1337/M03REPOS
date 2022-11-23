/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_3;

import java.util.Scanner;

/**
 *
 * @author semo3415
 */
public class Ex_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int precioadulto=20;
        int precioinfantil=10;
        int adulto;
        int infantil;
        int precio;
        int precio1;
        
        
        
        
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Bienvenido, cuantos adultos hay?");
        adulto=sc.nextInt();
        
        System.out.println("Y menores?");
        infantil=sc.nextInt();
        int personas=adulto+infantil;
        
        precio=precioadulto*adulto;
        precio1=precioinfantil*infantil;
        int preciototal=precio+precio1;
        int descuento = preciototal*25/100;
        int preciofinal=preciototal-descuento;
        int descuento2=preciototal-20;
       
        
        if(personas<10){
            System.out.println(adulto+" adultos y "+infantil+" menores");
            System.out.println("Total a pagar: " +preciototal+"Euros");
        
        
        }
        
        
        if(personas>=10 && personas<=24){
           
            System.out.println("Bono Descuento del 25%");
            System.out.println("Son "+adulto+" adultos y " +infantil+" menores");
            
            System.out.println("Al ser mas de 10 personas teneis un descuento de " +descuento+" Euros");
            System.out.println("Total a pagar: " +preciofinal);
            
        
        }
        
        if(personas>=25){
            System.out.println("Bono descuento , 1 entrada gratuita");
            System.out.println("Son "+adulto+" adultos y " +infantil+" menores");
            
            
            System.out.println("Entrada gratuita a un adulto");
            System.out.println("Total a pagar " +descuento2);
        }
    }
    
}
