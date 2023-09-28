import com.sun.source.tree.WhileLoopTree;

import java.util.Locale;
import java.util.Scanner;

public class parcial1_lab {
    public static void main(String[] args) {
        int opcion = 1;
        int count = 0;
        double var1, var2;
        int option2;
        var1 = 0;
        var2=0 ;
        double resultado=0;
        int c = 0;
        Scanner objeto = new Scanner(System.in);
        while (opcion == 1) {
            System.out.println("¿QUE OPERACION DESEA REALIZAR?");
            do {
                System.out.println("1) MULTIPLICACIÓN" + "\n" + "2)DIVISIÓN" + "\n" + "3)SUMA" + "\n" + "4)RESTA" + "\n");
                option2 = objeto.nextInt();
            }
            while (option2 != 1 && option2 != 2 && option2 != 3 && option2 != 4);
            if (option2 == 1) {

                if (count < 1) {
                    System.out.println("INGRESE LA PRIMER VARIABLE");
                    var1 = objeto.nextDouble();
                }
                System.out.println("INGRESE EL SEGUNDO NÚMERO: ");
                var2 = objeto.nextDouble();
                resultado = var2*var1;
                System.out.println("LA MULTIPLICACIÓN ES: " + var1 + " x " + var2 + " = " + resultado);

            } else if (option2 == 2) {

                if (count < 1) {
                    System.out.println("INGRESE LA PRIMER VARIABLE");
                    var1 = objeto.nextDouble();
                }
                do {
                    System.out.println("INGRESE EL SEGUNDO NÚMERO: ");
                    var2 = objeto.nextDouble();
                    if (var2 == 0) {
                        System.out.println("EL DIVISOR NO PUEDE SER 0 ");
                    }
                }
                while (var2 == 0);
                resultado = var1/var2;
                System.out.println("LA DIVISIÓN ES: " + var1 + " / " + var2 + " = " + resultado);

            }else if (option2 == 3) {

                if (count < 1) {
                    System.out.println("INGRESE LA PRIMER VARIABLE");
                    var1 = objeto.nextDouble();
                }

                    System.out.println("INGRESE EL SEGUNDO NÚMERO: ");
                    var2 = objeto.nextDouble();
                resultado = var1+var2;

                System.out.println("LA SUMA ES: " + var1 + " + " + var2 + " = " + resultado);

            }else if (option2 == 4) {

                if (count < 1) {
                    System.out.println("INGRESE LA PRIMER VARIABLE");
                    var1 = objeto.nextDouble();
                }
                    System.out.println("INGRESE EL SEGUNDO NÚMERO: ");
                    var2 = objeto.nextDouble();
                resultado = var1-var2;
                System.out.println("LA RESTA ES: " + var1 + " - " + var2 + " = " + resultado);

            }

            do {
                System.out.println("DESEA SEGUIR USANDO LA CALCULADORA?1)Si 2)No");
                opcion = objeto.nextInt();
            }while (opcion!=1 &&opcion!=2);
            if (opcion==2){
                System.out.println("ADIOS!!");
                break;
            }

            do {
                System.out.println("¿DESEA SEGUIR USANDO EL RESULTADO? 1) Si o 2)No:");
                c = (objeto.nextInt());
            }while(c!=1 && c!=0);


            if (c==1){
                count=1;
                var1 = resultado;
            } else if (c==0) {
                count+=0;

            }


        }
    }
}
