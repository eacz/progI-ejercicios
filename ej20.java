
package ej;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ej20 {
    public static void main(String args[]) {
        Scanner e = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        int a,b,c;
        a = e.nextInt();
        b = e.nextInt();
        c = e.nextInt();
        numeros.add(a);
        numeros.add(b);
        numeros.add(c);
        Collections.sort(numeros);
        Collections.reverse(numeros);
        System.out.println(numeros.toString());
}
}
