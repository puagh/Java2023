public class SentenciaForEach {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int numero: numeros){
            System.out.println("numero = " + numero);
        }

        String[] nombres = {"Andres", "Lalo", "Chort", "Lapa", "Namo"};
        for(String nombre: nombres){
            System.out.println("nombre = " + nombre);
        }

    }
}
