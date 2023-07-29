import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean appActiva = true;
        while(appActiva){

            mostrarMenu();

            try{
                byte opcion = s.nextByte();

                if(opcion >= 1 && opcion <5){

                    ejecutarOperacion(opcion, s);

                } else if(opcion == 5){
                    System.out.println("Saliendo del programa ... Bye");
                    appActiva = false;
                }

            } catch(InputMismatchException e){
                System.out.println("Opcion erronea, introduzca un numero del 1 al 5");
                main(args);
                System.exit(0);
            }
        }
    }

    private static void mostrarMenu(){
        System.out.println("Aplicacion de Calculadora");
        System.out.println("1.Suma \n2.Resta \n3.Multiplicacion \n4.Division \n5.Salir");
        System.out.println("Ingrese la opcion deseada: ");
    }

    private static void ejecutarOperacion(byte opcion, Scanner s){
        double operando1, operando2, resultado = 0.0;
        String signo = "";

        System.out.println("Proporciona el valor del operando 1:");
        operando1 = s.nextDouble();
        System.out.println("Proporciona el valor del operando 2:");
        operando2 = s.nextDouble();

        switch (opcion){
            case 1 -> {
                resultado = operando1 + operando2;
                signo = " + ";
            }

            case 2 -> {
                resultado = operando1 - operando2;
                signo = " - ";
            }

            case 3 -> {
                resultado = operando1 * operando2;
                signo = " x ";
            }

            case 4 -> {
                resultado = operando1 / operando2;
                signo = " / ";
            }

        }

        System.out.println("opcion = " + opcion);
        System.out.println(operando1 + signo + operando2 + " = " + resultado);
        System.out.println("\n");
    }

}
