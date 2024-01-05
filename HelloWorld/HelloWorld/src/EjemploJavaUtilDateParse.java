import javax.print.attribute.standard.JobKOctets;
import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {
    public static void main(String[] args) {

        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        try {

            Date fecha = format.parse(JOptionPane.showInputDialog("Ingresa una fecha en formato dd-mm-aaaa"));
            JOptionPane.showMessageDialog(null, "Fecha ingresada: " + fecha);
            //System.out.println("fecha = " + fecha);
            JOptionPane.showMessageDialog(null, "Fecha ingresada en formato dd-mm-aaaa: " + format.format(fecha));
            //System.out.println("format = " + format.format(fecha));

            Date fechaActual = new Date();
            /*if(fecha.after(fechaActual)){
                JOptionPane.showMessageDialog(null, "Fecha es después de la fecha actual " + format.format(fechaActual));
                //System.out.println("Fecha es después que la fecha actual");
            } else if(fecha.before(fechaActual)){
                JOptionPane.showMessageDialog(null, "Fecha es anterior a la fecha actual " + format.format(fechaActual));
                //System.out.println("Fecha es anterior que la fecha actual");
            } else {
                JOptionPane.showMessageDialog(null, "Las fechas son iguales");
                //System.out.println("Las fechas son iguales");
            }*/

            if (fecha.compareTo(fechaActual) > 0){
                JOptionPane.showMessageDialog(null, "Fecha es después de la fecha actual " + format.format(fechaActual));
            } else if (fecha.compareTo(fechaActual) < 0) {
                JOptionPane.showMessageDialog(null, "Fecha es anterior a la fecha actual " + format.format(fechaActual));
            }
            else {
                JOptionPane.showMessageDialog(null, "Las fechas son iguales");
            }
        } catch (ParseException e) {
            //throw new RuntimeException(e);
            JOptionPane.showMessageDialog(null, "Por favor ingresa nuevamente la fecha en el formato correcto");
        }

    }
}
