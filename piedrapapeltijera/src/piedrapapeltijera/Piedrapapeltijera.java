/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package piedrapapeltijera;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author semo3415
 */

public class Piedrapapeltijera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc= new Scanner(System.in);
        int play=0;
        int player;
        int tirada;
        int ordenador=0;
        int ganador;
        System.out.println("Introduce un numero 0-piedra 1-papel 2-tijera");
        
       
        play=jugada();
        imp_jugada(play);
        System.out.println("Turno del ordenador");
        ordenador=jugada_ordenador();
        System.out.print("ordenador escoge.... ");
        imp_jugada(ordenador);
        ganador=ganador(play,ordenador);
        
        
    }
    
    
     public static int jugada(){
     Scanner sc= new Scanner(System.in);
     int eleccion;
     int piedra=0;
     int papel=1;
     int tijera=2;
      int play; 
         
     do{
        play=sc.nextInt();
        if(play==0){
        
            
        
        }
        else if (play==1){
        
            
        
        }
        else if(play==2){
        
            
        
        }
        
        else{
            System.out.println("Por favor introduzca un numero correcto");
        }
     }while(play<0 || play>2);
     
        eleccion=play;
        
        return eleccion;
     
     
     
     
     }
     
     
     public static int jugada_ordenador(){
     Random rd= new Random();
     int aleatorio;
     int respuesta;
     aleatorio=rd.nextInt(3)+0;
         System.out.println(aleatorio);
         
         respuesta=aleatorio;
         return respuesta;
     
   
     }
     
     
    public static void imp_jugada(int player){
        
        if(player==0){
            System.out.println("Has seleccionado piedra");
        }
        if(player==1){
            System.out.println("Has seleccionado papel");
        
        
        }
        
        if(player==2){
            System.out.println("Has seleccionado tijera");
        }



}
    public static int ganador(int choose_player1, int choose_player2){
    int piedra=0;
    int papel=1;
    int tijera=2;
    
    
    int devuelve;
    if((choose_player1==piedra && choose_player2==tijera) || (choose_player1==papel && choose_player2==piedra) || (choose_player1==tijera && choose_player2==papel)){
        System.out.println("jugador gana");
    devuelve=1;
    }
    else if(choose_player2==piedra && choose_player1==tijera || choose_player2==papel && choose_player1==piedra || choose_player2==tijera && choose_player1==papel){
    
    devuelve=2;
        System.out.println("Gana la maquina");
    
    }
    
    else{
        
        devuelve=0;
        
        System.out.println("Empate");
    }
    return devuelve;
    }
    
    
    
    
    
    
    
    
    
    
    
}
