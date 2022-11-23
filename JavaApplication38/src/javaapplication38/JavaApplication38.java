/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication38;

/**
 *
 * @author semo3415
 */
public class JavaApplication38 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here num%7==0 multiple de 7
        int num=12;
        int cont10=0;
        
        
        do{
            
            num++;
            
            if(num%7==0){
                cont10++;
                System.out.println(num);
            }
       
        }
        
        while(cont10<10);
        
        
        
    }
    
}
