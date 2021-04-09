package ej;

import java.util.Scanner;

public class ej31 {
    public static void main(String args[]) {
        double potencia=0;
        Scanner e = new Scanner(System.in);
        System.out.println("Ingrese la base");
        double base = e.nextInt();
        System.out.println("Ingrese el exponente");
        double exponente = e.nextInt();
        potencia = Math.pow(base, exponente);
        System.out.println("El resultado es: " + potencia);
    }
}
