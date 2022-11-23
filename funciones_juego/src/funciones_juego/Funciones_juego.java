/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funciones_juego;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author semo3415
 */
public class Funciones_juego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        int apuesta;
        int saldo=100;
        numero=pedirNumero();
        pintaAsteriscos(numero);
        apuesta=pedirDineroApuesta(saldo);
        saldo=saldo-apuesta;
        System.out.println("saldo  "+saldo);
        
    }
    
    public static int pedirNumero(){
     Scanner sc= new Scanner(System.in);
    int numero;
        
        do{
            System.out.println("Escribe un numero para apostar del 1 al 36");
            numero=sc.nextInt();
        
        }while(numero<=0 || numero>=39);
        
        
    return numero;
    }
    
   
    
    
    public static int caidaBola() {
    Random rd= new Random();
     int aleatorio=rd.nextInt(37);
    
    return aleatorio;
   }
   public static void pintaAsteriscos(int num){
   
       for (int i = 0; i < num; i++) {
           System.out.print("*");
       }
   
   
   
   }
   
   public static int pedirDineroApuesta(int dinero_tienes){
       Scanner sc= new Scanner(System.in);
       int numero;
       
       
       do{
       System.out.println("Cuanto dinero quieres apostar?,Aun tienes : "+dinero_tienes);
       numero=sc.nextInt();
       }while(dinero_tienes<numero && dinero_tienes<=0);
       System.out.println("Has apostado  "+numero);
   
   
   return dinero_tienes;
   
   }
    public static int ganancias(int dinero_apostado,int num_apostado){
    
    int dinero_ganado=0;
    
    if(num_apostado>=1 && num_apostado<=36){
    
    
    dinero_ganado= dinero_apostado*35;
    
    
    }
    else if(num_apostado==37 || num_apostado==38){
    
    dinero_ganado=dinero_apostado*2;
    
    }
    return dinero_ganado;
    
    
    
    
    
    }
    
    public static char seguirJugando(){
    Scanner sc= new Scanner(System.in);
    char respuesta;
        do{
        System.out.println("Quieres seguir jugando? SI= S/s, NO= N,n");
        respuesta=sc.next().charAt(0);
        }
        while(!(respuesta=='S' || respuesta=='s' || respuesta=='N' || respuesta=='n'));
    
    return respuesta;
    }
    
    
    public static boolean comprobarResultado(int bola, int num_apostado){
    if(bola==num_apostado){
    
    return true;
    
    }
    else if(bola%2==0 && num_apostado==38){
    
    return true;
    
    }
    
    else if(bola%2==1 && num_apostado==37){
    
    return true;
    
    }
    else
    {
    return false;
  
    }
   
    }
    public static boolean continuarJugando(char respuesta,int dinero){
    
    if((respuesta=='s'|| respuesta=='S') && dinero>0)
    {
    return true;
    }
    
    return false;
    
    
    }
    
    
    
    
    
    
}
