import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class EjemploAsignarPropiedadesDeSistema {
    public static void main(String[] args) {
        try {
            FileInputStream archivo = new FileInputStream( "src/config.properties");
            Properties p = new Properties(System.getProperties());
            p.load(archivo);
            p.setProperty("propiedad.agregada","valor de propiedad");

            System.setProperties(p);
            p.list(System.out);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
