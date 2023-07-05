import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {
        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un numero entero");

        int numeroDecimal = 0;
        try{
            numeroDecimal = Integer.parseInt(numeroStr);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error! Ingrese un numero entero");
            main(args);
            System.exit(0);
        }


        String mensajeDecimal = "numeroDecimal = " + numeroDecimal;
        System.out.println(mensajeDecimal);



        String resultadoBinario = "convertido en binario = " + Integer.toBinaryString(numeroDecimal);
        System.out.println("convertido en binario = " + resultadoBinario);

        String resultadoOctal = "convertido en octal = " + Integer.toOctalString(numeroDecimal);
        System.out.println(resultadoOctal);

        String resultadoHexadecimal = "convertido en hexadecimal = " + Integer.toHexString(numeroDecimal);
        System.out.println(resultadoHexadecimal);

        String mensaje = mensajeDecimal;
        mensaje += "\r\n" + resultadoBinario;
        mensaje += "\r\n" + resultadoOctal;
        mensaje += "\r\n" + resultadoHexadecimal;
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
