import java.util.Scanner;

public class EjemploArreglosParesImpares {
    public static void main(String[] args) {
        int[] a, pares, impares;
        int totalPares = 0, totalImpares = 0;
        Scanner s = new Scanner(System.in);

        System.out.println("Ingresa 10 números enteros: ");
        a = new int[10];
        for(int i=0; i < a.length; i++){
            a[i] = s.nextInt();
        }

        for(int i=0; i < a.length; i++){
            if(a[i] %2 == 0){
                totalPares++;
            } else{
                totalImpares++;
            }
        }

        pares = new int[totalPares];
        impares = new int[totalImpares];

        int pos_pares = 0;
        int pos_impares = 0;

        for(int i=0; i < a.length; i++){
            if(a[i] %2 == 0){
                pares[pos_pares] = a[i];
                pos_pares++;
            } else{
                impares[pos_impares] = a[i];
                pos_impares++;
            }
        }

        System.out.println("Elementos pares: ");
        for(int i=0; i < pares.length; i++){
            System.out.println(pares[i]);
        }

        System.out.println("Elementos impares: ");
        for(int i=0; i < impares.length; i++){
            System.out.println(impares[i]);
        }




    }
}
