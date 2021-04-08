package ej;

import java.util.Scanner;

public class ej30 {
    public static void main(String args[]) {
        int potencia=0;
        Scanner e = new Scanner(System.in);
        System.out.println("Ingrese la base");
        int base = e.nextInt();
        System.out.println("Ingrese el exponente");
        int exponente = e.nextInt();
        if(exponente == 0) {
            potencia = 1;
        } else {
            potencia= base;
            for (int i=1; i < exponente; i++) {
                potencia*=base;
            }
        }
        System.out.println("El resultado es: " + potencia);
    }
}
