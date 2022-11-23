/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf1;

import java.util.Scanner;

/**
 *
 * @author semo3415
 */
public class UF1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[]notes;
        int nota=4;
        
        notes=new int[10];
        notes[0]=3;
        notes[1]=4;
        notes[2]=7;
        notes[5]=1;
        System.out.println("Array creat"+notes);
        
        
       Arrays.mostrarArray(notes);
       
       
       int suma=0;
       double media;
       
       int suma =calcularsumanotas(notes);
       
       
       for (int i = 0; i < notes.length; i++) {
            System.out.println("Posicion "+i+"  Acumulo el valor  "+notes[i]);
            suma=suma +notes[i];
            System.out.println("Acumulado por ahora  "+suma);
            
        }
       media=(double)suma/notes.length;
        System.out.println("La media de las notas es  "+media);
       
       //Inicializamos array atraves del usuario
       Scanner sc= new Scanner(System.in);
        for (int i = 0; i < notes.length; i++) {
            System.out.println("Introduce la nota "+i);
            notes[i]=sc.nextInt();
            
        }
        
        
        int[]noves_notes =new int [num_notas];
        for (int i = 0; i < notes.length; i++) {
            copia_notes[i]=notes[i];
            
        }
        System.out.println("Array copia");
        Arrays.mostrarArray(copia_notes);
       
       
       
       
    }
    
}
