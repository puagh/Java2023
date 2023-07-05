import javax.swing.*;

public class IngresosJOptionPane {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Vamos a calcula el perimetro y el area de un cuadrado, comencemos ...");
        String ingresoLargo = JOptionPane.showInputDialog("Ingresa el lado de la figura");
        float ladoFigura = 0;
        try{
            ladoFigura = Float.parseFloat(ingresoLargo);
            System.out.println("ladoFigura = " + ladoFigura);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Debes ingresar un valor numerico valido");
            main(args);
            System.exit(0);
        }

        String mensaje = "El cuadrado con lado de: " + ladoFigura + "u";
        mensaje += "\r\nTiene un perimetro de: " + (ladoFigura * 4) + "u";
        mensaje += "\r\nTiene un area de: " + (ladoFigura * ladoFigura + "u");

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
