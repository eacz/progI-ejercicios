
package ej;

import java.util.Scanner;


public class ej15 {
    public static void main(String args[]) {
       Scanner e = new Scanner(System.in);
       int a,b,c;
       a = e.nextInt();
       b = e.nextInt();
       c = e.nextInt();
       if(a==c && b==c){
           System.out.println("Equilatero");
       } else if(a==b || b==a || c==a || c==b) {
           System.out.println("Escaleno");
       } else {
           System.out.println("Isosceles");
       }
    }
}