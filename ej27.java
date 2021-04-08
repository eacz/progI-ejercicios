package ej;

import java.util.Scanner;

public class ej27 {
     public static void main(String args[]) {
         Scanner e = new Scanner(System.in);
         String fechaFormateada;
         int mes,dia,anio;
         System.out.println("Ingrese el día: ");
         dia = e.nextInt();
         System.out.println("Ingrese el mes: ");
         mes = e.nextInt();
         System.out.println("Ingrese el año: ");
         anio = e.nextInt();
         if (dia > 0 && dia < 32) {
             fechaFormateada = String.valueOf(dia) + " de ";
             if(mes > 0 && mes < 13) {
                 switch(mes){
                     case 1:
                         fechaFormateada+="Enero";
                         break;
                     case 2:
                         fechaFormateada+="Febrero";
                         break;
                     case 3:
                         fechaFormateada+="Marzo";
                         break;
                     case 4:
                         fechaFormateada+="Abril";
                         break;
                     case 5:
                         fechaFormateada+="Mayo";
                         break;
                     case 6:
                         fechaFormateada+="Junio";
                         break;
                     case 7:
                         fechaFormateada+="Julio";
                         break;
                     case 8:
                         fechaFormateada+="Agosto";
                         break;
                     case 9:
                         fechaFormateada+="Septiembre";
                         break;
                     case 10:
                         fechaFormateada+="Octubre";
                         break;
                     case 11:
                         fechaFormateada+="Noviembre";
                         break;
                     case 12:
                         fechaFormateada+="Diciembre";
                         break;
                 }
                 fechaFormateada+= " " + anio;
                 System.out.println("La fecha es " + fechaFormateada);
             } else {
                 System.out.println("Mes inválido");
             }
         } else {
             System.out.println("Día inválido");
         }
    }
}
