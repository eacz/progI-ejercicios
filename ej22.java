package ej;

import java.util.Scanner;

public class ej22 {
    public static void main(String args[]) {
       Scanner e = new Scanner(System.in);
       int examen1,examen2,concepto;
       examen1 = e.nextInt();
       examen2 = e.nextInt();
       concepto = e.nextInt();
       double notaFinal = examen1*0.3+examen2*0.5+concepto*0.2;
       System.out.println(notaFinal);
    }
}
