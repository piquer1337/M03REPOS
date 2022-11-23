/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adivinar_numero;

import java.util.Scanner;

/**
 *
 * @author sergi
 */
public class Adivinar_numero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int num;
        int hp = 0;
        int dmg = 0;
        int torre;
        int hp_torre = 0;
        int dmg_torre=0;
        
        do{
        System.out.println("Que nivel tiene el llenyataire? ");
        Thread.sleep(500);
        System.out.println("Escribe nivel: 9 - 10 - 11 - 12 - 13");
        num=sc.nextInt();
        }while(num<9 | num>13);
        
        if(num==9){
            hp=1060;
            dmg=200;
            System.out.println("Nivel 9: HP: "+hp+" DMG:" +dmg);
        
        }
        if(num==10){
            hp=1166;
            dmg=220;
            System.out.println("Nivel 10: HP: "+hp+" DMG:" +dmg);
        }
        if(num==11){
        
            hp=1282;
            dmg=242;
            System.out.println("Nivel 11: HP: "+hp+" DMG:" +dmg);
        }
        if(num==12){
        
            hp=1409;
            dmg=266;
            System.out.println("Nivel 12: HP: "+hp+" DMG:" +dmg);
        }
        if(num==13){
        
            hp=1547;
            dmg=292;
            System.out.println("Nivel 13: HP: "+hp+" DMG:" +dmg);
        }
        Thread.sleep(500);
        
        do{
        System.out.println("Escoge el nivel de la torre 1-2-3");
        
        torre=sc.nextInt();
        }while(torre<1 | torre>3);
        
        if(torre==1){
            hp_torre=1400;
            dmg_torre=50;
            System.out.println("Torre nivel 1");
        
        }
        if(torre==2){
            hp_torre=1512;
            dmg_torre=54;
            System.out.println("Torre nivel 2");
        
        }
        if(torre==3){
            hp_torre=1624;
            dmg_torre=58;
            System.out.println("Torre nivel 3");
        
        }
        System.out.println("Empieza el combate");
        int duelo=dmg-hp_torre;
        Thread.sleep(500);
        int turnos=0;
        do{
            Thread.sleep(500);
            turnos++;
            hp_torre=hp_torre-dmg;
            hp=hp-(dmg_torre*2);
            System.out.println("Lenyataire ataca con " +dmg+ " de dmg a la Torre! ");
            System.out.println("Le queda a la torre= "+hp_torre+"LIFEPOINTS");
            System.out.println("Le queda al Lenyataire = "+hp+"LIFEPOINTS");
            
        }while(hp_torre>0 && hp>0);
        Thread.sleep(500);
        
        if(hp<=0){
        System.out.println("La torre ha eliminado al Llenyataire");}
        else if(hp_torre<=0){
            System.out.println("Enhorabuena!, El llenyataire a eliminado la torreta");
        }
        
        System.out.println("Ha necesitado " + turnos + " golpes para eliminarlo!");
        
        
    }
    
}
