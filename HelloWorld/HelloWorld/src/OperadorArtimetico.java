import javax.swing.*;

public class OperadorArtimetico {
    public static void main(String[] args) {
        int i = 8, j = 5;
        int suma = i + j;
        System.out.println("suma = " + suma);

        int resta = i - j;
        System.out.println("resta = " + resta);

        int multi = i * j;
        System.out.println("multi = " + multi);
        
        int division = i / j;
        System.out.println("division = " + division);

        float division2 = (float)i / (float)j ;
        System.out.println("division2 = " + division2);

        int resto = i % j;
        System.out.println("resto = " + resto);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        if(numero % 2 == 0){
            JOptionPane.showMessageDialog(null, "El número es par");
        } else{
            JOptionPane.showMessageDialog(null, "El número es impar");
        }
    }
}
