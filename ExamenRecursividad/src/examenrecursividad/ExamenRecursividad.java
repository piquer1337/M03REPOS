/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenrecursividad;

import java.util.Scanner;

/**
 *
 * @author kefl0483
 */
public class ExamenRecursividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id = 0;
        boolean verificado = false;
        id = llegirNumero(id);
        System.out.println("Introduce tu ano de nacimiento (4 cifras): ");
        int anacimiento = sc.nextInt();

        System.out.println("Conoces tu contrasena (S/N)? ");
        char sabepass = sc.next().charAt(0);
        int contraseña = 0;

        if (sabepass == 'n' || sabepass == 'N') {
            System.out.println("dijiste no");
            contraseña = generarContrasenya(id, anacimiento);
            System.out.println("Contrasena generada, tu contrasena es: " + contraseña);

        } else if (sabepass == 's' || sabepass == 'S') {
            System.out.println("Escibe tu contrasena: ");
            int contraparaverificar = sc.nextInt();
            verificado = verificarCredencials(id, anacimiento, contraseña);
            if (verificado = true) {
                System.out.println("Contrasena verificada.");
                int opcion;
                do{
                System.out.println("----MENU----");
                System.out.println("0. Sortir");
                System.out.println("1. Mostrart perfil d'usuari");
                opcion = sc.nextInt();
                if (opcion == 1){
                    mostrarPerfilUsuari(id, anacimiento);
                }
                } while (opcion != 0);
                System.out.println("Fins aviat.");
                
                

            } else if (verificado = false){
                System.out.println("Contrasena NO verificada.");
                
            }

        }

        

    }

    public static int llegirNumero(int numero) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Pon un identificador entre 1000 y 10000: ");
            numero = sc.nextInt();

        } while (numero <= 1000 || numero >= 10000);
        return numero;
    }

    public static int generarContrasenya(int identificador, int anyn) {
        int contra = 0;
        contra = (identificador * anyn) % 10000 ;

        return contra;
    }

    public static boolean verificarCredencials(int identificador, int anyn, int contra) {
        int verificado = 0;
        boolean sn = false;
        verificado = (identificador * anyn) % 10000;

        if (contra == verificado) {
            sn = true;

        } else {
            sn = false;
        }
        return sn;
    }

    public static void mostrarPerfilUsuari(int identificador, int anyn) {
        int contraseña = generarContrasenya(identificador, anyn);
        int edad = anyn - 2022;
        edad = Math.negateExact(edad);
        System.out.println(" " + identificador + " -  " + edad + " - " + contraseña);

    }

}

