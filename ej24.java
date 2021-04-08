
package ej;

import java.util.Scanner;

public class ej24 {
    public static void main(String args[]) {
       double seccion, corriente, conductibilidad;
       Scanner e = new Scanner(System.in);
       System.out.println("Ingrese la conductibilidad");
       conductibilidad = e.nextDouble();
       System.out.println("Ingrese la corriente electrica");
       corriente = e.nextDouble();
       seccion = corriente/conductibilidad * 1.25;
       System.out.println("La seccion es de " + seccion);
    }
}
