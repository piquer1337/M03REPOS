/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucle_ejemplo1;

/**
 *
 * @author semo3415
 */
public class Bucle_ejemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //while,do while for
     int i; 
        
        //for(valor_inicial ; condición para que continue;incremento variable
        for (i = 0; i < 6; i++); {
            System.out.println("-->"+ i);
            //aumento variable, pero ya lo hace el i++ del for
            
        }//fin del for
        
        System.out.println("");
        System.out.println("bucle en un while");
        i=0;
        while(i<6)
            {
                System.out.println("*"+ i);
                i++;
            
            }
        do
            {  
                System.out.println("*"+i);
                i++;
                
            
            }
        while(i<6);
                
                
    
    
        
        
        
        
        
        
    }
    
}
