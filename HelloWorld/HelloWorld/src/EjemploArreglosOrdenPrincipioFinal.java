public class EjemploArreglosOrdenPrincipioFinal {
    public static void main(String[] args) {
        int [] numeros = new int[10];

        for(int i = 0; i < numeros.length; i++){
            numeros[i] = i + 1;
        }

        for(int i = 0; i < numeros.length; i++){
            while (i < numeros.length/2){
                System.out.println("Pareja " + (i + 1));
                System.out.println(numeros[i]);
                System.out.println(numeros[numeros.length - 1 - i]);
                System.out.println("----------------");
                i++;
            }
        }

    }
}
