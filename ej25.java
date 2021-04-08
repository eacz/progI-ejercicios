package ej;

import java.util.Scanner;

public class ej25 {
    public static void main(String args[]) {
        Scanner e = new Scanner(System.in);
        System.out.println("Ingrese la distancia que ha recorrido");
        int distancia  = e.nextInt();
        int precioAPagar;
        if(distancia>=80){
            precioAPagar = distancia*5;
        } else if(distancia>=40){
            precioAPagar = distancia*4;
        } else if(distancia>=20){
            precioAPagar = distancia*3;
        } else {
            precioAPagar = distancia*2;
        }
        System.out.println("El precio a pagar es: " + precioAPagar +"$");
    }
}
