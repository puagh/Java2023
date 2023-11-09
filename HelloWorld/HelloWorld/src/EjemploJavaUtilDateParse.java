import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {
    public static void main(String[] args) {

        System.out.println("Ingrese la fecha de alta (dd-MM-yyyy): ");
        Scanner s = new Scanner(System.in);

        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

        try {
            Date fecha = format.parse(s.next());
            System.out.println("fecha = " + fecha);
            System.out.println("format = " + format.format(fecha));

            Date fecha2 = new Date();
            if(fecha.after(fecha2)){
                System.out.println("Fecha del usuario es despues que la fecha actual");
            } else if (fecha.before(fecha2)) {
                System.out.println("Fecha del usuario es antes que la fecha actual");
            } else if (fecha.equals(fecha2)) {
                System.out.println("Las fechas son iguales");
            }

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
