package ej;
import java.util.Scanner;
public class ej26 {
    public static void main(String args[]) {
        Scanner e = new Scanner(System.in);
        int destino = e.nextInt();
       
        if(destino >0 && destino <8){ 
            double precioAPagar;
            switch(destino){
            case 1:
                precioAPagar = 2;
                break;
            case 2:
                precioAPagar = 2*1.15;
                break;
            case 3:
                precioAPagar = 2*1.30;
                break;
            case 4:
                precioAPagar = 2*1.45;
                break;
            case 5:
                precioAPagar = 2*1.60;
                break;
            case 6:
                precioAPagar = 2*1.75;
                break;
            case 7:
                precioAPagar = 2*1.90;
                break;
        }
        } else {
            System.out.println("Opción inválida");
        }
       
    }
}
