
package ej;

import java.util.Scanner;

public class ej18 {

    public static void main(String args[]) {
       Scanner e = new Scanner(System.in);
       int meriendaOp, azucarOp;
       String merienda="", azucar="";
       System.out.println("Que desea tomar? 1-café\n2-café con leche\n3-té\n4-té con leche");
       meriendaOp = e.nextInt();
       if(meriendaOp>0 && meriendaOp < 5){
           System.out.println("Cuantas cucharadas de azúcar quiere? 1-3");
           azucarOp = e.nextInt();
           switch(azucarOp){
               case 1:
                   azucar="una cucharada";
                   break;
               case 2:
                   azucar="dos cucharadas";
                   break;
               case 3:
                   azucar="tres cucharadas";
                   break;
               default:
                   azucar="";
           }
           switch(meriendaOp){
                case 1:
                   merienda="Café";
                   break;
               case 2:
                   merienda="Café con leche";
                   break;
               case 3:
                   merienda="Té";
                   break;
               case 4:
                   merienda="Té con leche";
                    break;
           }
           System.out.print("Usted ha ordenado: "+ merienda);
           if(azucar != ""){
               System.out.print(" con "+ azucar + " de azúcar"); 
           }
       } else {
           System.out.println("Opción invalida");
       }
    }
}
