import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("date = " + date);
        SimpleDateFormat dateFormat = new SimpleDateFormat("'fecha: 'dd-MM-yyyy', hora:' K:mm:s a");
        String fechaStr = dateFormat.format(date);
        System.out.println(fechaStr);

        long j = 0;
        for(int i = 0; i < 10000000; i++){
            j += i;
        }

        System.out.println("j = " + j);

        Date date2 = new Date();
        long tiempoFinal = date2.getTime() - date.getTime();

        System.out.println("Tiempo transcurrido = " + tiempoFinal + "ms");


    }
}
