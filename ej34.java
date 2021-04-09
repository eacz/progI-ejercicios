package ej;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ej34 {
    public static void main(String args[]) {
       Scanner e = new Scanner(System.in);
       Date diaActual = new Date();
       System.out.println("Ingrese su fecha de nacimiento en el formato dd/mm/aaaa");
       String fechaNacimientoSTR = e.nextLine();
        try {
            Date fechaNacimiento = new SimpleDateFormat("dd/MM/yyyy").parse(fechaNacimientoSTR);
            long diferenciaMS = diaActual.getTime() -fechaNacimiento.getTime();
            System.out.println(new Date(diferenciaMS));
        } catch (ParseException ex) {
            Logger.getLogger(ej34.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
