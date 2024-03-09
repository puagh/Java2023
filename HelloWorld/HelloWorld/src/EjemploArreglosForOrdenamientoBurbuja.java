public class EjemploArreglosForOrdenamientoBurbuja {
    public static void main(String[] args) {

        String []productos = new String[7];

        productos[0] = "RTX 4900";
        productos[1] = "Monitor AOC";
        productos[2] = "Gabinete Thermaltake";
        productos[3] = "Ratón Gamer";
        productos[4] = "Teclado Gamer";
        productos[5] = "Silla Gamer";
        productos[6] = "Anteojos gamer";

        int total = productos.length;

        int contador = 0;
        for(int i = 0; i < total; i++){
            for(int j = 0; j < total -1- i; j++){
                if(productos[j+1].compareTo(productos[j]) < 0){
                    String auxiliar = productos[j];
                    productos[j] = productos[j+1];
                    productos[j+1] = auxiliar;
                }
                contador++;
            }
        }

        // Imprimiendo el contenido del arreglo, ordenado mediante el algoritmo de burbuja
        for(String producto: productos){
            System.out.println(producto);
        }

    }
}
