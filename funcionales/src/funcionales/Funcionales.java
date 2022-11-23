/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcionales;

/**
 *
 * @author semo3415
 */
public class Funcionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //        int idioma = 1;
//        char hola_adios = 'H';  
//        System.out.println("Idioma en el main vale " + idioma);
//        idiomasHelloWorld(idioma);
//        System.out.println("Idioma despues de ejecutar idiomasHelloWorld vale " + idioma);        
        int a = 1;
        int calculo = doble(a);
        System.out.println(calculo);
    }
   
    public static int doble(int a) {
        int resultado = a*2;
        return resultado; //public static int, quiere decir que la variable return debe ser int
    }
   
    public static void idiomasHelloWorld(int idioma) {
        System.out.println("En idiomas se esta entrando el idioma con valor" + idioma);
            switch (idioma) {
                case 1:
                    System.out.println("hello world");
                    System.out.println("Goodbye world");
                    idioma = 8;
                    System.out.println("Idioma en el idiomasHelloWorld vale " + idioma);
                    break;
                case 2:
                    System.out.println("Hola Mon");
                    System.out.println("Adeu Mon");
                    break;
                default:
                    System.out.println("Hola Mundo");
                    System.out.println("Adios Mundo");
                    break;
            }

    }
   
    public static void helloWorld(int idioma, char hola_adios) {
        System.out.println("se esta pasando el idioma " + idioma);
        switch (idioma) {
            case 1:
                if(hola_adios == 'H') {
                    System.out.println("hello world");
                }else {
                    System.out.println("Goodbyºe world");
                }   break;
            case 2:
                System.out.println("Hola Mon");
                System.out.println("Adeu Mon");
                break;
            default:
                System.out.println("Hola Mundo");
                System.out.println("Adios Mundo");
                break;
        }

    }
}
    

