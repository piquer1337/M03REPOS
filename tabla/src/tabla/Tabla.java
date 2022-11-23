/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tabla;

import java.util.Scanner;

/**
 *
 * @author semo3415
 */
public class Tabla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador;
        int numero;
        Scanner sc= new Scanner(System.in);
        System.out.println("Pon el numero");
        numero=sc.nextInt();
        int multiplicacion;
        
        
        
        
        
        for (contador=1; contador < 11; contador++) {
            multiplicacion=numero*contador;
            System.out.println(numero + "*"+contador+"="+multiplicacion);
            
        }
        
        
    }
    
}
