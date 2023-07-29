import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Aplicacion de Calculadora");
        System.out.println("1. Suma \n2.Resta \n3.Multiplicacion \n4.Division \n5.Salir");
        System.out.println("Ingrese la opcion deseada: ");
        byte opcion = s.nextByte();
        System.out.println("opcion = " + opcion);

        if(opcion >= 1 && opcion <=4){

            switch (opcion){
                case 1:

            }


            System.out.println("Proporciona el valor del operando 1:");
            double operando1 = s.nextDouble();
            System.out.println("Proporciona el valor del operando 2:");
            double operando2 = s.nextDouble();
            double resultado = operando1 + operando2;
            System.out.println("resultado = " + resultado);
        } else{
            main(args);
            System.exit(0);
        }
    }
}
