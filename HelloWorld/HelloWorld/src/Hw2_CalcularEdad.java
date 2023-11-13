import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Hw2_CalcularEdad {
    public static void main(String[] args) {

        //1 Ingresar fecha dew nacimiento string
        //2 Convertir la fecha a fecha del tipo java.util.Date
        //3 Calcular edad de acuerdo a la fecha actual

        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        Scanner s = new Scanner(System.in);

        try {

            System.out.println("Ingresa tu fecha de nacimiento en formato 'dd-MM-yyyy': ");
            Date fechaNacimiento = formato.parse(s.next());

            Calendar calendarioFechaNacimiento = Calendar.getInstance();
            calendarioFechaNacimiento.setTime(fechaNacimiento);
            System.out.println("anio de nacimiento = " + calendarioFechaNacimiento.get(Calendar.YEAR));

            //3
            //Fecha actual
            Date fechaActual = new Date();
            Calendar calendarioFechaActual = Calendar.getInstance();
            calendarioFechaActual.setTime(fechaActual);
            short cumple = 0;

            int anios_cumplidos = calendarioFechaActual.get(Calendar.YEAR) - calendarioFechaNacimiento.get(Calendar.YEAR);

            // Verificar si ya cumplio anios este anio
            if(calendarioFechaActual.get(Calendar.MONTH) <= calendarioFechaNacimiento.get(Calendar.MONTH)) {
                if(calendarioFechaActual.get(Calendar.DAY_OF_MONTH) > calendarioFechaNacimiento.get(Calendar.DAY_OF_MONTH) && anios_cumplidos != 0){
                    cumple = -1;
                }
            }
            System.out.println("Anios cumplidos = " + anios_cumplidos);


            System.out.println("fechaActual = " + fechaActual);


        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}
