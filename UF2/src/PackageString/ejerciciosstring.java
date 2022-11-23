/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PackageString;

import java.util.Scanner;

/**
 *
 * @author semo3415
 */
public class ejerciciosstring {
    
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
        String contar="";
    String mayus="";
    int contarvocal;
    contar=contarcar(contar);
    mayusminus(mayus);
    int numA=contarA(mayus);
    contarvocal=contarVoc(contar);
        System.out.println("Pon el caracter que quieres contar de la frase");
        char letraBuscada=sc.next().charAt(0);
                int numCar=contarCaracterFrase(contar,letraBuscada);
    
    
    
    
    
    
    }
    
    public static String contarcar(String frase){
    Scanner sc= new Scanner(System.in);
    frase=sc.next();
        System.out.println("La palabra:  "+frase+"  tiene "+frase.length()+"  caracteres");
        return frase;
    }
    
    public static void mayusminus(String frase){
        
        Scanner sc= new Scanner(System.in);
        frase=sc.next();
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
        
        
        
    }
    public static int contarA(String frase){
        int contA=0;
        for (int i = 0; i < frase.length(); i++) {
            if(frase.charAt(i)=='a'){
                System.out.println("Incremento contador");
            contA++;
            
            
            }
        }
    
    
    
    return contA;
    }
    
    public static int contarVoc(String frase){
    
    int contA=0;
        for (int i = 0; i < frase.length(); i++) {
            if(frase.charAt(i)=='a'){
            contA++;
            }
            if(frase.charAt(i)=='e'){
            
            contA++;
            }
            if(frase.charAt(i)=='i'){
            
            contA++;
            
            }
            if(frase.charAt(i)=='o'){
            
            contA++;
            
            }
            
            if(frase.charAt(i)=='u'){
            
            contA++;
            
            }
            
            
            
        }
        System.out.println("Hay un total de " +contA+"  vocales");
    
    return contA;
    }
    
    private static int contarCaracterFrase(String frase,char letra){
        int numCaracteres=0;
        for (int i = 0; i < frase.length(); i++) {
            if(frase.charAt(i)==letra){
            
            numCaracteres++;
            
            }
        }
    
    
    return numCaracteres;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
