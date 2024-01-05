import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class EjemploTimeLocalDate {
    public static void main(String[] args) {

        /*Dada una fecha límite de pago para una factura, se obtiene la fecha actual
        para comparar si la factura está vigente o está vencida. */

        LocalDate fechaActual = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(" Fecha actual = " + fechaActual.format(formatter) );

        LocalDate fechaLimitePago = LocalDate.parse(JOptionPane.showInputDialog(null, "Ingresa la fecha límite de pago en formato (dd-MM-yyyy): "), formatter);
        //LocalDate fechaLimitePago = LocalDate.of(1989, 1, 11);
        System.out.println(" Fecha límite de pago = " + fechaLimitePago.format(formatter) );

        if(fechaLimitePago.compareTo(fechaActual) < 0 ){
            JOptionPane.showMessageDialog(null, "La factura está vencida");
        }
        else if (fechaLimitePago.compareTo(fechaActual) >= 0 ) {
            JOptionPane.showMessageDialog(null, "La factura está dentro del plazo de crédito");

            if(fechaLimitePago.isEqual(fechaActual)){
                JOptionPane.showMessageDialog(null, "Sin embargo, vence hoy");
            }
        }
    }
}
