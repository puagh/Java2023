public class SentenciasBucleEtiquetasBuscar {
    public static void main(String[] args) {
        String frase = "tres tres tres tristes tigres tragan trigo en un trigal";
        String palabra = "tres";

        int maxFrase = frase.length();
        int maxPalabra = palabra.length();
        char letra = 'g';
        int count = 0;

        buscar:
        for(int i = 0; i < maxFrase; i++){
            int k = i;
            for (int j = 0; j < maxPalabra; j++){
                if(frase.charAt(k++) != palabra.charAt(j)){
                    continue buscar;
                }
            }
            count++;
        }
        System.out.println(palabra + " = " + count);

    }
}
