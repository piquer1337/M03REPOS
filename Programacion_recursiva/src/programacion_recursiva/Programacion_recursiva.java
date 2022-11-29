/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programacion_recursiva;

import java.util.Scanner;

/**
 *
 * @author semo3415
 */
public class Programacion_recursiva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        int files;
        System.out.println("Cuantes files te l'arbre ?");
        files=sc.nextInt();
        int bombes=calculaBombetes(files);
        System.out.println("Files="+files+"Bombetes= "+bombes);
        
        
        
        
        
        
    }
    private static int calculaBombetes(int files){
    int bombetes;
    if(files==1){
        
        return 1;
    }
    else if(files%2==0){
    
    
    
    return (2*files)+calculaBombetes(files-1);
    }
    
    
    return -1;
    }
    
    
    
    
}
