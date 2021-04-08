package ej;

import java.util.Scanner;

public class ej28 {
    public static void main(String args[]) {
        Scanner e = new Scanner(System.in);
        int anioNac, diaNac=0, mesNac=0, anioAct, diaAct=0, mesAct=0, edad;
        // fecha de nacimento
        while(diaNac <= 0 || diaNac > 31) {
            System.out.println("Ingrese su dia de nacimiento"); 
            diaNac = e.nextInt();
        }
        while(mesNac <= 0 || mesNac > 12) {
            System.out.println("Ingrese su mes de nacimiento");
            mesNac = e.nextInt();
        }
        System.out.println("Ingrese su año de nacimiento");
        anioNac = e.nextInt();
        
        // fecha actual
        while (diaAct <= 0 || diaAct > 31){
            System.out.println("Ingrese el dia actual");
            diaAct = e.nextInt();
        }
        while (mesAct <= 0 || mesAct > 12){
            System.out.println("Ingrese el mes actual");
            mesAct = e.nextInt();
        }

        System.out.println("Ingrese el año actual");
        anioAct = e.nextInt();
        
        edad = anioAct - anioNac;
        
        if(mesNac > mesAct || (mesNac == mesAct && diaNac < diaAct)) {
           edad--;
        }
        
        System.out.println("Su edad es: " + edad);
    }
}
