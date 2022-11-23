/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clashroyaale;



import java.util.Scanner;

/**
 *
 * @author sergi
 */
public class Clash {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        int copas;
        System.out.println("**********Bienvenido a Clash Royale**********");
       
        System.out.println("a-Partida rápida");
        System.out.println("b-Salir");
       
       
     
        char opcion = sc.nextLine().charAt(0); //opción caracter
       
       
        
       
        System.out.println("Escoge carta: a. Mago electrico b.esbirro mega");
        char opcion1 = sc.nextLine().charAt(0); //opción caracter
        switch(opcion1){
            case 'a':
            case 'A':  
                System.out.println("Mago electrico");
                break;
               
            case 'b':
            case 'B':
                System.out.println("Esbirro mega");
                break;
            default:
       
        }
        System.out.println("Cuantas copas tienes?");
       
       
        copas=sc.nextInt();
        if(copas>=2000)
                {  
                    switch (opcion) {
            case 'a':
            case 'A':
                System.out.println("Partida rapida");
                break;
            case 'b':
                System.out.println("Saliendo");
                break;
           
            default:
                System.out.println("Opcion no valida");
        }
                            }
        else if { 
            System.out.println("A. CAVALLERO B.BANDIDA");
        char opcion3 = sc.next().charAt(0); //opción caracter
        switch(opcion3){
            case 'a':
            case 'A':
                System.out.println("Has seleccionado Cavallero");
                break;
            case 'b':
            case 'B':
                System.out.println("Has seleccionado Bandida");
                break;
            default:                      }
       
        
       
                    }
               
               
       
        }
       
                                   
                   
                                   
                   
                           
           
                            }