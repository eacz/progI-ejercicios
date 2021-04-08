
package ej;

import java.util.Scanner;

public class ej21 {
    public static void main(String args[]) {
      Scanner e = new Scanner(System.in);
      System.out.println("Ingrese los votos del partido 1");
      int partido1  = e.nextInt();
      System.out.println("Ingrese los votos del partido 2");
      int partido2  = e.nextInt();
      System.out.println("Ingrese los votos del partido 3");
      int partido3  = e.nextInt();
      System.out.println("Ingrese los votos del partido 4");
      int partido4 = e.nextInt();
      System.out.println("Ingrese los votos del partido 5");
      int partido5  = e.nextInt();
      System.out.println("Ingrese los votos indecisos");
      int indecisos  = e.nextInt();
      int votosTotales = partido1+partido2+partido3+partido4+partido5+indecisos;
      System.out.println("El porcentaje del partido 1 es "+ (partido1*100/votosTotales) + "%");
      System.out.println("El porcentaje del partido 2 es "+ (partido2*100/votosTotales) + "%");
      System.out.println("El porcentaje del partido 3 es "+ (partido3*100/votosTotales) + "%");
      System.out.println("El porcentaje del partido 4 es "+ (partido4*100/votosTotales) + "%");
      System.out.println("El porcentaje del partido 5 es "+ (partido5*100/votosTotales) + "%");
      System.out.println("El porcentaje del indecisos es "+ (indecisos*100/votosTotales) + "%");
    }
}
