
package ej;

import java.util.Scanner;

public class ej17 {

    public static void main(String args[]) {
        Scanner e = new Scanner(System.in);
       int a,b,c,d;
       a = e.nextInt();
       b = e.nextInt();
       c = e.nextInt();
       d = e.nextInt();
       
       if (a>b && a>c && a>d){
           System.out.println(a + " es mayor");
       } else if (b>a && b>c && b>d){
           System.out.println(b + " es mayor");
       } else if (c>a && c>b && c>d){
           System.out.println(c + " es mayor");
       } else if (d>a && d>b && d>c) {
           System.out.println(d + " es mayor");
       }
    }
}
