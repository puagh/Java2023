import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: \r");
        //String numeroStr = scanner.nextLine();
        int numeroDecimal = 0;
        try{
            numeroDecimal = scanner.nextInt();
        } catch (InputMismatchException e){
            System.out.println("Error! Ingrese un numero entero");
            main(args);
            System.exit(0);
        }

        String mensajeDecimal = "numeroDecimal = " + numeroDecimal;
        String resultadoBinario = "convertido en binario = " + Integer.toBinaryString(numeroDecimal);
        String resultadoOctal = "convertido en octal = " + Integer.toOctalString(numeroDecimal);
        String resultadoHexadecimal = "convertido en hexadecimal = " + Integer.toHexString(numeroDecimal);

        String mensaje = mensajeDecimal;
        mensaje += "\r\n" + resultadoBinario;
        mensaje += "\r\n" + resultadoOctal;
        mensaje += "\r\n" + resultadoHexadecimal;

        System.out.println(mensaje);
    }
}
