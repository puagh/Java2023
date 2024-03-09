import java.util.Arrays;

public class EjemploArreglos {
    public static void main(String[] args) {

        String []productos = new String[7];

        productos[0] = "Memoria USB";
        productos[1] = "Monitor AOC";
        productos[2] = "Gabinete Thermaltake";
        productos[3] = "Ratón Gamer";
        productos[4] = "Teclado Gamer";
        productos[5] = "Silla Gamer";
        productos[6] = "RTX 4900";

        Arrays.sort(productos);

        int i = 0;
        for(String producto: productos){
            //numero = (int) (Math.random() * 10) +1;

            System.out.println("producto en posición " + i + " = " + producto);
            i++;
        }

    }
}
