package ej;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ej35 {
    public static void main(String args[]) {
        Scanner e = new Scanner(System.in);
        int n;
        Integer[] nros = new Integer[4];
        for (int i = 0; i < 4; i++) {
            n = e.nextInt();
            nros[i] = n;
        }
        Arrays.sort(nros, Collections.reverseOrder());
        System.out.println(Arrays.toString(nros));
    }
}
