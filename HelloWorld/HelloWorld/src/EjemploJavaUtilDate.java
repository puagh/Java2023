import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("date = " + date);
        SimpleDateFormat dateFormat = new SimpleDateFormat("'fecha: 'dd-MM-yyyy', hora:' K:mm:s a");
        String fechaStr = dateFormat.format(date);
        System.out.println(fechaStr);
    }
}
