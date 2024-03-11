import java.util.Scanner;

public class EjemploArreglosNumeroMayor {
    public static void main(String[] args) {
        int[] a = new int[5];
        Scanner s = new Scanner(System.in);

        System.out.println("Ingresa un numero");
        for(int i=0; i < a.length; i++){
            a[i] = s.nextInt();
        }

        for(int aElement: a){
            System.out.println("aElement = " + aElement);
        }

        int max = 0;
        for(int i=0; i < a.length; i++){
            max = (a[max] > a[i])? max : i;
        }

        System.out.println("Número mayor = " + a[max]);

    }
}
